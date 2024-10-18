package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.CaozuorizhiDao;
import com.entity.CaozuorizhiEntity;
import com.service.CaozuorizhiService;
import com.entity.view.CaozuorizhiView;

/**
 * 操作日志 服务实现类
 */
@Service("caozuorizhiService")
@Transactional
public class CaozuorizhiServiceImpl extends ServiceImpl<CaozuorizhiDao, CaozuorizhiEntity> implements CaozuorizhiService {

    @Autowired
    private DictionaryService dictionaryService;

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<CaozuorizhiView> page =new Query<CaozuorizhiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

    @Override
    public void insertCaozuorizhi(String caozuorizhiThisBiao,String caozuorizhiCaozuobiao,String caozuorizhiCaozuozhanghu,String caozuorizhiCaozuoleixing,String caozuorizhiText) {

        CaozuorizhiEntity caozuorizhiEntity = new CaozuorizhiEntity();
        caozuorizhiEntity.setInsertTime(new Date());
        caozuorizhiEntity.setCreateTime(new Date());
        caozuorizhiEntity.setCaozuorizhiThisBiao(caozuorizhiThisBiao);
        caozuorizhiEntity.setCaozuorizhiCaozuobiao(caozuorizhiCaozuobiao);
        caozuorizhiEntity.setCaozuorizhiCaozuoleixing(caozuorizhiCaozuoleixing);
        caozuorizhiEntity.setCaozuorizhiCaozuozhanghu(caozuorizhiCaozuozhanghu);
        caozuorizhiEntity.setCaozuorizhiText(caozuorizhiText);
        this.insert(caozuorizhiEntity);
    }

    public List<String> clazzDiff(Object obj1, Object obj2, HttpServletRequest request, @Nullable String... ignoreProperties) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Assert.notNull(obj1, "obj1不是空的");
        Assert.notNull(obj2, "obj2不是空的");

        Assert.isTrue(obj1.getClass().getName().contains("Entity"), "obj1类名不包含'Entity'");
        Assert.isTrue(obj2.getClass().getName().contains("Entity"), "obj2类名不包含'Entity'");


        Class ojb1Class = Class.forName("com.entity.view." + obj1.getClass().getSimpleName().replace("Entity", "View"));
        Class obj2Class = Class.forName("com.entity.view." + obj2.getClass().getSimpleName().replace("Entity", "View"));
        Object ojb1Object = ojb1Class.newInstance();
        Object ojb2Object = obj2Class.newInstance();

        BeanUtils.copyProperties( obj1 , ojb1Object);
        BeanUtils.copyProperties( obj2 , ojb2Object);
        dictionaryService.dictionaryConvert(ojb1Object, request);
        dictionaryService.dictionaryConvert(ojb2Object, request);
        ClazzDiff clazzDiff = new ClazzDiff();
        return clazzDiff.ClazzDiffColumn(ojb1Object, ojb2Object,ignoreProperties);
        }

}
