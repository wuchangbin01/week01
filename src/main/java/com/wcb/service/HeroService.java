package com.wcb.service;

import java.util.List;
import java.util.Map;

import com.wcb.beans.Hero;

public interface HeroService {
	 public List<Hero> queryAll(Map<String,Object> map);
}
 