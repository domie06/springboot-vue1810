package com.service.impl;

import com.utils.StringUtil;
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

import com.dao.ZaikuquanOrderDao;
import com.entity.ZaikuquanOrderEntity;
import com.service.ZaikuquanOrderService;
import com.entity.view.ZaikuquanOrderView;

/**
 * 收养犬 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("zaikuquanOrderService")
@Transactional
public class ZaikuquanOrderServiceImpl extends ServiceImpl<ZaikuquanOrderDao, ZaikuquanOrderEntity> implements ZaikuquanOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZaikuquanOrderView> page =new Query<ZaikuquanOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
