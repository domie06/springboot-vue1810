package com.entity.vo;

import com.entity.ZaikuquanOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收养犬
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zaikuquan_order")
public class ZaikuquanOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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

}
