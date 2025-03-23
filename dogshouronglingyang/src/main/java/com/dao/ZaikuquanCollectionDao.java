package com.dao;

import com.entity.ZaikuquanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaikuquanCollectionView;

/**
 * 犬收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-12
 */
public interface ZaikuquanCollectionDao extends BaseMapper<ZaikuquanCollectionEntity> {

   List<ZaikuquanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
