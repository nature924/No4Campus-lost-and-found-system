package com.entity.model;

import com.entity.XunwuqishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 寻物启事
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunwuqishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名称
     */
    private String xunwuqishiName;


    /**
     * 物品类型
     */
    private Integer shiwuzhaolingTypes;


    /**
     * 找回状态
     */
    private Integer zhaohuizhuangtaiTypes;


    /**
     * 物品图片
     */
    private String xunwuqishiPhoto;


    /**
     * 丢失时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xunwuqishiTime;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 丢失地址
     */
    private String xunwuqishiDizhi;


    /**
     * 详情
     */
    private String xunwuqishiContent;


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
