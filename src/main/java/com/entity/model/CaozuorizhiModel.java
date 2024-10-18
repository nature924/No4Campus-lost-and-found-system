package com.entity.model;

import com.entity.CaozuorizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 操作日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CaozuorizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 操作人所在表
     */
    private String caozuorizhiThisBiao;


    /**
     * 操作表
     */
    private String caozuorizhiCaozuobiao;


    /**
     * 操作账户
     */
    private String caozuorizhiCaozuozhanghu;


    /**
     * 操作类型
     */
    private String caozuorizhiCaozuoleixing;


    /**
     * 操作内容
     */
    private String caozuorizhiText;


    /**
     * 操作时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：操作人所在表
	 */
    public String getCaozuorizhiThisBiao() {
        return caozuorizhiThisBiao;
    }


    /**
	 * 设置：操作人所在表
	 */
    public void setCaozuorizhiThisBiao(String caozuorizhiThisBiao) {
        this.caozuorizhiThisBiao = caozuorizhiThisBiao;
    }
    /**
	 * 获取：操作表
	 */
    public String getCaozuorizhiCaozuobiao() {
        return caozuorizhiCaozuobiao;
    }


    /**
	 * 设置：操作表
	 */
    public void setCaozuorizhiCaozuobiao(String caozuorizhiCaozuobiao) {
        this.caozuorizhiCaozuobiao = caozuorizhiCaozuobiao;
    }
    /**
	 * 获取：操作账户
	 */
    public String getCaozuorizhiCaozuozhanghu() {
        return caozuorizhiCaozuozhanghu;
    }


    /**
	 * 设置：操作账户
	 */
    public void setCaozuorizhiCaozuozhanghu(String caozuorizhiCaozuozhanghu) {
        this.caozuorizhiCaozuozhanghu = caozuorizhiCaozuozhanghu;
    }
    /**
	 * 获取：操作类型
	 */
    public String getCaozuorizhiCaozuoleixing() {
        return caozuorizhiCaozuoleixing;
    }


    /**
	 * 设置：操作类型
	 */
    public void setCaozuorizhiCaozuoleixing(String caozuorizhiCaozuoleixing) {
        this.caozuorizhiCaozuoleixing = caozuorizhiCaozuoleixing;
    }
    /**
	 * 获取：操作内容
	 */
    public String getCaozuorizhiText() {
        return caozuorizhiText;
    }


    /**
	 * 设置：操作内容
	 */
    public void setCaozuorizhiText(String caozuorizhiText) {
        this.caozuorizhiText = caozuorizhiText;
    }
    /**
	 * 获取：操作时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：操作时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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

    }
