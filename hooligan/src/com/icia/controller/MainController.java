package com.icia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.icia.service.HooliganService;
import com.icia.vo.Customer;

import di.ModelAndView;
import di.RequestMapping;

public class MainController {
	//메인화면으로
	@RequestMapping(value="/main/index",method="GET")
	public static ModelAndView main(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
		mav.setView("/Main.jsp");
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
	//LoginSelect.jsp
	@RequestMapping(value="/main/selectLogin",method="GET")
	public static ModelAndView loginSelect(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/LoginSelect.jsp");
		return mav;
	}

}
