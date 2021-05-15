package com.entity.view;

import com.entity.KeyanrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科研人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
@TableName("keyanrenyuan")
public class KeyanrenyuanView  extends KeyanrenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyanrenyuanView(){
	}
 
 	public KeyanrenyuanView(KeyanrenyuanEntity keyanrenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, keyanrenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
