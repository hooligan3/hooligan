package com.icia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.icia.service.HooliganService;
import com.icia.vo.Customer;

import di.ModelAndView;
import di.RequestMapping;

public class CustomerController {
	
	//로그인폼으로
		@RequestMapping(value="/customer/login",method="GET")
		public static ModelAndView loginStart(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			  HttpSession session = req.getSession();
			  String go = (String) session.getAttribute("destination");
			  System.out.println("go:" + go);
			mav.setView("/Login.jsp");
			return mav;
		}
	//로그인하기
	@RequestMapping(value="/customer/login",method="POST")
	public static ModelAndView loginEnd(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		System.out.println("로그인나아아아ㅏ");
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		mav.setView("/Main.jsp");
		Customer customer = service.customerLogin(req);
		  if (customer== null) {
		   System.out.println("아이디나 비밀번호 확인필요");
		   String result="아이디와 비밀번호를 확인하십시요";
		   mav.setView("/hooligan/customer/login");
		   mav.setRedirect();
		   return mav;
		  } else {
		   System.out.println("로그인 성공");
		   HttpSession session = req.getSession();
		   String go = (String) session.getAttribute("destination");
		   System.out.println("go:" + go);
		   session.removeAttribute("destination");
		   if (go == null)
		    go = "/hooligan/main/index";
		   session.setAttribute("customer", customer);
		   mav.setView(go);
		   mav.setRedirect();
		  }
		  return mav;

	}
	@RequestMapping(value="/customer/register",method="GET")
	public static ModelAndView customerRegisterStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		mav.setView("/CustomerRegister.jsp");
		return mav;
	}
	@RequestMapping(value="/customer/register",method="POST")
	public static ModelAndView customerRegiserEnd(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
		System.out.println("고객등록여기까지들어왓냐");
		System.out.println("주소는"+req.getParameter("address"));
		mav.addObject("result", service.customerInsert(req));
		  String ggo = "/hooligan/main/index";
		  mav.setView(ggo);
		  mav.setRedirect();
		  return mav;

	}
}
