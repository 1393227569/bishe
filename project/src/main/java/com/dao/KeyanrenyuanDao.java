package com.dao;

import com.entity.KeyanrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanrenyuanVO;
import com.entity.view.KeyanrenyuanView;


/**
 * 科研人员
 * 
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface KeyanrenyuanDao extends BaseMapper<KeyanrenyuanEntity> {
	
	List<KeyanrenyuanVO> selectListVO(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
	
	KeyanrenyuanVO selectVO(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
	
	List<KeyanrenyuanView> selectListView(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);

	List<KeyanrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
	
	KeyanrenyuanView selectView(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
	
}
