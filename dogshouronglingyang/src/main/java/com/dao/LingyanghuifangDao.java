package com.dao;

import com.entity.LingyanghuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyanghuifangView;

/**
 * 领养回访 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface LingyanghuifangDao extends BaseMapper<LingyanghuifangEntity> {

   List<LingyanghuifangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
