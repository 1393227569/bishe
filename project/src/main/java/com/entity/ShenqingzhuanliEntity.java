package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 申请专利
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
@TableName("shenqingzhuanli")
public class ShenqingzhuanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShenqingzhuanliEntity() {
		
	}
	
	public ShenqingzhuanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 专利编号
	 */
					
	private String zhuanlibianhao;
	
	/**
	 * 专利名称
	 */
					
	private String zhuanlimingcheng;
	
	/**
	 * 专利类型
	 */
					
	private String zhuanlileixing;
	
	/**
	 * 专利简介
	 */
					
	private String zhuanlijianjie;
	
	/**
	 * 专利文件
	 */
					
	private String zhuanliwenjian;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：专利编号
	 */
	public void setZhuanlibianhao(String zhuanlibianhao) {
		this.zhuanlibianhao = zhuanlibianhao;
	}
	/**
	 * 获取：专利编号
	 */
	public String getZhuanlibianhao() {
		return zhuanlibianhao;
	}
	/**
	 * 设置：专利名称
	 */
	public void setZhuanlimingcheng(String zhuanlimingcheng) {
		this.zhuanlimingcheng = zhuanlimingcheng;
	}
	/**
	 * 获取：专利名称
	 */
	public String getZhuanlimingcheng() {
		return zhuanlimingcheng;
	}
	/**
	 * 设置：专利类型
	 */
	public void setZhuanlileixing(String zhuanlileixing) {
		this.zhuanlileixing = zhuanlileixing;
	}
	/**
	 * 获取：专利类型
	 */
	public String getZhuanlileixing() {
		return zhuanlileixing;
	}
	/**
	 * 设置：专利简介
	 */
	public void setZhuanlijianjie(String zhuanlijianjie) {
		this.zhuanlijianjie = zhuanlijianjie;
	}
	/**
	 * 获取：专利简介
	 */
	public String getZhuanlijianjie() {
		return zhuanlijianjie;
	}
	/**
	 * 设置：专利文件
	 */
	public void setZhuanliwenjian(String zhuanliwenjian) {
		this.zhuanliwenjian = zhuanliwenjian;
	}
	/**
	 * 获取：专利文件
	 */
	public String getZhuanliwenjian() {
		return zhuanliwenjian;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
