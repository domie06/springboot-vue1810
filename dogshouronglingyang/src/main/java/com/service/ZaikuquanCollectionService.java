package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaikuquanCollectionEntity;
import java.util.Map;

/**
 * 犬收藏 服务类
 * @author 
 * @since 2021-04-12
 */
public interface ZaikuquanCollectionService extends IService<ZaikuquanCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}