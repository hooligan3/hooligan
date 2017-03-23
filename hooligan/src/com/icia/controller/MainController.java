package com.icia.controller;

import javax.servlet.http.HttpServletRequest;

import com.icia.service.HooliganService;

import di.ModelAndView;
import di.RequestMapping;

public class MainController {
	@RequestMapping(value="/main/index",method="GET")
	public static ModelAndView main(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
		mav.setView("/Main.jsp");
	return mav;
	}
	@RequestMapping(value="/main/login",method="GET")
	public static ModelAndView loginStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/Login.jsp");
		return mav;
	}
	public static ModelAndView loginEnd(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		mav.addObject("resulst", service.login(req));
		mav.setView("main/index");
		mav.setRedirect();
		return mav;
	}
	@RequestMapping(value="/employee/register",method="POST")
	public static ModelAndView employeeRegisterEnd(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
		mav.addObject("result", service.employeeRegisterEnd(req));
		mav.setView("main/index");
		mav.setRedirect();
		return mav;
	}
	
	@RequestMapping(value="/main/selectRegister",method="GET")
	public static ModelAndView selectRegister(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/SelectRegister.jsp");
		return mav;
	}

}
