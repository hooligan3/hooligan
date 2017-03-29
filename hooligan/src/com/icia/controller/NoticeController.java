package com.icia.controller;

import javax.servlet.http.*;

import com.icia.service.*;

import di.*;

public class NoticeController {
	//공지사항 조회
	@RequestMapping(value="/notice/list", method="GET")
	public static ModelAndView list(HttpServletRequest req) {
		HooliganService service = (HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.readNotice(req));
		System.out.println(service.readNotice(req).toString());
		mav.setView("/NoticeBoardList.jsp");
		return mav;
	}
	//공지사항 관리자 페이지 조회
	@RequestMapping(value="/notice/admin", method="GET")
	public static ModelAndView adminlist(HttpServletRequest req) {
		HooliganService service = (HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.readNotice(req));
		System.out.println(service.readNotice(req).toString());
		mav.setView("/AdminNoticeList.jsp");
		return mav;
	}
	//공지사항 작성 폼으로
		@RequestMapping(value="/notice/register",method="GET")
		public static ModelAndView customerRegisterStart(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			mav.setView("/AdminNoticeRegister.jsp");
		
			return mav;
		}
		//공지사항 작성
		@RequestMapping(value="/notice/register",method="POST")
		public static ModelAndView customerRegiserEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			mav.addObject("result", service.insertNotice(req));
			String ggo="/hooligan/notice/admin";
			  mav.setView(ggo);
			  mav.setRedirect();
			  return mav;

		}
		//공지사항 뷰
		@RequestMapping(value="/notice/view", method="GET")
		public static ModelAndView view(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			mav.addObject("result", service.noticeView(req));
			mav.setView("/NoticeBoardView.jsp");
			return mav;
		}
		//공지사항 어드민 뷰
				@RequestMapping(value="/notice/adminView", method="GET")
				public static ModelAndView adminView(HttpServletRequest req) {
					HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
					ModelAndView mav = new ModelAndView();
					mav.addObject("result", service.noticeView(req));
					mav.setView("/AdminNoticeView.jsp");
					return mav;
				}
		
	//공지사항 수정GET
		@RequestMapping(value="/notice/update", method="GET")
		public static ModelAndView updateStart(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			mav.addObject("result", service.noticeUpdateStart(req));
			mav.setView("/AdminNoticeUpdate.jsp");
			return mav;
		}
	//공지사항 수정POST
		@RequestMapping(value="/notice/update", method="POST")
		public static ModelAndView updateEnd(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.noticeUpdateEnd(req));
			mav.setView("/hooligan/notice/admin");
			mav.setRedirect();
			return mav;
		}
		//공지사항 삭제
		@RequestMapping(value="/notice/delete", method="POST")
		public static ModelAndView deleteNotice(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.noticeDelete(req));
			mav.setView("/hooligan/notice/admin");
			mav.setRedirect();
			return mav;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
