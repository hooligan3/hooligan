package com.icia.controller;

import javax.servlet.http.*;

import com.icia.service.*;

import di.*;

public class NoticeController {
	@RequestMapping(value="/notice/list", method="GET")
	public static ModelAndView list(HttpServletRequest req) {
		HooliganService service = (HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.readNotice(req));
		System.out.println(service.readNotice(req).toString());
		mav.setView("/NoticeBoardList.jsp");
		return mav;
	}
	@RequestMapping(value="/notice/list", method="AJAX")
	public static ModelAndView listAjax(HttpServletRequest req) {
		HooliganService service = (HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.readNotice(req));
		return mav;
	}
}
