
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 寻物启事
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xunwuqishi")
public class XunwuqishiController {
    private static final Logger logger = LoggerFactory.getLogger(XunwuqishiController.class);

    private static final String TABLE_NAME = "xunwuqishi";

    @Autowired
    private XunwuqishiService xunwuqishiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private CaozuorizhiService caozuorizhiService;//操作日志
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private LiuyanService liuyanService;//留言板
    @Autowired
    private NewsService newsService;//公告信息
    @Autowired
    private ShiwuzhaolingService shiwuzhaolingService;//失物信息
    @Autowired
    private ShiwuzhaolingYuyueService shiwuzhaolingYuyueService;//失物认领
    @Autowired
    private XunwuqishiLiuyanService xunwuqishiLiuyanService;//寻物启事留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = xunwuqishiService.queryPage(params);

        //字典表数据转换
        List<XunwuqishiView> list =(List<XunwuqishiView>)page.getList();
        for(XunwuqishiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"列表查询",list.toString());
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XunwuqishiEntity xunwuqishi = xunwuqishiService.selectById(id);
        if(xunwuqishi !=null){
            //entity转view
            XunwuqishiView view = new XunwuqishiView();
            BeanUtils.copyProperties( xunwuqishi , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(xunwuqishi.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
    caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"单条数据查看",view.toString());
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XunwuqishiEntity xunwuqishi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xunwuqishi:{}",this.getClass().getName(),xunwuqishi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            xunwuqishi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<XunwuqishiEntity> queryWrapper = new EntityWrapper<XunwuqishiEntity>()
            .eq("xunwuqishi_name", xunwuqishi.getXunwuqishiName())
            .eq("shiwuzhaoling_types", xunwuqishi.getShiwuzhaolingTypes())
            .eq("zhaohuizhuangtai_types", xunwuqishi.getZhaohuizhuangtaiTypes())
            .eq("yonghu_id", xunwuqishi.getYonghuId())
            .eq("xunwuqishi_dizhi", xunwuqishi.getXunwuqishiDizhi())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XunwuqishiEntity xunwuqishiEntity = xunwuqishiService.selectOne(queryWrapper);
        if(xunwuqishiEntity==null){
            xunwuqishi.setCreateTime(new Date());
            xunwuqishiService.insert(xunwuqishi);
            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"新增",xunwuqishi.toString());
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XunwuqishiEntity xunwuqishi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,xunwuqishi:{}",this.getClass().getName(),xunwuqishi.toString());
        XunwuqishiEntity oldXunwuqishiEntity = xunwuqishiService.selectById(xunwuqishi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            xunwuqishi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(xunwuqishi.getXunwuqishiPhoto()) || "null".equals(xunwuqishi.getXunwuqishiPhoto())){
                xunwuqishi.setXunwuqishiPhoto(null);
        }

            xunwuqishiService.updateById(xunwuqishi);//根据id更新
            List<String> strings = caozuorizhiService.clazzDiff(xunwuqishi, oldXunwuqishiEntity, request,new String[]{"updateTime"});
            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"修改",strings.toString());
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<XunwuqishiEntity> oldXunwuqishiList =xunwuqishiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        xunwuqishiService.deleteBatchIds(Arrays.asList(ids));

        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"删除",oldXunwuqishiList.toString());
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<XunwuqishiEntity> xunwuqishiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XunwuqishiEntity xunwuqishiEntity = new XunwuqishiEntity();
//                            xunwuqishiEntity.setXunwuqishiName(data.get(0));                    //物品名称 要改的
//                            xunwuqishiEntity.setShiwuzhaolingTypes(Integer.valueOf(data.get(0)));   //物品类型 要改的
//                            xunwuqishiEntity.setZhaohuizhuangtaiTypes(Integer.valueOf(data.get(0)));   //找回状态 要改的
//                            xunwuqishiEntity.setXunwuqishiPhoto("");//详情和图片
//                            xunwuqishiEntity.setXunwuqishiTime(sdf.parse(data.get(0)));          //丢失时间 要改的
//                            xunwuqishiEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            xunwuqishiEntity.setXunwuqishiDizhi(data.get(0));                    //丢失地址 要改的
//                            xunwuqishiEntity.setXunwuqishiContent("");//详情和图片
//                            xunwuqishiEntity.setCreateTime(date);//时间
                            xunwuqishiList.add(xunwuqishiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xunwuqishiService.insertBatch(xunwuqishiList);
                        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"批量新增",xunwuqishiList.toString());
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = xunwuqishiService.queryPage(params);

        //字典表数据转换
        List<XunwuqishiView> list =(List<XunwuqishiView>)page.getList();
        for(XunwuqishiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"列表查询",list.toString());
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XunwuqishiEntity xunwuqishi = xunwuqishiService.selectById(id);
            if(xunwuqishi !=null){


                //entity转view
                XunwuqishiView view = new XunwuqishiView();
                BeanUtils.copyProperties( xunwuqishi , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(xunwuqishi.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                    caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"单条数据查看",view.toString());
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XunwuqishiEntity xunwuqishi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xunwuqishi:{}",this.getClass().getName(),xunwuqishi.toString());
        Wrapper<XunwuqishiEntity> queryWrapper = new EntityWrapper<XunwuqishiEntity>()
            .eq("xunwuqishi_name", xunwuqishi.getXunwuqishiName())
            .eq("shiwuzhaoling_types", xunwuqishi.getShiwuzhaolingTypes())
            .eq("zhaohuizhuangtai_types", xunwuqishi.getZhaohuizhuangtaiTypes())
            .eq("yonghu_id", xunwuqishi.getYonghuId())
            .eq("xunwuqishi_dizhi", xunwuqishi.getXunwuqishiDizhi())
//            .notIn("xunwuqishi_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XunwuqishiEntity xunwuqishiEntity = xunwuqishiService.selectOne(queryWrapper);
        if(xunwuqishiEntity==null){
            xunwuqishi.setCreateTime(new Date());
        xunwuqishiService.insert(xunwuqishi);

            caozuorizhiService.insertCaozuorizhi(String.valueOf(request.getSession().getAttribute("role")),TABLE_NAME,String.valueOf(request.getSession().getAttribute("username")),"前台新增",xunwuqishi.toString());
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

