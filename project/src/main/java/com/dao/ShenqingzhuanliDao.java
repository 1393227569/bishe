package com.dao;

import com.entity.ShenqingzhuanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingzhuanliVO;
import com.entity.view.ShenqingzhuanliView;


/**
 * 申请专利
 * 
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface ShenqingzhuanliDao extends BaseMapper<ShenqingzhuanliEntity> {
	
	List<ShenqingzhuanliVO> selectListVO(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
	
	ShenqingzhuanliVO selectVO(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
	
	List<ShenqingzhuanliView> selectListView(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);

	List<ShenqingzhuanliView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
	
	ShenqingzhuanliView selectView(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
	
}
