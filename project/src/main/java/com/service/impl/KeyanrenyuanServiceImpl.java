package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KeyanrenyuanDao;
import com.entity.KeyanrenyuanEntity;
import com.service.KeyanrenyuanService;
import com.entity.vo.KeyanrenyuanVO;
import com.entity.view.KeyanrenyuanView;

@Service("keyanrenyuanService")
public class KeyanrenyuanServiceImpl extends ServiceImpl<KeyanrenyuanDao, KeyanrenyuanEntity> implements KeyanrenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyanrenyuanEntity> page = this.selectPage(
                new Query<KeyanrenyuanEntity>(params).getPage(),
                new EntityWrapper<KeyanrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyanrenyuanEntity> wrapper) {
		  Page<KeyanrenyuanView> page =new Query<KeyanrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyanrenyuanVO> selectListVO(Wrapper<KeyanrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyanrenyuanVO selectVO(Wrapper<KeyanrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyanrenyuanView> selectListView(Wrapper<KeyanrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyanrenyuanView selectView(Wrapper<KeyanrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
