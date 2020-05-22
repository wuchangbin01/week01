package com.wcb.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wcb.beans.Hero;
import com.wcb.mapper.HeroMapper;


@Service
public class HeroServicelmpl implements HeroService{

	
	@Resource
	private HeroMapper heroMapper;
	@Override
	public List<Hero> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return heroMapper.queryAll(map);
	}

}
