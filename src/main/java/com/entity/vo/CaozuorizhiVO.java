package com.entity.vo;

import com.entity.CaozuorizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 操作日志
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caozuorizhi")
public class CaozuorizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 操作人所在表
     */

    @TableField(value = "caozuorizhi_this_biao")
    private String caozuorizhiThisBiao;


    /**
     * 操作表
     */

    @TableField(value = "caozuorizhi_caozuobiao")
    private String caozuorizhiCaozuobiao;


    /**
     * 操作账户
     */

    @TableField(value = "caozuorizhi_caozuozhanghu")
    private String caozuorizhiCaozuozhanghu;


    /**
     * 操作类型
     */

    @TableField(value = "caozuorizhi_caozuoleixing")
    private String caozuorizhiCaozuoleixing;


    /**
     * 操作内容
     */

    @TableField(value = "caozuorizhi_text")
    private String caozuorizhiText;


    /**
     * 操作时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：操作人所在表
	 */
    public String getCaozuorizhiThisBiao() {
        return caozuorizhiThisBiao;
    }


    /**
	 * 获取：操作人所在表
	 */

    public void setCaozuorizhiThisBiao(String caozuorizhiThisBiao) {
        this.caozuorizhiThisBiao = caozuorizhiThisBiao;
    }
    /**
	 * 设置：操作表
	 */
    public String getCaozuorizhiCaozuobiao() {
        return caozuorizhiCaozuobiao;
    }


    /**
	 * 获取：操作表
	 */

    public void setCaozuorizhiCaozuobiao(String caozuorizhiCaozuobiao) {
        this.caozuorizhiCaozuobiao = caozuorizhiCaozuobiao;
    }
    /**
	 * 设置：操作账户
	 */
    public String getCaozuorizhiCaozuozhanghu() {
        return caozuorizhiCaozuozhanghu;
    }


    /**
	 * 获取：操作账户
	 */

    public void setCaozuorizhiCaozuozhanghu(String caozuorizhiCaozuozhanghu) {
        this.caozuorizhiCaozuozhanghu = caozuorizhiCaozuozhanghu;
    }
    /**
	 * 设置：操作类型
	 */
    public String getCaozuorizhiCaozuoleixing() {
        return caozuorizhiCaozuoleixing;
    }


    /**
	 * 获取：操作类型
	 */

    public void setCaozuorizhiCaozuoleixing(String caozuorizhiCaozuoleixing) {
        this.caozuorizhiCaozuoleixing = caozuorizhiCaozuoleixing;
    }
    /**
	 * 设置：操作内容
	 */
    public String getCaozuorizhiText() {
        return caozuorizhiText;
    }


    /**
	 * 获取：操作内容
	 */

    public void setCaozuorizhiText(String caozuorizhiText) {
        this.caozuorizhiText = caozuorizhiText;
    }
    /**
	 * 设置：操作时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：操作时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
