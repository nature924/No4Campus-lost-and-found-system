package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaozuorizhiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import java.util.List;

/**
 * 操作日志 服务类
 */
public interface CaozuorizhiService extends IService<CaozuorizhiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

    /**
    * 新增日志
    * @param rizhiThisBiao 所在表
    * @param rizhiCaozuobiao 操作表
    * @param rizhiCaozuozhanghu 账户
    * @param rizhiCaozuoleixing 操作类型
    * @param rizhiText 备注
    * @return
    */
     void insertCaozuorizhi(String rizhiThisBiao,String rizhiCaozuobiao,String rizhiCaozuozhanghu,String rizhiCaozuoleixing,String rizhiText);


    /**
    * 比对两个对象之间的差异
    * @param obj1 对象1
    * @param obj2 对象2
    * @return
    */
     List<String> clazzDiff(Object obj1, Object obj2, HttpServletRequest request, @Nullable String... ignoreProperties) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException;

}