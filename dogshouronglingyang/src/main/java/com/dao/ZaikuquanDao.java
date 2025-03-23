package com.dao;

import com.entity.ZaikuquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaikuquanView;

/**
 * 在库犬 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface ZaikuquanDao extends BaseMapper<ZaikuquanEntity> {

   List<ZaikuquanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
