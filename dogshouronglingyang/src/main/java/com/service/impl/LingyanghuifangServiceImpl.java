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

import com.dao.LingyanghuifangDao;
import com.entity.LingyanghuifangEntity;
import com.service.LingyanghuifangService;
import com.entity.view.LingyanghuifangView;

/**
 * 领养回访 服务实现类
 * @author 
 * @since 2021-04-12
 */
@Service("lingyanghuifangService")
@Transactional
public class LingyanghuifangServiceImpl extends ServiceImpl<LingyanghuifangDao, LingyanghuifangEntity> implements LingyanghuifangService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<LingyanghuifangView> page =new Query<LingyanghuifangView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
