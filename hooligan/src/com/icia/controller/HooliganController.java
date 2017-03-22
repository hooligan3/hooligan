package com.icia.controller;

import javax.servlet.http.HttpServletRequest;

import com.icia.service.HooliganService;

import di.ModelAndView;
import di.RequestMapping;

public class HooliganController {
	@RequestMapping(value="/main/index",method="GET")
	public static ModelAndView main(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
		mav.setView("/UandMe/Main.jsp");
	return mav;
	}
	@RequestMapping(value="/customer/login",method="GET")
	public static ModelAndView loginStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		
		
		return mav;
	}
}
