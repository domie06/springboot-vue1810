package com.entity.vo;

import com.entity.ZaikuquanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 在库犬
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zaikuquan")
public class ZaikuquanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 狗编号
     */

    @TableField(value = "zaikuquan_name")
    private String zaikuquanName;


    /**
     * 狗性别
     */

    @TableField(value = "sexdog_types")
    private Integer sexdogTypes;


    /**
     * 品种
     */

    @TableField(value = "zaikuquan_pinzhong")
    private String zaikuquanPinzhong;


    /**
     * 性格
     */

    @TableField(value = "zaikuquan_xingge")
    private String zaikuquanXingge;


    /**
     * 生活照片
     */

    @TableField(value = "zaikuquan_photo")
    private String zaikuquanPhoto;


    /**
     * 接收人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 接收时间
     */

    @TableField(value = "jieshou_time")
    private Integer jieshouTime;


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
     * 犬类型
     */

    @TableField(value = "zaikuquan_types")
    private Integer zaikuquanTypes;


    /**
     * 详情信息
     */

    @TableField(value = "zaikuquan_content")
    private String zaikuquanContent;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getZaikuquanName() {
        return zaikuquanName;
    }


    /**
	 * 获取：狗编号
	 */

    public void setZaikuquanName(String zaikuquanName) {
        this.zaikuquanName = zaikuquanName;
    }
    /**
	 * 设置：狗性别
	 */
    public Integer getSexdogTypes() {
        return sexdogTypes;
    }


    /**
	 * 获取：狗性别
	 */

    public void setSexdogTypes(Integer sexdogTypes) {
        this.sexdogTypes = sexdogTypes;
    }
    /**
	 * 设置：品种
	 */
    public String getZaikuquanPinzhong() {
        return zaikuquanPinzhong;
    }


    /**
	 * 获取：品种
	 */

    public void setZaikuquanPinzhong(String zaikuquanPinzhong) {
        this.zaikuquanPinzhong = zaikuquanPinzhong;
    }
    /**
	 * 设置：性格
	 */
    public String getZaikuquanXingge() {
        return zaikuquanXingge;
    }


    /**
	 * 获取：性格
	 */

    public void setZaikuquanXingge(String zaikuquanXingge) {
        this.zaikuquanXingge = zaikuquanXingge;
    }
    /**
	 * 设置：生活照片
	 */
    public String getZaikuquanPhoto() {
        return zaikuquanPhoto;
    }


    /**
	 * 获取：生活照片
	 */

    public void setZaikuquanPhoto(String zaikuquanPhoto) {
        this.zaikuquanPhoto = zaikuquanPhoto;
    }
    /**
	 * 设置：接收人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：接收人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：接收时间
	 */
    public Integer getJieshouTime() {
        return jieshouTime;
    }


    /**
	 * 获取：接收时间
	 */

    public void setJieshouTime(Integer jieshouTime) {
        this.jieshouTime = jieshouTime;
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
	 * 设置：犬类型
	 */
    public Integer getZaikuquanTypes() {
        return zaikuquanTypes;
    }


    /**
	 * 获取：犬类型
	 */

    public void setZaikuquanTypes(Integer zaikuquanTypes) {
        this.zaikuquanTypes = zaikuquanTypes;
    }
    /**
	 * 设置：详情信息
	 */
    public String getZaikuquanContent() {
        return zaikuquanContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setZaikuquanContent(String zaikuquanContent) {
        this.zaikuquanContent = zaikuquanContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
