package com.demo.app.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class AppController extends MultiActionController {

	//sample flow to go to home page
	// refer to https://github.com/wohshon/jboss-store/ for more options for ajax call etc 
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("msg", "Welcome!!!");
		mv.addObject("mainURL","main.page");
		return mv;
	}
	
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
}
