package com.entity.model;

import com.entity.ZaikuquanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 在库犬
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-12
 */
public class ZaikuquanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 狗编号
     */
    private String zaikuquanName;


    /**
     * 狗性别
     */
    private Integer sexdogTypes;


    /**
     * 品种
     */
    private String zaikuquanPinzhong;


    /**
     * 性格
     */
    private String zaikuquanXingge;


    /**
     * 生活照片
     */
    private String zaikuquanPhoto;


    /**
     * 接收人
     */
    private Integer yonghuId;


    /**
     * 接收时间
     */
    private Integer jieshouTime;


    /**
     * 是否打过疫苗
     */
    private Integer sfyimiaoTypes;


    /**
     * 是否绝育
     */
    private Integer sfjueyuTypes;


    /**
     * 犬类型
     */
    private Integer zaikuquanTypes;


    /**
     * 详情信息
     */
    private String zaikuquanContent;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getZaikuquanName() {
        return zaikuquanName;
    }


    /**
	 * 设置：狗编号
	 */
    public void setZaikuquanName(String zaikuquanName) {
        this.zaikuquanName = zaikuquanName;
    }
    /**
	 * 获取：狗性别
	 */
    public Integer getSexdogTypes() {
        return sexdogTypes;
    }


    /**
	 * 设置：狗性别
	 */
    public void setSexdogTypes(Integer sexdogTypes) {
        this.sexdogTypes = sexdogTypes;
    }
    /**
	 * 获取：品种
	 */
    public String getZaikuquanPinzhong() {
        return zaikuquanPinzhong;
    }


    /**
	 * 设置：品种
	 */
    public void setZaikuquanPinzhong(String zaikuquanPinzhong) {
        this.zaikuquanPinzhong = zaikuquanPinzhong;
    }
    /**
	 * 获取：性格
	 */
    public String getZaikuquanXingge() {
        return zaikuquanXingge;
    }


    /**
	 * 设置：性格
	 */
    public void setZaikuquanXingge(String zaikuquanXingge) {
        this.zaikuquanXingge = zaikuquanXingge;
    }
    /**
	 * 获取：生活照片
	 */
    public String getZaikuquanPhoto() {
        return zaikuquanPhoto;
    }


    /**
	 * 设置：生活照片
	 */
    public void setZaikuquanPhoto(String zaikuquanPhoto) {
        this.zaikuquanPhoto = zaikuquanPhoto;
    }
    /**
	 * 获取：接收人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：接收人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：接收时间
	 */
    public Integer getJieshouTime() {
        return jieshouTime;
    }


    /**
	 * 设置：接收时间
	 */
    public void setJieshouTime(Integer jieshouTime) {
        this.jieshouTime = jieshouTime;
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
	 * 获取：犬类型
	 */
    public Integer getZaikuquanTypes() {
        return zaikuquanTypes;
    }


    /**
	 * 设置：犬类型
	 */
    public void setZaikuquanTypes(Integer zaikuquanTypes) {
        this.zaikuquanTypes = zaikuquanTypes;
    }
    /**
	 * 获取：详情信息
	 */
    public String getZaikuquanContent() {
        return zaikuquanContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setZaikuquanContent(String zaikuquanContent) {
        this.zaikuquanContent = zaikuquanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
