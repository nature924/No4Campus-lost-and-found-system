package com.dao;

import com.entity.CaozuorizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaozuorizhiView;

/**
 * 操作日志 Dao 接口
 *
 * @author 
 */
public interface CaozuorizhiDao extends BaseMapper<CaozuorizhiEntity> {

   List<CaozuorizhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
