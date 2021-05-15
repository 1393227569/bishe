package com.entity.vo;

import com.entity.ZhuanlixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 专利信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public class ZhuanlixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
