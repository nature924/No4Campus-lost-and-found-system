package com.entity.vo;

import com.entity.ShiwuzhaolingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 失物信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiwuzhaoling")
public class ShiwuzhaolingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 失物编号
     */

    @TableField(value = "shiwuzhaoling_uuid_number")
    private String shiwuzhaolingUuidNumber;


    /**
     * 物品名称
     */

    @TableField(value = "shiwuzhaoling_name")
    private String shiwuzhaolingName;


    /**
     * 物品类型
     */

    @TableField(value = "shiwuzhaoling_types")
    private Integer shiwuzhaolingTypes;


    /**
     * 认领状态
     */

    @TableField(value = "renlingzhuangtai_types")
    private Integer renlingzhuangtaiTypes;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 物品图片
     */

    @TableField(value = "shiwuzhaoling_photo")
    private String shiwuzhaolingPhoto;


    /**
     * 拾遗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shiwuzhaoling_time")
    private Date shiwuzhaolingTime;


    /**
     * 拾遗地址
     */

    @TableField(value = "shiwuzhaoling_dizhi")
    private String shiwuzhaolingDizhi;


    /**
     * 详情
     */

    @TableField(value = "shiwuzhaoling_content")
    private String shiwuzhaolingContent;


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
	 * 设置：失物编号
	 */
    public String getShiwuzhaolingUuidNumber() {
        return shiwuzhaolingUuidNumber;
    }


    /**
	 * 获取：失物编号
	 */

    public void setShiwuzhaolingUuidNumber(String shiwuzhaolingUuidNumber) {
        this.shiwuzhaolingUuidNumber = shiwuzhaolingUuidNumber;
    }
    /**
	 * 设置：物品名称
	 */
    public String getShiwuzhaolingName() {
        return shiwuzhaolingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setShiwuzhaolingName(String shiwuzhaolingName) {
        this.shiwuzhaolingName = shiwuzhaolingName;
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
	 * 设置：认领状态
	 */
    public Integer getRenlingzhuangtaiTypes() {
        return renlingzhuangtaiTypes;
    }


    /**
	 * 获取：认领状态
	 */

    public void setRenlingzhuangtaiTypes(Integer renlingzhuangtaiTypes) {
        this.renlingzhuangtaiTypes = renlingzhuangtaiTypes;
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
	 * 设置：物品图片
	 */
    public String getShiwuzhaolingPhoto() {
        return shiwuzhaolingPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setShiwuzhaolingPhoto(String shiwuzhaolingPhoto) {
        this.shiwuzhaolingPhoto = shiwuzhaolingPhoto;
    }
    /**
	 * 设置：拾遗时间
	 */
    public Date getShiwuzhaolingTime() {
        return shiwuzhaolingTime;
    }


    /**
	 * 获取：拾遗时间
	 */

    public void setShiwuzhaolingTime(Date shiwuzhaolingTime) {
        this.shiwuzhaolingTime = shiwuzhaolingTime;
    }
    /**
	 * 设置：拾遗地址
	 */
    public String getShiwuzhaolingDizhi() {
        return shiwuzhaolingDizhi;
    }


    /**
	 * 获取：拾遗地址
	 */

    public void setShiwuzhaolingDizhi(String shiwuzhaolingDizhi) {
        this.shiwuzhaolingDizhi = shiwuzhaolingDizhi;
    }
    /**
	 * 设置：详情
	 */
    public String getShiwuzhaolingContent() {
        return shiwuzhaolingContent;
    }


    /**
	 * 获取：详情
	 */

    public void setShiwuzhaolingContent(String shiwuzhaolingContent) {
        this.shiwuzhaolingContent = shiwuzhaolingContent;
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
