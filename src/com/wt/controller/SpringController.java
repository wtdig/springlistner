package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	
	@RequestMapping("/testlistner/wt.html")
	public ModelAndView filterTest() {
		ModelAndView modelAndView = new ModelAndView("listner");
		return modelAndView;
	}
}
