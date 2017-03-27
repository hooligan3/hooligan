package com.icia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.icia.service.HooliganService;
import com.icia.vo.Customer;
import com.icia.vo.Employee;

import di.ModelAndView;
import di.RequestMapping;

public class EmployeeContoller {
	//직원로그인폼으로
			@RequestMapping(value="/employee/login",method="GET")
			public static ModelAndView loginStart(HttpServletRequest req){
				ModelAndView mav=new ModelAndView();
				  HttpSession session = req.getSession();
				  if(session.getAttribute("employee")!=null) mav.setView("/Main.jsp");
				  else mav.setView("/EmployeeLogin.jsp");
				  String go = (String) session.getAttribute("destination");
				  System.out.println("go:" + go);
				
				return mav;
			}
		//직원로그인하기
		@RequestMapping(value="/employee/login",method="POST")
		public static ModelAndView loginEnd(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			System.out.println("로그인나아아아ㅏ");
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			mav.setView("/Main.jsp");
			Employee employee = service.EmployeeLogin(req);
			  if (employee== null) {
			   System.out.println("아이디나 비밀번호 확인필요");
			   String result="아이디와 비밀번호를 확인하십시요";
			   mav.setView("/hooligan/employee/login");
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
			   session.setAttribute("employee", employee);
			   mav.setView(go);
			   mav.setRedirect();
			  }
			  return mav;
		}
		//직원로그아웃하기
			  @RequestMapping(value="/customer/logout",method="GET")
		public static ModelAndView employeeLogout(HttpServletRequest req){
				  ModelAndView mav=new ModelAndView();
				  HttpSession sesstion=req.getSession();
				  sesstion.removeAttribute("customer");
				  mav.setView("/hooligan/main/index");
				  mav.setRedirect();
				 return mav;
			  }
		
		//직원등록하기폼으로
		@RequestMapping(value="/customer/register",method="GET")
		public static ModelAndView customerRegisterStart(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			  HttpSession session = req.getSession();
			  if(session.getAttribute("customer")!=null) mav.setView("/Main.jsp");
			  else mav.setView("/CustomerRegister.jsp");
		
			return mav;
		}
		//직원등록하기
		@RequestMapping(value="/customer/register",method="POST")
		public static ModelAndView customerRegiserEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			System.out.println("고객등록여기까지들어왓냐");
			System.out.println("주소는"+req.getParameter("address"));
			mav.addObject("result", service.customerInsert(req));
			String ggo="/hooligan/main/index";
			  mav.setView(ggo);
			  mav.setRedirect();
			  return mav;

		}
		//직원업데이트폼으로
		@RequestMapping(value="/customer/update",method="GET")
		public static ModelAndView customerUpdateStart(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			HttpSession sesstion=req.getSession();
			mav.setView("/CustomerUpdate.jsp");
			return mav;
		}
		//직원업데이트하기
		@RequestMapping(value="/customer/update",method="POST")
		public static ModelAndView customerUpdateEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			Customer customer=service.customerUpdateEnd(req);
			 HttpSession session = req.getSession();
			 session.removeAttribute("customer");
			 session.setAttribute("customer", customer);
			mav.setView("/hooligan/main/index");
			mav.setRedirect();
			return mav;
		}
		//직원삭제하기폼으로
		@RequestMapping(value="/customer/delete",method="GET")
		public static ModelAndView customerDeleteStart(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			mav.setView("/CustomerDelete.jsp");
			return mav;
		}
		//직원삭제하기
		@RequestMapping(value="/customer/delete",method="POST")
		public static ModelAndView customerDeleteEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			HttpSession session=req.getSession();
			Customer c=(Customer)session.getAttribute("customer");
			String customer_id=c.getCustomerId();
			int result=service.customerDelete(req,customer_id);
			if(result==1) session.removeAttribute("customer");
			else mav.addObject("result", "비밀번호를 확인하시오");
			mav.setView("/hooligan/main/index");
			mav.setRedirect();
			return mav;
		}
	
}
