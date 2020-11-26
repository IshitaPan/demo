package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Home {
	@RequestMapping("/")
	public ModelAndView home() {
		  ModelAndView mv=new ModelAndView();
		  mv.setViewName("home.jsp");
		return mv;
	}

}
