package com.icia.controller;

import javax.servlet.http.HttpServletRequest;

import di.ModelAndView;
import di.RequestMapping;

public class CustomerController {
	@RequestMapping(value="/customer/register",method="GET")
	public static ModelAndView customerRegister(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/CustomerRegister.jsp");
		return mav;
	}
}
