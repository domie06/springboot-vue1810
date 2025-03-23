package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

import com.entity.ShourongEntity;
import com.service.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ZaikuquanOrderEntity;

import com.entity.view.ZaikuquanOrderView;
import com.entity.YonghuEntity;
import com.entity.ZaikuquanEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 收养犬
 * 后端接口
 * @author
 * @email
 * @date 2021-04-12
*/
@RestController
@Controller
@RequestMapping("/zaikuquanOrder")
public class ZaikuquanOrderController {
    private static final Logger logger = LoggerFactory.getLogger(ZaikuquanOrderController.class);

    @Autowired
    private ZaikuquanOrderService zaikuquanOrderService;

    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;
    @Autowired
    private ShourongService shourongService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private ZaikuquanService zaikuquanService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = zaikuquanOrderService.queryPage(params);

        //字典表数据转换
        List<ZaikuquanOrderView> list =(List<ZaikuquanOrderView>)page.getList();
        for(ZaikuquanOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZaikuquanOrderEntity zaikuquanOrder = zaikuquanOrderService.selectById(id);
        if(zaikuquanOrder !=null){
            //entity转view
            ZaikuquanOrderView view = new ZaikuquanOrderView();
            BeanUtils.copyProperties( zaikuquanOrder , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(zaikuquanOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //级联表
            ZaikuquanEntity zaikuquan = zaikuquanService.selectById(zaikuquanOrder.getZaikuquanId());
            if(zaikuquan != null){
                BeanUtils.copyProperties( zaikuquan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setZaikuquanId(zaikuquan.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZaikuquanOrderEntity zaikuquanOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zaikuquanOrder:{}",this.getClass().getName(),zaikuquanOrder.toString());
        zaikuquanOrder.setInsertTime(new Date());
        zaikuquanOrder.setCreateTime(new Date());
        zaikuquanOrderService.insert(zaikuquanOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZaikuquanOrderEntity zaikuquanOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zaikuquanOrder:{}",this.getClass().getName(),zaikuquanOrder.toString());
        zaikuquanOrderService.updateById(zaikuquanOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zaikuquanOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
    * 同意
    */
    @RequestMapping("/tongyi")
    public R tongyi(Integer ids){
        ZaikuquanOrderEntity zaikuquanOrder = zaikuquanOrderService.selectById(ids);
        zaikuquanOrder.setTongyiTypes(1);
        zaikuquanOrderService.updateById(zaikuquanOrder);
        ZaikuquanEntity zaikuquanE = zaikuquanService.selectById(zaikuquanOrder.getZaikuquanId());
        if(zaikuquanE == null){
            return R.error();
        }
        zaikuquanE.setYonghuId(zaikuquanOrder.getYonghuId());
        zaikuquanE.setJieshouTime(new Date());
        zaikuquanService.updateById(zaikuquanE);

        ShourongEntity shourong = shourongService.selectById(1);
        shourong.setYilingyangNumber(shourong.getYilingyangNumber()+1);
        shourong.setZaikuNumber(shourong.getZaikuNumber()-1);
        shourongService.updateById(shourong);
        return R.ok();
    }

    /**
     * 拒绝
     */
    @RequestMapping("/jujue")
    public R jujue(Integer ids){
        ZaikuquanOrderEntity zaikuquanOrder = zaikuquanOrderService.selectById(ids);
        zaikuquanOrder.setTongyiTypes(2);
        zaikuquanOrderService.updateById(zaikuquanOrder);
        return R.ok();
    }

    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = zaikuquanOrderService.queryPage(params);

        //字典表数据转换
        List<ZaikuquanOrderView> list =(List<ZaikuquanOrderView>)page.getList();
        for(ZaikuquanOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZaikuquanOrderEntity zaikuquanOrder = zaikuquanOrderService.selectById(id);
            if(zaikuquanOrder !=null){
                //entity转view
        ZaikuquanOrderView view = new ZaikuquanOrderView();
                BeanUtils.copyProperties( zaikuquanOrder , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(zaikuquanOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    ZaikuquanEntity zaikuquan = zaikuquanService.selectById(zaikuquanOrder.getZaikuquanId());
                if(zaikuquan != null){
                    BeanUtils.copyProperties( zaikuquan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setZaikuquanId(zaikuquan.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ZaikuquanOrderEntity zaikuquanOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zaikuquanOrder:{}",this.getClass().getName(),zaikuquanOrder.toString());
        zaikuquanOrder.setInsertTime(new Date());
        zaikuquanOrder.setCreateTime(new Date());
        zaikuquanOrderService.insert(zaikuquanOrder);
        return R.ok();
    }


}

