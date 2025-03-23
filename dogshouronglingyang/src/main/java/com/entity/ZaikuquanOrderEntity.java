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
 * 收养犬
 *
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zaikuquan_order")
public class ZaikuquanOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZaikuquanOrderEntity() {

	}

	public ZaikuquanOrderEntity(T t) {
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
     * 狗编号
     */
    @TableField(value = "zaikuquan_id")

    private Integer zaikuquanId;


    /**
     * 收养人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 是否打过疫苗
     */
    @TableField(value = "sfyimiao_types")

    private Integer sfyimiaoTypes;


    /**
     * 是否绝育
     */
    @TableField(value = "sfjueyu_types")

    private Integer sfjueyuTypes;


    /**
     * 是否同意
     */
    @TableField(value = "tongyi_types")

    private Integer tongyiTypes;


    /**
     * 收养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：狗编号
	 */
    public Integer getZaikuquanId() {
        return zaikuquanId;
    }


    /**
	 * 获取：狗编号
	 */

    public void setZaikuquanId(Integer zaikuquanId) {
        this.zaikuquanId = zaikuquanId;
    }
    /**
	 * 设置：收养人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：收养人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否打过疫苗
	 */
    public Integer getSfyimiaoTypes() {
        return sfyimiaoTypes;
    }


    /**
	 * 获取：是否打过疫苗
	 */

    public void setSfyimiaoTypes(Integer sfyimiaoTypes) {
        this.sfyimiaoTypes = sfyimiaoTypes;
    }
    /**
	 * 设置：是否绝育
	 */
    public Integer getSfjueyuTypes() {
        return sfjueyuTypes;
    }


    /**
	 * 获取：是否绝育
	 */

    public void setSfjueyuTypes(Integer sfjueyuTypes) {
        this.sfjueyuTypes = sfjueyuTypes;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getTongyiTypes() {
        return tongyiTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setTongyiTypes(Integer tongyiTypes) {
        this.tongyiTypes = tongyiTypes;
    }
    /**
	 * 设置：收养时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：收养时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "ZaikuquanOrder{" +
            "id=" + id +
            ", zaikuquanId=" + zaikuquanId +
            ", yonghuId=" + yonghuId +
            ", sfyimiaoTypes=" + sfyimiaoTypes +
            ", sfjueyuTypes=" + sfjueyuTypes +
            ", tongyiTypes=" + tongyiTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
