package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XunwuqishiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 寻物启事留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xunwuqishi_liuyan")
public class XunwuqishiLiuyanView extends XunwuqishiLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 寻物启事
		/**
		* 物品名称
		*/

		@ColumnInfo(comment="物品名称",type="varchar(200)")
		private String xunwuqishiName;
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
		* 找回状态
		*/
		@ColumnInfo(comment="找回状态",type="int(11)")
		private Integer zhaohuizhuangtaiTypes;
			/**
			* 找回状态的值
			*/
			@ColumnInfo(comment="找回状态的字典表值",type="varchar(200)")
			private String zhaohuizhuangtaiValue;
		/**
		* 物品图片
		*/

		@ColumnInfo(comment="物品图片",type="varchar(200)")
		private String xunwuqishiPhoto;
		/**
		* 丢失时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="丢失时间",type="timestamp")
		private Date xunwuqishiTime;
					 
		/**
		* 寻物启事 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer xunwuqishiYonghuId;
		/**
		* 丢失地址
		*/

		@ColumnInfo(comment="丢失地址",type="varchar(200)")
		private String xunwuqishiDizhi;
		/**
		* 详情
		*/

		@ColumnInfo(comment="详情",type="text")
		private String xunwuqishiContent;
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



	public XunwuqishiLiuyanView() {

	}

	public XunwuqishiLiuyanView(XunwuqishiLiuyanEntity xunwuqishiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xunwuqishiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 寻物启事

		/**
		* 获取： 物品名称
		*/
		public String getXunwuqishiName() {
			return xunwuqishiName;
		}
		/**
		* 设置： 物品名称
		*/
		public void setXunwuqishiName(String xunwuqishiName) {
			this.xunwuqishiName = xunwuqishiName;
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
		* 获取： 找回状态
		*/
		public Integer getZhaohuizhuangtaiTypes() {
			return zhaohuizhuangtaiTypes;
		}
		/**
		* 设置： 找回状态
		*/
		public void setZhaohuizhuangtaiTypes(Integer zhaohuizhuangtaiTypes) {
			this.zhaohuizhuangtaiTypes = zhaohuizhuangtaiTypes;
		}


			/**
			* 获取： 找回状态的值
			*/
			public String getZhaohuizhuangtaiValue() {
				return zhaohuizhuangtaiValue;
			}
			/**
			* 设置： 找回状态的值
			*/
			public void setZhaohuizhuangtaiValue(String zhaohuizhuangtaiValue) {
				this.zhaohuizhuangtaiValue = zhaohuizhuangtaiValue;
			}

		/**
		* 获取： 物品图片
		*/
		public String getXunwuqishiPhoto() {
			return xunwuqishiPhoto;
		}
		/**
		* 设置： 物品图片
		*/
		public void setXunwuqishiPhoto(String xunwuqishiPhoto) {
			this.xunwuqishiPhoto = xunwuqishiPhoto;
		}

		/**
		* 获取： 丢失时间
		*/
		public Date getXunwuqishiTime() {
			return xunwuqishiTime;
		}
		/**
		* 设置： 丢失时间
		*/
		public void setXunwuqishiTime(Date xunwuqishiTime) {
			this.xunwuqishiTime = xunwuqishiTime;
		}
		/**
		* 获取：寻物启事 的 用户
		*/
		public Integer getXunwuqishiYonghuId() {
			return xunwuqishiYonghuId;
		}
		/**
		* 设置：寻物启事 的 用户
		*/
		public void setXunwuqishiYonghuId(Integer xunwuqishiYonghuId) {
			this.xunwuqishiYonghuId = xunwuqishiYonghuId;
		}

		/**
		* 获取： 丢失地址
		*/
		public String getXunwuqishiDizhi() {
			return xunwuqishiDizhi;
		}
		/**
		* 设置： 丢失地址
		*/
		public void setXunwuqishiDizhi(String xunwuqishiDizhi) {
			this.xunwuqishiDizhi = xunwuqishiDizhi;
		}

		/**
		* 获取： 详情
		*/
		public String getXunwuqishiContent() {
			return xunwuqishiContent;
		}
		/**
		* 设置： 详情
		*/
		public void setXunwuqishiContent(String xunwuqishiContent) {
			this.xunwuqishiContent = xunwuqishiContent;
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
		return "XunwuqishiLiuyanView{" +
			", xunwuqishiName=" + xunwuqishiName +
			", xunwuqishiPhoto=" + xunwuqishiPhoto +
			", xunwuqishiTime=" + DateUtil.convertString(xunwuqishiTime,"yyyy-MM-dd") +
			", xunwuqishiDizhi=" + xunwuqishiDizhi +
			", xunwuqishiContent=" + xunwuqishiContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
