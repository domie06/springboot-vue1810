package com.entity.view;

import com.entity.ZaikuquanOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 收养犬
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-12
 */
@TableName("zaikuquan_order")
public class ZaikuquanOrderView extends ZaikuquanOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否打过疫苗的值
		*/
		private String sfyimiaoValue;
		/**
		* 是否绝育的值
		*/
		private String sfjueyuValue;
		/**
		* 是否同意的值
		*/
		private String tongyiValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

		//级联表 zaikuquan
			/**
			* 狗编号
			*/
			private String zaikuquanName;
			/**
			* 狗性别
			*/
			private Integer sexdogTypes;
				/**
				* 狗性别的值
				*/
				private String sexdogValue;
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
				* 是否打过疫苗的值
				*/
			/**
			* 是否绝育
			*/
			private Integer sfjueyuTypes;
				/**
				* 是否绝育的值
				*/
			/**
			* 犬类型
			*/
			private Integer zaikuquanTypes;
				/**
				* 犬类型的值
				*/
				private String zaikuquanValue;
			/**
			* 详情信息
			*/
			private String zaikuquanContent;

	public ZaikuquanOrderView() {

	}

	public ZaikuquanOrderView(ZaikuquanOrderEntity zaikuquanOrderEntity) {
		try {
			BeanUtils.copyProperties(this, zaikuquanOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否打过疫苗的值
			*/
			/**
			* 获取： 是否同意的值
			*/
			public String getTongyiValue() {
				return tongyiValue;
			}
			/**
			* 设置： 是否同意的值
			*/
			public void setTongyiValue(String tongyiValue) {
				this.tongyiValue = tongyiValue;
			}

















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


				//级联表的get和set zaikuquan
					/**
					* 获取： 狗编号
					*/
					public String getZaikuquanName() {
						return zaikuquanName;
					}
					/**
					* 设置： 狗编号
					*/
					public void setZaikuquanName(String zaikuquanName) {
						this.zaikuquanName = zaikuquanName;
					}
					/**
					* 获取： 狗性别
					*/
					public Integer getSexdogTypes() {
						return sexdogTypes;
					}
					/**
					* 设置： 狗性别
					*/
					public void setSexdogTypes(Integer sexdogTypes) {
						this.sexdogTypes = sexdogTypes;
					}


						/**
						* 获取： 狗性别的值
						*/
						public String getSexdogValue() {
							return sexdogValue;
						}
						/**
						* 设置： 狗性别的值
						*/
						public void setSexdogValue(String sexdogValue) {
							this.sexdogValue = sexdogValue;
						}
					/**
					* 获取： 品种
					*/
					public String getZaikuquanPinzhong() {
						return zaikuquanPinzhong;
					}
					/**
					* 设置： 品种
					*/
					public void setZaikuquanPinzhong(String zaikuquanPinzhong) {
						this.zaikuquanPinzhong = zaikuquanPinzhong;
					}
					/**
					* 获取： 性格
					*/
					public String getZaikuquanXingge() {
						return zaikuquanXingge;
					}
					/**
					* 设置： 性格
					*/
					public void setZaikuquanXingge(String zaikuquanXingge) {
						this.zaikuquanXingge = zaikuquanXingge;
					}
					/**
					* 获取： 生活照片
					*/
					public String getZaikuquanPhoto() {
						return zaikuquanPhoto;
					}
					/**
					* 设置： 生活照片
					*/
					public void setZaikuquanPhoto(String zaikuquanPhoto) {
						this.zaikuquanPhoto = zaikuquanPhoto;
					}
					/**
					* 获取： 接收人
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 接收人
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 接收时间
					*/
					public Integer getJieshouTime() {
						return jieshouTime;
					}
					/**
					* 设置： 接收时间
					*/
					public void setJieshouTime(Integer jieshouTime) {
						this.jieshouTime = jieshouTime;
					}
					/**
					* 获取： 是否打过疫苗
					*/
					public Integer getSfyimiaoTypes() {
						return sfyimiaoTypes;
					}
					/**
					* 设置： 是否打过疫苗
					*/
					public void setSfyimiaoTypes(Integer sfyimiaoTypes) {
						this.sfyimiaoTypes = sfyimiaoTypes;
					}


						/**
						* 获取： 是否打过疫苗的值
						*/
						public String getSfyimiaoValue() {
							return sfyimiaoValue;
						}
						/**
						* 设置： 是否打过疫苗的值
						*/
						public void setSfyimiaoValue(String sfyimiaoValue) {
							this.sfyimiaoValue = sfyimiaoValue;
						}
					/**
					* 获取： 是否绝育
					*/
					public Integer getSfjueyuTypes() {
						return sfjueyuTypes;
					}
					/**
					* 设置： 是否绝育
					*/
					public void setSfjueyuTypes(Integer sfjueyuTypes) {
						this.sfjueyuTypes = sfjueyuTypes;
					}


						/**
						* 获取： 是否绝育的值
						*/
						public String getSfjueyuValue() {
							return sfjueyuValue;
						}
						/**
						* 设置： 是否绝育的值
						*/
						public void setSfjueyuValue(String sfjueyuValue) {
							this.sfjueyuValue = sfjueyuValue;
						}
					/**
					* 获取： 犬类型
					*/
					public Integer getZaikuquanTypes() {
						return zaikuquanTypes;
					}
					/**
					* 设置： 犬类型
					*/
					public void setZaikuquanTypes(Integer zaikuquanTypes) {
						this.zaikuquanTypes = zaikuquanTypes;
					}


						/**
						* 获取： 犬类型的值
						*/
						public String getZaikuquanValue() {
							return zaikuquanValue;
						}
						/**
						* 设置： 犬类型的值
						*/
						public void setZaikuquanValue(String zaikuquanValue) {
							this.zaikuquanValue = zaikuquanValue;
						}
					/**
					* 获取： 详情信息
					*/
					public String getZaikuquanContent() {
						return zaikuquanContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setZaikuquanContent(String zaikuquanContent) {
						this.zaikuquanContent = zaikuquanContent;
					}










}
