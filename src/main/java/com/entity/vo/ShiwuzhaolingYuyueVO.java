package com.entity.vo;

import com.entity.ShiwuzhaolingYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 失物认领
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiwuzhaoling_yuyue")
public class ShiwuzhaolingYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 失物id
     */

    @TableField(value = "shiwuzhaoling_id")
    private Integer shiwuzhaolingId;


    /**
     * 认领用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 认领凭证
     */

    @TableField(value = "shiwuzhaoling_yuyue_text")
    private String shiwuzhaolingYuyueText;


    /**
     * 审核
     */

    @TableField(value = "shiwuzhaoling_yuyue_yesno_types")
    private Integer shiwuzhaolingYuyueYesnoTypes;


    /**
     * 详情
     */

    @TableField(value = "shiwuzhaoling_yuyue_yesno_text")
    private String shiwuzhaolingYuyueYesnoText;


    /**
     * 认领时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：失物id
	 */
    public Integer getShiwuzhaolingId() {
        return shiwuzhaolingId;
    }


    /**
	 * 获取：失物id
	 */

    public void setShiwuzhaolingId(Integer shiwuzhaolingId) {
        this.shiwuzhaolingId = shiwuzhaolingId;
    }
    /**
	 * 设置：认领用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：认领用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：认领凭证
	 */
    public String getShiwuzhaolingYuyueText() {
        return shiwuzhaolingYuyueText;
    }


    /**
	 * 获取：认领凭证
	 */

    public void setShiwuzhaolingYuyueText(String shiwuzhaolingYuyueText) {
        this.shiwuzhaolingYuyueText = shiwuzhaolingYuyueText;
    }
    /**
	 * 设置：审核
	 */
    public Integer getShiwuzhaolingYuyueYesnoTypes() {
        return shiwuzhaolingYuyueYesnoTypes;
    }


    /**
	 * 获取：审核
	 */

    public void setShiwuzhaolingYuyueYesnoTypes(Integer shiwuzhaolingYuyueYesnoTypes) {
        this.shiwuzhaolingYuyueYesnoTypes = shiwuzhaolingYuyueYesnoTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getShiwuzhaolingYuyueYesnoText() {
        return shiwuzhaolingYuyueYesnoText;
    }


    /**
	 * 获取：详情
	 */

    public void setShiwuzhaolingYuyueYesnoText(String shiwuzhaolingYuyueYesnoText) {
        this.shiwuzhaolingYuyueYesnoText = shiwuzhaolingYuyueYesnoText;
    }
    /**
	 * 设置：认领时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：认领时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
