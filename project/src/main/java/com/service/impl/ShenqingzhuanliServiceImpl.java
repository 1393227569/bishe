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


import com.dao.ShenqingzhuanliDao;
import com.entity.ShenqingzhuanliEntity;
import com.service.ShenqingzhuanliService;
import com.entity.vo.ShenqingzhuanliVO;
import com.entity.view.ShenqingzhuanliView;

@Service("shenqingzhuanliService")
public class ShenqingzhuanliServiceImpl extends ServiceImpl<ShenqingzhuanliDao, ShenqingzhuanliEntity> implements ShenqingzhuanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingzhuanliEntity> page = this.selectPage(
                new Query<ShenqingzhuanliEntity>(params).getPage(),
                new EntityWrapper<ShenqingzhuanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingzhuanliEntity> wrapper) {
		  Page<ShenqingzhuanliView> page =new Query<ShenqingzhuanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingzhuanliVO> selectListVO(Wrapper<ShenqingzhuanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingzhuanliVO selectVO(Wrapper<ShenqingzhuanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingzhuanliView> selectListView(Wrapper<ShenqingzhuanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingzhuanliView selectView(Wrapper<ShenqingzhuanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
