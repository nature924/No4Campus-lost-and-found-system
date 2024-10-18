package com.dao;

import com.entity.ShiwuzhaolingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuzhaolingView;

/**
 * 失物信息 Dao 接口
 *
 * @author 
 */
public interface ShiwuzhaolingDao extends BaseMapper<ShiwuzhaolingEntity> {

   List<ShiwuzhaolingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
