/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package pl.ryzykowskia.restserver2.web;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


@Controller
public final class HomeController {
	
	
	 @RequestMapping(value="/home", method=RequestMethod.GET)
	 public ModelAndView home(){
		 ModelAndView mav = new ModelAndView("home");
		 System.out.println("home home");
		 mav.addObject("text", "test test");
		 return mav;
	 }

	 
	 
}
