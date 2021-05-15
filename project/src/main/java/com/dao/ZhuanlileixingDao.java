package com.dao;

import com.entity.ZhuanlileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlileixingVO;
import com.entity.view.ZhuanlileixingView;


/**
 * 专利类型
 * 
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface ZhuanlileixingDao extends BaseMapper<ZhuanlileixingEntity> {
	
	List<ZhuanlileixingVO> selectListVO(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
	ZhuanlileixingVO selectVO(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
	List<ZhuanlileixingView> selectListView(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);

	List<ZhuanlileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
	ZhuanlileixingView selectView(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
	
}
