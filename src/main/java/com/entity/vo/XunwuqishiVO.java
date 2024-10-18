package com.entity.vo;

import com.entity.XunwuqishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 寻物启事
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunwuqishi")
public class XunwuqishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物品名称
     */

    @TableField(value = "xunwuqishi_name")
    private String xunwuqishiName;


    /**
     * 物品类型
     */

    @TableField(value = "shiwuzhaoling_types")
    private Integer shiwuzhaolingTypes;


    /**
     * 找回状态
     */

    @TableField(value = "zhaohuizhuangtai_types")
    private Integer zhaohuizhuangtaiTypes;


    /**
     * 物品图片
     */

    @TableField(value = "xunwuqishi_photo")
    private String xunwuqishiPhoto;


    /**
     * 丢失时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xunwuqishi_time")
    private Date xunwuqishiTime;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 丢失地址
     */

    @TableField(value = "xunwuqishi_dizhi")
    private String xunwuqishiDizhi;


    /**
     * 详情
     */

    @TableField(value = "xunwuqishi_content")
    private String xunwuqishiContent;


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
	 * 设置：物品名称
	 */
    public String getXunwuqishiName() {
        return xunwuqishiName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setXunwuqishiName(String xunwuqishiName) {
        this.xunwuqishiName = xunwuqishiName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 设置：找回状态
	 */
    public Integer getZhaohuizhuangtaiTypes() {
        return zhaohuizhuangtaiTypes;
    }


    /**
	 * 获取：找回状态
	 */

    public void setZhaohuizhuangtaiTypes(Integer zhaohuizhuangtaiTypes) {
        this.zhaohuizhuangtaiTypes = zhaohuizhuangtaiTypes;
    }
    /**
	 * 设置：物品图片
	 */
    public String getXunwuqishiPhoto() {
        return xunwuqishiPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setXunwuqishiPhoto(String xunwuqishiPhoto) {
        this.xunwuqishiPhoto = xunwuqishiPhoto;
    }
    /**
	 * 设置：丢失时间
	 */
    public Date getXunwuqishiTime() {
        return xunwuqishiTime;
    }


    /**
	 * 获取：丢失时间
	 */

    public void setXunwuqishiTime(Date xunwuqishiTime) {
        this.xunwuqishiTime = xunwuqishiTime;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：丢失地址
	 */
    public String getXunwuqishiDizhi() {
        return xunwuqishiDizhi;
    }


    /**
	 * 获取：丢失地址
	 */

    public void setXunwuqishiDizhi(String xunwuqishiDizhi) {
        this.xunwuqishiDizhi = xunwuqishiDizhi;
    }
    /**
	 * 设置：详情
	 */
    public String getXunwuqishiContent() {
        return xunwuqishiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXunwuqishiContent(String xunwuqishiContent) {
        this.xunwuqishiContent = xunwuqishiContent;
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
