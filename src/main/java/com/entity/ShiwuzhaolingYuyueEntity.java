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
 * 失物认领
 *
 * @author 
 * @email
 */
@TableName("shiwuzhaoling_yuyue")
public class ShiwuzhaolingYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiwuzhaolingYuyueEntity() {

	}

	public ShiwuzhaolingYuyueEntity(T t) {
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
     * 失物id
     */
    @ColumnInfo(comment="失物id",type="int(11)")
    @TableField(value = "shiwuzhaoling_id")

    private Integer shiwuzhaolingId;


    /**
     * 认领用户
     */
    @ColumnInfo(comment="认领用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 认领凭证
     */
    @ColumnInfo(comment="认领凭证",type="text")
    @TableField(value = "shiwuzhaoling_yuyue_text")

    private String shiwuzhaolingYuyueText;


    /**
     * 审核
     */
    @ColumnInfo(comment="审核",type="int(11)")
    @TableField(value = "shiwuzhaoling_yuyue_yesno_types")

    private Integer shiwuzhaolingYuyueYesnoTypes;


    /**
     * 详情
     */
    @ColumnInfo(comment="详情",type="text")
    @TableField(value = "shiwuzhaoling_yuyue_yesno_text")

    private String shiwuzhaolingYuyueYesnoText;


    /**
     * 认领时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="认领时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：失物id
	 */
    public Integer getShiwuzhaolingId() {
        return shiwuzhaolingId;
    }
    /**
	 * 设置：失物id
	 */

    public void setShiwuzhaolingId(Integer shiwuzhaolingId) {
        this.shiwuzhaolingId = shiwuzhaolingId;
    }
    /**
	 * 获取：认领用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：认领用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：认领凭证
	 */
    public String getShiwuzhaolingYuyueText() {
        return shiwuzhaolingYuyueText;
    }
    /**
	 * 设置：认领凭证
	 */

    public void setShiwuzhaolingYuyueText(String shiwuzhaolingYuyueText) {
        this.shiwuzhaolingYuyueText = shiwuzhaolingYuyueText;
    }
    /**
	 * 获取：审核
	 */
    public Integer getShiwuzhaolingYuyueYesnoTypes() {
        return shiwuzhaolingYuyueYesnoTypes;
    }
    /**
	 * 设置：审核
	 */

    public void setShiwuzhaolingYuyueYesnoTypes(Integer shiwuzhaolingYuyueYesnoTypes) {
        this.shiwuzhaolingYuyueYesnoTypes = shiwuzhaolingYuyueYesnoTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getShiwuzhaolingYuyueYesnoText() {
        return shiwuzhaolingYuyueYesnoText;
    }
    /**
	 * 设置：详情
	 */

    public void setShiwuzhaolingYuyueYesnoText(String shiwuzhaolingYuyueYesnoText) {
        this.shiwuzhaolingYuyueYesnoText = shiwuzhaolingYuyueYesnoText;
    }
    /**
	 * 获取：认领时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：认领时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShiwuzhaolingYuyue{" +
            ", id=" + id +
            ", shiwuzhaolingId=" + shiwuzhaolingId +
            ", yonghuId=" + yonghuId +
            ", shiwuzhaolingYuyueText=" + shiwuzhaolingYuyueText +
            ", shiwuzhaolingYuyueYesnoTypes=" + shiwuzhaolingYuyueYesnoTypes +
            ", shiwuzhaolingYuyueYesnoText=" + shiwuzhaolingYuyueYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
