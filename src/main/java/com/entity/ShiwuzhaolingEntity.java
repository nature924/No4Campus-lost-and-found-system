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
 * 失物信息
 *
 * @author 
 * @email
 */
@TableName("shiwuzhaoling")
public class ShiwuzhaolingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiwuzhaolingEntity() {

	}

	public ShiwuzhaolingEntity(T t) {
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
     * 失物编号
     */
    @ColumnInfo(comment="失物编号",type="varchar(200)")
    @TableField(value = "shiwuzhaoling_uuid_number")

    private String shiwuzhaolingUuidNumber;


    /**
     * 物品名称
     */
    @ColumnInfo(comment="物品名称",type="varchar(200)")
    @TableField(value = "shiwuzhaoling_name")

    private String shiwuzhaolingName;


    /**
     * 物品类型
     */
    @ColumnInfo(comment="物品类型",type="int(11)")
    @TableField(value = "shiwuzhaoling_types")

    private Integer shiwuzhaolingTypes;


    /**
     * 认领状态
     */
    @ColumnInfo(comment="认领状态",type="int(11)")
    @TableField(value = "renlingzhuangtai_types")

    private Integer renlingzhuangtaiTypes;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 物品图片
     */
    @ColumnInfo(comment="物品图片",type="varchar(200)")
    @TableField(value = "shiwuzhaoling_photo")

    private String shiwuzhaolingPhoto;


    /**
     * 拾遗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="拾遗时间",type="timestamp")
    @TableField(value = "shiwuzhaoling_time")

    private Date shiwuzhaolingTime;


    /**
     * 拾遗地址
     */
    @ColumnInfo(comment="拾遗地址",type="varchar(200)")
    @TableField(value = "shiwuzhaoling_dizhi")

    private String shiwuzhaolingDizhi;


    /**
     * 详情
     */
    @ColumnInfo(comment="详情",type="text")
    @TableField(value = "shiwuzhaoling_content")

    private String shiwuzhaolingContent;


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
	 * 获取：失物编号
	 */
    public String getShiwuzhaolingUuidNumber() {
        return shiwuzhaolingUuidNumber;
    }
    /**
	 * 设置：失物编号
	 */

    public void setShiwuzhaolingUuidNumber(String shiwuzhaolingUuidNumber) {
        this.shiwuzhaolingUuidNumber = shiwuzhaolingUuidNumber;
    }
    /**
	 * 获取：物品名称
	 */
    public String getShiwuzhaolingName() {
        return shiwuzhaolingName;
    }
    /**
	 * 设置：物品名称
	 */

    public void setShiwuzhaolingName(String shiwuzhaolingName) {
        this.shiwuzhaolingName = shiwuzhaolingName;
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
	 * 获取：认领状态
	 */
    public Integer getRenlingzhuangtaiTypes() {
        return renlingzhuangtaiTypes;
    }
    /**
	 * 设置：认领状态
	 */

    public void setRenlingzhuangtaiTypes(Integer renlingzhuangtaiTypes) {
        this.renlingzhuangtaiTypes = renlingzhuangtaiTypes;
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
	 * 获取：物品图片
	 */
    public String getShiwuzhaolingPhoto() {
        return shiwuzhaolingPhoto;
    }
    /**
	 * 设置：物品图片
	 */

    public void setShiwuzhaolingPhoto(String shiwuzhaolingPhoto) {
        this.shiwuzhaolingPhoto = shiwuzhaolingPhoto;
    }
    /**
	 * 获取：拾遗时间
	 */
    public Date getShiwuzhaolingTime() {
        return shiwuzhaolingTime;
    }
    /**
	 * 设置：拾遗时间
	 */

    public void setShiwuzhaolingTime(Date shiwuzhaolingTime) {
        this.shiwuzhaolingTime = shiwuzhaolingTime;
    }
    /**
	 * 获取：拾遗地址
	 */
    public String getShiwuzhaolingDizhi() {
        return shiwuzhaolingDizhi;
    }
    /**
	 * 设置：拾遗地址
	 */

    public void setShiwuzhaolingDizhi(String shiwuzhaolingDizhi) {
        this.shiwuzhaolingDizhi = shiwuzhaolingDizhi;
    }
    /**
	 * 获取：详情
	 */
    public String getShiwuzhaolingContent() {
        return shiwuzhaolingContent;
    }
    /**
	 * 设置：详情
	 */

    public void setShiwuzhaolingContent(String shiwuzhaolingContent) {
        this.shiwuzhaolingContent = shiwuzhaolingContent;
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
        return "Shiwuzhaoling{" +
            ", id=" + id +
            ", shiwuzhaolingUuidNumber=" + shiwuzhaolingUuidNumber +
            ", shiwuzhaolingName=" + shiwuzhaolingName +
            ", shiwuzhaolingTypes=" + shiwuzhaolingTypes +
            ", renlingzhuangtaiTypes=" + renlingzhuangtaiTypes +
            ", yonghuId=" + yonghuId +
            ", shiwuzhaolingPhoto=" + shiwuzhaolingPhoto +
            ", shiwuzhaolingTime=" + DateUtil.convertString(shiwuzhaolingTime,"yyyy-MM-dd") +
            ", shiwuzhaolingDizhi=" + shiwuzhaolingDizhi +
            ", shiwuzhaolingContent=" + shiwuzhaolingContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
