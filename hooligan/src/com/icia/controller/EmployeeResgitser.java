package com.icia.controller;

import javax.servlet.http.HttpServletRequest;


import com.icia.service.HooliganService;

import di.ModelAndView;
import di.RequestMapping;

public class EmployeeResgitser {
	@RequestMapping(value="/employee/register",method="GET")
	public static ModelAndView employeeRegisterStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/EmployeeRegister.jsp");
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
	
}
