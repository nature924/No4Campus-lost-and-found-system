package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShiwuzhaolingYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 失物认领
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shiwuzhaoling_yuyue")
public class ShiwuzhaolingYuyueView extends ShiwuzhaolingYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 审核的值
	*/
	@ColumnInfo(comment="审核的字典表值",type="varchar(200)")
	private String shiwuzhaolingYuyueYesnoValue;

	//级联表 失物信息
		/**
		* 失物编号
		*/

		@ColumnInfo(comment="失物编号",type="varchar(200)")
		private String shiwuzhaolingUuidNumber;
		/**
		* 物品名称
		*/

		@ColumnInfo(comment="物品名称",type="varchar(200)")
		private String shiwuzhaolingName;
		/**
		* 物品类型
		*/
		@ColumnInfo(comment="物品类型",type="int(11)")
		private Integer shiwuzhaolingTypes;
			/**
			* 物品类型的值
			*/
			@ColumnInfo(comment="物品类型的字典表值",type="varchar(200)")
			private String shiwuzhaolingValue;
		/**
		* 认领状态
		*/
		@ColumnInfo(comment="认领状态",type="int(11)")
		private Integer renlingzhuangtaiTypes;
			/**
			* 认领状态的值
			*/
			@ColumnInfo(comment="认领状态的字典表值",type="varchar(200)")
			private String renlingzhuangtaiValue;
					 
		/**
		* 失物信息 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer shiwuzhaolingYonghuId;
		/**
		* 物品图片
		*/

		@ColumnInfo(comment="物品图片",type="varchar(200)")
		private String shiwuzhaolingPhoto;
		/**
		* 拾遗时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="拾遗时间",type="timestamp")
		private Date shiwuzhaolingTime;
		/**
		* 拾遗地址
		*/

		@ColumnInfo(comment="拾遗地址",type="varchar(200)")
		private String shiwuzhaolingDizhi;
		/**
		* 详情
		*/

		@ColumnInfo(comment="详情",type="text")
		private String shiwuzhaolingContent;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public ShiwuzhaolingYuyueView() {

	}

	public ShiwuzhaolingYuyueView(ShiwuzhaolingYuyueEntity shiwuzhaolingYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, shiwuzhaolingYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 审核的值
	*/
	public String getShiwuzhaolingYuyueYesnoValue() {
		return shiwuzhaolingYuyueYesnoValue;
	}
	/**
	* 设置： 审核的值
	*/
	public void setShiwuzhaolingYuyueYesnoValue(String shiwuzhaolingYuyueYesnoValue) {
		this.shiwuzhaolingYuyueYesnoValue = shiwuzhaolingYuyueYesnoValue;
	}


	//级联表的get和set 失物信息

		/**
		* 获取： 失物编号
		*/
		public String getShiwuzhaolingUuidNumber() {
			return shiwuzhaolingUuidNumber;
		}
		/**
		* 设置： 失物编号
		*/
		public void setShiwuzhaolingUuidNumber(String shiwuzhaolingUuidNumber) {
			this.shiwuzhaolingUuidNumber = shiwuzhaolingUuidNumber;
		}

		/**
		* 获取： 物品名称
		*/
		public String getShiwuzhaolingName() {
			return shiwuzhaolingName;
		}
		/**
		* 设置： 物品名称
		*/
		public void setShiwuzhaolingName(String shiwuzhaolingName) {
			this.shiwuzhaolingName = shiwuzhaolingName;
		}
		/**
		* 获取： 物品类型
		*/
		public Integer getShiwuzhaolingTypes() {
			return shiwuzhaolingTypes;
		}
		/**
		* 设置： 物品类型
		*/
		public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
			this.shiwuzhaolingTypes = shiwuzhaolingTypes;
		}


			/**
			* 获取： 物品类型的值
			*/
			public String getShiwuzhaolingValue() {
				return shiwuzhaolingValue;
			}
			/**
			* 设置： 物品类型的值
			*/
			public void setShiwuzhaolingValue(String shiwuzhaolingValue) {
				this.shiwuzhaolingValue = shiwuzhaolingValue;
			}
		/**
		* 获取： 认领状态
		*/
		public Integer getRenlingzhuangtaiTypes() {
			return renlingzhuangtaiTypes;
		}
		/**
		* 设置： 认领状态
		*/
		public void setRenlingzhuangtaiTypes(Integer renlingzhuangtaiTypes) {
			this.renlingzhuangtaiTypes = renlingzhuangtaiTypes;
		}


			/**
			* 获取： 认领状态的值
			*/
			public String getRenlingzhuangtaiValue() {
				return renlingzhuangtaiValue;
			}
			/**
			* 设置： 认领状态的值
			*/
			public void setRenlingzhuangtaiValue(String renlingzhuangtaiValue) {
				this.renlingzhuangtaiValue = renlingzhuangtaiValue;
			}
		/**
		* 获取：失物信息 的 用户
		*/
		public Integer getShiwuzhaolingYonghuId() {
			return shiwuzhaolingYonghuId;
		}
		/**
		* 设置：失物信息 的 用户
		*/
		public void setShiwuzhaolingYonghuId(Integer shiwuzhaolingYonghuId) {
			this.shiwuzhaolingYonghuId = shiwuzhaolingYonghuId;
		}

		/**
		* 获取： 物品图片
		*/
		public String getShiwuzhaolingPhoto() {
			return shiwuzhaolingPhoto;
		}
		/**
		* 设置： 物品图片
		*/
		public void setShiwuzhaolingPhoto(String shiwuzhaolingPhoto) {
			this.shiwuzhaolingPhoto = shiwuzhaolingPhoto;
		}

		/**
		* 获取： 拾遗时间
		*/
		public Date getShiwuzhaolingTime() {
			return shiwuzhaolingTime;
		}
		/**
		* 设置： 拾遗时间
		*/
		public void setShiwuzhaolingTime(Date shiwuzhaolingTime) {
			this.shiwuzhaolingTime = shiwuzhaolingTime;
		}

		/**
		* 获取： 拾遗地址
		*/
		public String getShiwuzhaolingDizhi() {
			return shiwuzhaolingDizhi;
		}
		/**
		* 设置： 拾遗地址
		*/
		public void setShiwuzhaolingDizhi(String shiwuzhaolingDizhi) {
			this.shiwuzhaolingDizhi = shiwuzhaolingDizhi;
		}

		/**
		* 获取： 详情
		*/
		public String getShiwuzhaolingContent() {
			return shiwuzhaolingContent;
		}
		/**
		* 设置： 详情
		*/
		public void setShiwuzhaolingContent(String shiwuzhaolingContent) {
			this.shiwuzhaolingContent = shiwuzhaolingContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

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
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "ShiwuzhaolingYuyueView{" +
			", shiwuzhaolingYuyueYesnoValue=" + shiwuzhaolingYuyueYesnoValue +
			", shiwuzhaolingUuidNumber=" + shiwuzhaolingUuidNumber +
			", shiwuzhaolingName=" + shiwuzhaolingName +
			", shiwuzhaolingPhoto=" + shiwuzhaolingPhoto +
			", shiwuzhaolingTime=" + DateUtil.convertString(shiwuzhaolingTime,"yyyy-MM-dd") +
			", shiwuzhaolingDizhi=" + shiwuzhaolingDizhi +
			", shiwuzhaolingContent=" + shiwuzhaolingContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
