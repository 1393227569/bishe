package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingzhuanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingzhuanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingzhuanliView;


/**
 * 申请专利
 *
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface ShenqingzhuanliService extends IService<ShenqingzhuanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingzhuanliVO> selectListVO(Wrapper<ShenqingzhuanliEntity> wrapper);
   	
   	ShenqingzhuanliVO selectVO(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
   	
   	List<ShenqingzhuanliView> selectListView(Wrapper<ShenqingzhuanliEntity> wrapper);
   	
   	ShenqingzhuanliView selectView(@Param("ew") Wrapper<ShenqingzhuanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingzhuanliEntity> wrapper);
   	
}

