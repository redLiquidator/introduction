package com.intro.july.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroController{
	
	private static final Logger logger = LoggerFactory.getLogger(IntroController.class);

	
	@GetMapping("/intro")   
	public ModelAndView intro() {
		//assign intro.html file to mv
	      ModelAndView mv = new ModelAndView("intro.html");
	             
	      logger.info("+++++++++++intro++++++++++++");		  
		  
	      return mv;
	}
}
