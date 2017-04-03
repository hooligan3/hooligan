package com.icia.controller;

	
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.icia.service.HooliganService;

import di.ModelAndView;
import di.RequestMapping;

public class ProductController {
	@RequestMapping(value="/product/productMain",method="GET")
	public static ModelAndView productMainStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		  HttpSession session = req.getSession();
		  HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		  mav.addObject("result",service.productMain(req) );
		  System.out.println(service.productMain(req).toString());
		  mav.setView("/ProductMain.jsp");
		return mav;
	}
}
