package com.entity.vo;

import com.entity.LingyanghuifangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 领养回访
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("lingyanghuifang")
public class LingyanghuifangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 领养人
     */

    @TableField(value = "lingyanghuifang_name")
    private String lingyanghuifangName;


    /**
     * 领养狗编号
     */

    @TableField(value = "lingyanghuifang_dog_bianhao")
    private String lingyanghuifangDogBianhao;


    /**
     * 图片
     */

    @TableField(value = "lingyanghuifang_photo")
    private String lingyanghuifangPhoto;


    /**
     * 详情信息
     */

    @TableField(value = "lingyanghuifang_content")
    private String lingyanghuifangContent;


    /**
     * 创建时间 show2 show1 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：领养人
	 */
    public String getLingyanghuifangName() {
        return lingyanghuifangName;
    }


    /**
	 * 获取：领养人
	 */

    public void setLingyanghuifangName(String lingyanghuifangName) {
        this.lingyanghuifangName = lingyanghuifangName;
    }
    /**
	 * 设置：领养狗编号
	 */
    public String getLingyanghuifangDogBianhao() {
        return lingyanghuifangDogBianhao;
    }


    /**
	 * 获取：领养狗编号
	 */

    public void setLingyanghuifangDogBianhao(String lingyanghuifangDogBianhao) {
        this.lingyanghuifangDogBianhao = lingyanghuifangDogBianhao;
    }
    /**
	 * 设置：图片
	 */
    public String getLingyanghuifangPhoto() {
        return lingyanghuifangPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setLingyanghuifangPhoto(String lingyanghuifangPhoto) {
        this.lingyanghuifangPhoto = lingyanghuifangPhoto;
    }
    /**
	 * 设置：详情信息
	 */
    public String getLingyanghuifangContent() {
        return lingyanghuifangContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setLingyanghuifangContent(String lingyanghuifangContent) {
        this.lingyanghuifangContent = lingyanghuifangContent;
    }
    /**
	 * 设置：创建时间 show2 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 show1 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
