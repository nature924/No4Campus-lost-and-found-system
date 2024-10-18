package com.entity.model;

import com.entity.ShiwuzhaolingYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 失物认领
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiwuzhaolingYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 失物id
     */
    private Integer shiwuzhaolingId;


    /**
     * 认领用户
     */
    private Integer yonghuId;


    /**
     * 认领凭证
     */
    private String shiwuzhaolingYuyueText;


    /**
     * 审核
     */
    private Integer shiwuzhaolingYuyueYesnoTypes;


    /**
     * 详情
     */
    private String shiwuzhaolingYuyueYesnoText;


    /**
     * 认领时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
