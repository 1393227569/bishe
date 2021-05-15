package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanrenyuanView;


/**
 * 科研人员
 *
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface KeyanrenyuanService extends IService<KeyanrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanrenyuanVO> selectListVO(Wrapper<KeyanrenyuanEntity> wrapper);
   	
   	KeyanrenyuanVO selectVO(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
   	
   	List<KeyanrenyuanView> selectListView(Wrapper<KeyanrenyuanEntity> wrapper);
   	
   	KeyanrenyuanView selectView(@Param("ew") Wrapper<KeyanrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanrenyuanEntity> wrapper);
   	
}

