package com.wcb.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wcb.beans.Hero;
import com.wcb.service.HeroService;

@Controller
public class HeroController {

	
	@Resource
	private HeroService heroService;
	
	@RequestMapping("querAll")
	private String queryAll(@RequestParam(defaultValue="1")Integer pageNum,Model model){
		PageHelper.startPage(pageNum,2);
		Map<String,Object> map = null;
		List<Hero> list = heroService.queryAll(map);
		
		PageInfo<Hero> page = new PageInfo<>(list);
		model.addAttribute("page ", page);
		return "list";
		
		
		
	}
}
