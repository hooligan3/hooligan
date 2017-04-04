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
		//자유게시판 리스트 조회
		@RequestMapping(value="/main/free/list", method="GET")
		public static ModelAndView freeList(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.readFreeList(req));
			mav.setView("/FreeBoardList.jsp");
			return mav;
		}
		//자유게시판 뷰
		@RequestMapping(value="/main/free/view", method="GET")
		public static ModelAndView freeView(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.readFreeView(req));
			mav.addObject("result2", service.freeRepleList(req));// 자유게시판 댓글 리스트 조회
			mav.setView("/FreeBoardView.jsp");
			return mav;
		}
		//자유게시판 뷰 댓글 작성
		@RequestMapping(value = "/main/free/view", method = "POST")
		public static ModelAndView freeViewRegisterReple(HttpServletRequest req) {
			HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			mav.addObject("result", service.freeRepleRegister(req));
			mav.setRedirect();
			mav.setView("/hooligan/main/free/view?pageNo="+req.getParameter("page_no")+"&article_no="+req.getParameter("article_no"));
			return mav;
	}

	// 자유게시판 작성폼으로
	@RequestMapping(value = "/main/free/register", method = "GET")
	public static ModelAndView insertFreeStart(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.setView("/FreeBoardRegister.jsp");
		return mav;
	}
	// 자유게시판 작성하기
	@RequestMapping(value = "/main/free/register", method = "POST")
	public static ModelAndView insertFreeEnd(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.insertFree(req));
		String ggo = "/hooligan/main/free/list";
		mav.setView(ggo);
		mav.setRedirect();
		return mav;
	}
	//자유게시판 수정GET
	@RequestMapping(value="/main/free/update", method="GET")
	public static ModelAndView FreeupdateStart(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.updateFreeStart(req));
		mav.setView("/FreeBoardUpdate.jsp");
		return mav;
	}
	//자유게시판 수정POST
	@RequestMapping(value="/main/free/update", method="POST")
	public static ModelAndView FreeupdateEnd(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", service.updateFreeEnd(req));
		mav.setView("/hooligan/main/free/list");
		mav.setRedirect();
		return mav;
	}

	// 자유게시판 삭제
	@RequestMapping(value = "/main/free/delete", method = "POST")
	public static ModelAndView deletefree(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();

		mav.addObject("result", service.deleteFree(req));
		mav.setView("/hooligan/main/free/list");
		mav.setRedirect();
		return mav;
	}
	//자유게시판 댓글 수정GET
	@RequestMapping(value="/main/free/repleUpdate", method="GET")
	public static ModelAndView freeRepleUpdateStart(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.freeRepleUpdateStart(req));
		mav.setView("/FreeBoardRepleUpdate.jsp");
		return mav;
	}
	//자유게시판 댓글 수정POST
	@RequestMapping(value="/main/free/repleUpdate", method="POST")
	public static ModelAndView freeRepleUpdateEnd(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", service.freeRepleUpdateEnd(req));
		mav.setView("/hooligan/main/free/view?pageNo="+req.getParameter("page_no")+"&article_no="+req.getParameter("article_no"));
		mav.setRedirect();
		return mav;
	}
	//자유게시판 댓글 삭제
	@RequestMapping(value = "/main/free/repleDelete", method = "POST")
	public static ModelAndView deletefreeReple(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();

		mav.addObject("result", service.freeRepleDelete(req));
		mav.setView("/hooligan/main/free/view?pageNo="+req.getParameter("page_no")+"&article_no="+req.getParameter("article_no"));
		mav.setRedirect();
		return mav;
	}
	
	//문의게시판 리스트
	@RequestMapping(value="/main/faq/list", method="GET")
	public static ModelAndView faqList(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		HttpSession sesstion=req.getSession();
		System.out.println(sesstion.getAttribute("customer").toString());
		mav.addObject("result", service.FAQList(req));
		mav.setView("/FAQBoardList.jsp");
		return mav;
	}
	//문의게시판 뷰 / 덧글 리스트
	@RequestMapping(value="/main/faq/view", method="GET")
	public static ModelAndView faqView(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.FAQView(req));
		mav.addObject("result2", service.FAQRepleList(req));
		mav.setView("/FAQBoardView.jsp");
		return mav;
	}	
	

	
	// 자유게시판 작성폼으로
		@RequestMapping(value = "/main/faq/register", method = "GET")
		public static ModelAndView insertFAQStart(HttpServletRequest req) {
			HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			mav.setView("/FAQBoardRegister.jsp");
			return mav;
		}
	
	
	
	//문의게시판 작성
	@RequestMapping(value = "/main/faq/register", method = "POST")
	public static ModelAndView insertFAQEnd(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.FAQInsert(req));
		String ggo = "/hooligan/main/faq/list";
		mav.setView(ggo);
		mav.setRedirect();
		return mav;
	}
	//문의게시판 수정GET
	@RequestMapping(value="/main/faq/update", method="GET")
	public static ModelAndView FAQUpdateStart(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.FAQUdateStart(req));
		mav.setView("/FAQBoardUpdate.jsp");
		return mav;
		}
	//문의게시판 수정POST
	@RequestMapping(value="/main/faq/update", method="POST")
	public static ModelAndView FAQUpdateEnd(HttpServletRequest req) {
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
			
		mav.addObject("result", service.FAQUpdateEnd(req));
		System.out.println("넘어온 페이지 번호넘어온 페이지 번호넘어온 페이지 번호넘어온 페이지 번호넘어온 페이지 번호"+req.getParameter("page_no"));
		mav.setView("/hooligan/main/faq/view?pageNo="+req.getParameter("page_no")+"&inquiry_no="+req.getParameter("inquiry_no"));
		mav.setRedirect();
		return mav;
		
		}
	//문의게시판 삭제
	@RequestMapping(value = "/main/faq/delete", method = "POST")
	public static ModelAndView deleteFAQ(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", service.FAQDelete(req));
		mav.setView("/hooligan/main/faq/list");
		mav.setRedirect();
		return mav;
		}
	//문의게시판 뷰 댓글 작성
	@RequestMapping(value = "/main/faq/view", method = "POST")
	public static ModelAndView faqViewRegisterReple(HttpServletRequest req) {
		HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", service.FAQRepleRegister(req));
		mav.setRedirect();
		mav.setView("/hooligan/main/faq/view?pageNo="+req.getParameter("page_no")+"&inquiry_no="+req.getParameter("inquiry_no"));
		return mav;
		}
	//문의게시판  수정GET
		@RequestMapping(value="/main/faq/repleUpdate", method="GET")
		public static ModelAndView faqRepleUpdateStart(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			mav.addObject("result", service.FAQRepleUpdateStart(req));
			mav.setView("/FAQRepleUpdate.jsp");
			return mav;
		}
		//문의게시판 댓글 수정POST
		@RequestMapping(value="/main/faq/repleUpdate", method="POST")
		public static ModelAndView faqRepleUpdateEnd(HttpServletRequest req) {
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.FAQRepleUpdateEnd(req));
			mav.setView("/hooligan/main/faq/view?pageNo="+req.getParameter("page_no")+"&inquiry_no="+req.getParameter("inquiry_no"));
			mav.setRedirect();
			return mav;
		}	
		//문의게시판 댓글 삭제
		@RequestMapping(value = "/main/faq/repleDelete", method = "POST")
		public static ModelAndView deleteFAQReple(HttpServletRequest req) {
			HooliganService service = (HooliganService) req.getServletContext().getAttribute("service");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("result", service.FAQRepleDelete(req));
			mav.setView("/hooligan/main/faq/view?pageNo="+req.getParameter("page_no")+"&inquiry_no="+req.getParameter("inquiry_no"));
			mav.setRedirect();
			return mav;
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		

}
