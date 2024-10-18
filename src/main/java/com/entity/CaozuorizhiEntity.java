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
 * 操作日志
 *
 * @author 
 * @email
 */
@TableName("caozuorizhi")
public class CaozuorizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaozuorizhiEntity() {

	}

	public CaozuorizhiEntity(T t) {
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
     * 操作人所在表
     */
    @ColumnInfo(comment="操作人所在表",type="varchar(200)")
    @TableField(value = "caozuorizhi_this_biao")

    private String caozuorizhiThisBiao;


    /**
     * 操作表
     */
    @ColumnInfo(comment="操作表",type="varchar(200)")
    @TableField(value = "caozuorizhi_caozuobiao")

    private String caozuorizhiCaozuobiao;


    /**
     * 操作账户
     */
    @ColumnInfo(comment="操作账户",type="varchar(200)")
    @TableField(value = "caozuorizhi_caozuozhanghu")

    private String caozuorizhiCaozuozhanghu;


    /**
     * 操作类型
     */
    @ColumnInfo(comment="操作类型",type="varchar(200)")
    @TableField(value = "caozuorizhi_caozuoleixing")

    private String caozuorizhiCaozuoleixing;


    /**
     * 操作内容
     */
    @ColumnInfo(comment="操作内容",type="mediumtext")
    @TableField(value = "caozuorizhi_text")

    private String caozuorizhiText;


    /**
     * 操作时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="操作时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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

    @Override
    public String toString() {
        return "Caozuorizhi{" +
            ", id=" + id +
            ", caozuorizhiThisBiao=" + caozuorizhiThisBiao +
            ", caozuorizhiCaozuobiao=" + caozuorizhiCaozuobiao +
            ", caozuorizhiCaozuozhanghu=" + caozuorizhiCaozuozhanghu +
            ", caozuorizhiCaozuoleixing=" + caozuorizhiCaozuoleixing +
            ", caozuorizhiText=" + caozuorizhiText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
