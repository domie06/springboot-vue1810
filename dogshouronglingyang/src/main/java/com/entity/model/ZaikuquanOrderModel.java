package com.entity.model;

import com.entity.ZaikuquanOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 收养犬
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class ZaikuquanOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 狗编号
     */
    private Integer zaikuquanId;


    /**
     * 收养人
     */
    private Integer yonghuId;


    /**
     * 是否打过疫苗
     */
    private Integer sfyimiaoTypes;


    /**
     * 是否绝育
     */
    private Integer sfjueyuTypes;


    /**
     * 是否同意
     */
    private Integer tongyiTypes;


    /**
     * 收养时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：狗编号
	 */
    public Integer getZaikuquanId() {
        return zaikuquanId;
    }


    /**
	 * 设置：狗编号
	 */
    public void setZaikuquanId(Integer zaikuquanId) {
        this.zaikuquanId = zaikuquanId;
    }
    /**
	 * 获取：收养人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：收养人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：是否打过疫苗
	 */
    public Integer getSfyimiaoTypes() {
        return sfyimiaoTypes;
    }


    /**
	 * 设置：是否打过疫苗
	 */
    public void setSfyimiaoTypes(Integer sfyimiaoTypes) {
        this.sfyimiaoTypes = sfyimiaoTypes;
    }
    /**
	 * 获取：是否绝育
	 */
    public Integer getSfjueyuTypes() {
        return sfjueyuTypes;
    }


    /**
	 * 设置：是否绝育
	 */
    public void setSfjueyuTypes(Integer sfjueyuTypes) {
        this.sfjueyuTypes = sfjueyuTypes;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getTongyiTypes() {
        return tongyiTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setTongyiTypes(Integer tongyiTypes) {
        this.tongyiTypes = tongyiTypes;
    }
    /**
	 * 获取：收养时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：收养时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
