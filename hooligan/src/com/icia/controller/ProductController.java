package com.icia.controller;

	
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.icia.service.HooliganService;

import di.ModelAndView;
import di.RequestMapping;

public class ProductController {
	//제품메인화면보기
	@RequestMapping(value="/product/productMain",method="GET")
	public static ModelAndView productMainStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		  HttpSession session = req.getSession();
		  HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		  //mav.addObject("result",service.productMain(req) );
		 req.setAttribute("result", service.productMain(req));
		  mav.setView("/ProductMain.jsp");
		return mav;
	}
	//주문하기 페이지폼으로
	@RequestMapping(value="/product/productOrder",method="GET")
	public static ModelAndView productOrderStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		  HttpSession session = req.getSession();
		  HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		 
		 req.setAttribute("size", req.getAttribute("order_size"));
		 req.setAttribute("result", service.productMain(req));
		  mav.setView("/ProductOrder.jsp");
		return mav;
	}
}
