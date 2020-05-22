package com.wcb.mapper;

import java.util.List;
import java.util.Map;

import com.wcb.beans.Hero;

public interface HeroMapper {
	 public List<Hero> queryAll(Map<String,Object> map);
}
