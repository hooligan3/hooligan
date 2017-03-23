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
	//로그인폼으로
	@RequestMapping(value="/main/login",method="GET")
	public static ModelAndView loginStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		  HttpSession session = req.getSession();
		  String go = (String) session.getAttribute("destination");
		  System.out.println("go:" + go);
		mav.setView("/Login.jsp");
		return mav;
	}
	//로그인하기
	//@RequestMapping(value="/main/login",method="POST")
	public static ModelAndView loginEnd(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		mav.setView("/Main.jsp");
		Customer member = service.customerLogin(req);
		  if (member.getCustomerId()== null) {
		   System.out.println("아이디나 비밀번호 확인필요");
		   mav.setView("/members/login.jsp");
		  } else {
		   System.out.println("로그인 성공");
		   HttpSession session = req.getSession();
		   String go = (String) session.getAttribute("destination");
		   System.out.println("go:" + go);
		   session.removeAttribute("destination");
		   if (go == null)
		    go = "/hooligan/main/login";
		   session.setAttribute("member", member);
		   mav.setView(go);
		   mav.setRedirect();
		  }
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
