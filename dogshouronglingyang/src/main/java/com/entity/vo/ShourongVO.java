package com.entity.vo;

import com.entity.ShourongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收容管理
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("shourong")
public class ShourongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
