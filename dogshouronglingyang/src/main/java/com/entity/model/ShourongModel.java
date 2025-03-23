package com.entity.model;

import com.entity.ShourongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 收容管理
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class ShourongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 接收犬只
     */
    private Integer jieshouNumber;


    /**
     * 在库犬只
     */
    private Integer zaikuNumber;


    /**
     * 已领养犬只
     */
    private Integer yilingyangNumber;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：接收犬只
	 */
    public Integer getJieshouNumber() {
        return jieshouNumber;
    }


    /**
	 * 设置：接收犬只
	 */
    public void setJieshouNumber(Integer jieshouNumber) {
        this.jieshouNumber = jieshouNumber;
    }
    /**
	 * 获取：在库犬只
	 */
    public Integer getZaikuNumber() {
        return zaikuNumber;
    }


    /**
	 * 设置：在库犬只
	 */
    public void setZaikuNumber(Integer zaikuNumber) {
        this.zaikuNumber = zaikuNumber;
    }
    /**
	 * 获取：已领养犬只
	 */
    public Integer getYilingyangNumber() {
        return yilingyangNumber;
    }


    /**
	 * 设置：已领养犬只
	 */
    public void setYilingyangNumber(Integer yilingyangNumber) {
        this.yilingyangNumber = yilingyangNumber;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
