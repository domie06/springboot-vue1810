package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 领养回访
 *
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("lingyanghuifang")
public class LingyanghuifangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LingyanghuifangEntity() {

	}

	public LingyanghuifangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lingyanghuifang{" +
            "id=" + id +
            ", lingyanghuifangName=" + lingyanghuifangName +
            ", lingyanghuifangDogBianhao=" + lingyanghuifangDogBianhao +
            ", lingyanghuifangPhoto=" + lingyanghuifangPhoto +
            ", lingyanghuifangContent=" + lingyanghuifangContent +
            ", createTime=" + createTime +
        "}";
    }
}
