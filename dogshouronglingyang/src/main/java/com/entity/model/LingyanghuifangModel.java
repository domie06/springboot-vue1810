package com.entity.model;

import com.entity.LingyanghuifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 领养回访
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class LingyanghuifangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 领养人
     */
    private String lingyanghuifangName;


    /**
     * 领养狗编号
     */
    private String lingyanghuifangDogBianhao;


    /**
     * 图片
     */
    private String lingyanghuifangPhoto;


    /**
     * 详情信息
     */
    private String lingyanghuifangContent;


    /**
     * 创建时间 show2 show1 nameShow
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
	 * 获取：领养人
	 */
    public String getLingyanghuifangName() {
        return lingyanghuifangName;
    }


    /**
	 * 设置：领养人
	 */
    public void setLingyanghuifangName(String lingyanghuifangName) {
        this.lingyanghuifangName = lingyanghuifangName;
    }
    /**
	 * 获取：领养狗编号
	 */
    public String getLingyanghuifangDogBianhao() {
        return lingyanghuifangDogBianhao;
    }


    /**
	 * 设置：领养狗编号
	 */
    public void setLingyanghuifangDogBianhao(String lingyanghuifangDogBianhao) {
        this.lingyanghuifangDogBianhao = lingyanghuifangDogBianhao;
    }
    /**
	 * 获取：图片
	 */
    public String getLingyanghuifangPhoto() {
        return lingyanghuifangPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setLingyanghuifangPhoto(String lingyanghuifangPhoto) {
        this.lingyanghuifangPhoto = lingyanghuifangPhoto;
    }
    /**
	 * 获取：详情信息
	 */
    public String getLingyanghuifangContent() {
        return lingyanghuifangContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setLingyanghuifangContent(String lingyanghuifangContent) {
        this.lingyanghuifangContent = lingyanghuifangContent;
    }
    /**
	 * 获取：创建时间 show2 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 show1 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
