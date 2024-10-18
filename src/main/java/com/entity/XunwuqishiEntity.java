package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 寻物启事
 *
 * @author 
 * @email
 */
@TableName("xunwuqishi")
public class XunwuqishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunwuqishiEntity() {

	}

	public XunwuqishiEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 物品名称
     */
    @ColumnInfo(comment="物品名称",type="varchar(200)")
    @TableField(value = "xunwuqishi_name")

    private String xunwuqishiName;


    /**
     * 物品类型
     */
    @ColumnInfo(comment="物品类型",type="int(11)")
    @TableField(value = "shiwuzhaoling_types")

    private Integer shiwuzhaolingTypes;


    /**
     * 找回状态
     */
    @ColumnInfo(comment="找回状态",type="int(11)")
    @TableField(value = "zhaohuizhuangtai_types")

    private Integer zhaohuizhuangtaiTypes;


    /**
     * 物品图片
     */
    @ColumnInfo(comment="物品图片",type="varchar(200)")
    @TableField(value = "xunwuqishi_photo")

    private String xunwuqishiPhoto;


    /**
     * 丢失时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="丢失时间",type="timestamp")
    @TableField(value = "xunwuqishi_time")

    private Date xunwuqishiTime;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 丢失地址
     */
    @ColumnInfo(comment="丢失地址",type="varchar(200)")
    @TableField(value = "xunwuqishi_dizhi")

    private String xunwuqishiDizhi;


    /**
     * 详情
     */
    @ColumnInfo(comment="详情",type="text")
    @TableField(value = "xunwuqishi_content")

    private String xunwuqishiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：物品名称
	 */
    public String getXunwuqishiName() {
        return xunwuqishiName;
    }
    /**
	 * 设置：物品名称
	 */

    public void setXunwuqishiName(String xunwuqishiName) {
        this.xunwuqishiName = xunwuqishiName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }
    /**
	 * 设置：物品类型
	 */

    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 获取：找回状态
	 */
    public Integer getZhaohuizhuangtaiTypes() {
        return zhaohuizhuangtaiTypes;
    }
    /**
	 * 设置：找回状态
	 */

    public void setZhaohuizhuangtaiTypes(Integer zhaohuizhuangtaiTypes) {
        this.zhaohuizhuangtaiTypes = zhaohuizhuangtaiTypes;
    }
    /**
	 * 获取：物品图片
	 */
    public String getXunwuqishiPhoto() {
        return xunwuqishiPhoto;
    }
    /**
	 * 设置：物品图片
	 */

    public void setXunwuqishiPhoto(String xunwuqishiPhoto) {
        this.xunwuqishiPhoto = xunwuqishiPhoto;
    }
    /**
	 * 获取：丢失时间
	 */
    public Date getXunwuqishiTime() {
        return xunwuqishiTime;
    }
    /**
	 * 设置：丢失时间
	 */

    public void setXunwuqishiTime(Date xunwuqishiTime) {
        this.xunwuqishiTime = xunwuqishiTime;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：丢失地址
	 */
    public String getXunwuqishiDizhi() {
        return xunwuqishiDizhi;
    }
    /**
	 * 设置：丢失地址
	 */

    public void setXunwuqishiDizhi(String xunwuqishiDizhi) {
        this.xunwuqishiDizhi = xunwuqishiDizhi;
    }
    /**
	 * 获取：详情
	 */
    public String getXunwuqishiContent() {
        return xunwuqishiContent;
    }
    /**
	 * 设置：详情
	 */

    public void setXunwuqishiContent(String xunwuqishiContent) {
        this.xunwuqishiContent = xunwuqishiContent;
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

    @Override
    public String toString() {
        return "Xunwuqishi{" +
            ", id=" + id +
            ", xunwuqishiName=" + xunwuqishiName +
            ", shiwuzhaolingTypes=" + shiwuzhaolingTypes +
            ", zhaohuizhuangtaiTypes=" + zhaohuizhuangtaiTypes +
            ", xunwuqishiPhoto=" + xunwuqishiPhoto +
            ", xunwuqishiTime=" + DateUtil.convertString(xunwuqishiTime,"yyyy-MM-dd") +
            ", yonghuId=" + yonghuId +
            ", xunwuqishiDizhi=" + xunwuqishiDizhi +
            ", xunwuqishiContent=" + xunwuqishiContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
