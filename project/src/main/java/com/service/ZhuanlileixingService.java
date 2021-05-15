package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanlileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanlileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanlileixingView;


/**
 * 专利类型
 *
 * @author 
 * @email 
 * @date 2021-05-06 17:16:35
 */
public interface ZhuanlileixingService extends IService<ZhuanlileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanlileixingVO> selectListVO(Wrapper<ZhuanlileixingEntity> wrapper);
   	
   	ZhuanlileixingVO selectVO(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
   	
   	List<ZhuanlileixingView> selectListView(Wrapper<ZhuanlileixingEntity> wrapper);
   	
   	ZhuanlileixingView selectView(@Param("ew") Wrapper<ZhuanlileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanlileixingEntity> wrapper);
   	
}

