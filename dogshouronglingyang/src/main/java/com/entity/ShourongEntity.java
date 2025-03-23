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
 * 收容管理
 *
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("shourong")
public class ShourongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShourongEntity() {

	}

	public ShourongEntity(T t) {
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
     * 接收犬只
     */
    @TableField(value = "jieshou_number")

    private Integer jieshouNumber;


    /**
     * 在库犬只
     */
    @TableField(value = "zaiku_number")

    private Integer zaikuNumber;


    /**
     * 已领养犬只
     */
    @TableField(value = "yilingyang_number")

    private Integer yilingyangNumber;


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
	 * 设置：接收犬只
	 */
    public Integer getJieshouNumber() {
        return jieshouNumber;
    }


    /**
	 * 获取：接收犬只
	 */

    public void setJieshouNumber(Integer jieshouNumber) {
        this.jieshouNumber = jieshouNumber;
    }
    /**
	 * 设置：在库犬只
	 */
    public Integer getZaikuNumber() {
        return zaikuNumber;
    }


    /**
	 * 获取：在库犬只
	 */

    public void setZaikuNumber(Integer zaikuNumber) {
        this.zaikuNumber = zaikuNumber;
    }
    /**
	 * 设置：已领养犬只
	 */
    public Integer getYilingyangNumber() {
        return yilingyangNumber;
    }


    /**
	 * 获取：已领养犬只
	 */

    public void setYilingyangNumber(Integer yilingyangNumber) {
        this.yilingyangNumber = yilingyangNumber;
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
        return "Shourong{" +
            "id=" + id +
            ", jieshouNumber=" + jieshouNumber +
            ", zaikuNumber=" + zaikuNumber +
            ", yilingyangNumber=" + yilingyangNumber +
            ", createTime=" + createTime +
        "}";
    }
}
