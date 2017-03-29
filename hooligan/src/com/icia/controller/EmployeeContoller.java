package com.icia.controller;

import java.util.ArrayList;
import java.util.HashMap;

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
			mav.setView("/EmployeeLogin.jsp");
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
			    go = "/hooligan/employee/update";
			   session.setAttribute("employee", employee);
			   mav.setView(go);
			   mav.setRedirect();
			  }
			  return mav;
		}
		//직원로그아웃하기
			  @RequestMapping(value="/employee/logout",method="GET")
		public static ModelAndView employeeLogout(HttpServletRequest req){
				  ModelAndView mav=new ModelAndView();
				  HttpSession sesstion=req.getSession();
				  sesstion.removeAttribute("employee");
				  mav.setView("/hooligan/employee/login");
				  mav.setRedirect();
				 return mav;
			  }
		
		//직원등록하기 1단계폼으로
		@RequestMapping(value="/employee/register",method="GET")
		public static ModelAndView customerRegister1Start(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			  HttpSession session = req.getSession();
			  if(session.getAttribute("employee")!=null) mav.setView("/main/select");
			  else mav.setView("/EmployeeRegister.jsp");
		
			return mav;
		}
		//직원등록하기 1단계
		@RequestMapping(value="/employee/register",method="POST")
		public static ModelAndView customerRegister1End(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			service.employeeRegisterEnd(req);
			mav.setView("/hooligan/employee/register2");
			 return mav;

		}
		//직원등록하기 2단계폼으로
		@RequestMapping(value="/employee/register2",method="GET")
		public static ModelAndView customerRegister2Start(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			  mav.setView("/EmployeeRegisterBrand.jsp");
			  return mav;

		}
		//직원등록하기 2단계
				@RequestMapping(value="/employee/register2",method="POST")
				public static ModelAndView customerRegister2End(HttpServletRequest req){
					HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
					ModelAndView mav=new ModelAndView();
					service.employeeRegisterEnd2(req);
					  mav.setView("/hooligan/employee/register3");
					  mav.setRedirect();
					  return mav;

				}
				//직원등록하기 3단계 폼으로
				@RequestMapping(value="/employee/register3",method="GET")
				public static ModelAndView customerRegister3Start(HttpServletRequest req){
					HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
					ModelAndView mav=new ModelAndView();
					//mav.addObject("result", service.employeeRegisterEnd(req));
					  mav.setView("/EmployeeRegisterProduct.jsp");
					  return mav;

				}
				//직원등록하기 3단계 가입완료
				@RequestMapping(value="/employee/register3",method="POST")
				public static ModelAndView customerRegister3End(HttpServletRequest req){
					HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
					ModelAndView mav=new ModelAndView();
				String result=service.employeeRegisterEnd3(req);
					String ggo="/hooligan/main/index";
					  mav.setView(ggo);
					  mav.setRedirect();
					  return mav;

				}
				
		
		//직원업데이트폼으로
		@RequestMapping(value="/employee/update",method="GET")
		public static ModelAndView customerUpdateStart(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			HttpSession sesstion=req.getSession();
			mav.setView("/EmployeeUpdate.jsp");
			return mav;
		}
		//직원업데이트하기
		@RequestMapping(value="/employee/update",method="POST")
		public static ModelAndView customerUpdateEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			Employee employee=service.employeeUpdateEnd(req);
			 HttpSession session = req.getSession();
			 session.removeAttribute("employee");
			 session.setAttribute("employee", employee);
			mav.setView("/hooligan/employee/update");
			return mav;
		}
		//직원탈퇴하기폼으로
		@RequestMapping(value="/employee/delete",method="GET")
		public static ModelAndView customerDeleteStart(HttpServletRequest req){
			ModelAndView mav=new ModelAndView();
			mav.setView("/CustomerDelete.jsp");
			return mav;
		}
		//직원탈퇴하기
		@RequestMapping(value="/employee/delete",method="POST")
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
		//직원상품등록폼으로
		@RequestMapping(value="/employee/productRegister",method="GET")
		public static ModelAndView employeeProductRegisterStart(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			ModelAndView mav=new ModelAndView();
			ArrayList<HashMap<String, Object>> result=service.employeeProductRegisterStart(req);
			mav.addObject("result", result);
			mav.setView("/EmployeeProductRegister.jsp");
			return mav;
		}
		//직원상품등록하기
		@RequestMapping(value="/employee/productRegister",method="POST")
		public static ModelAndView employeeProductRegisterEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			service.employeeProductRegister(req);
			ModelAndView mav=new ModelAndView();
			mav.setView("/hooligan/employee/productList");
			return mav;
		}
		//직원상품리스트폼으로
		@RequestMapping(value="/employee/productList",method="GET")
		public static ModelAndView employeeProductListStart(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			service.employeeProductRegister(req);
			ModelAndView mav=new ModelAndView();
			mav.setView("/EmployeeProductList.jsp");
			return mav;
		}
		//주문한회원조회리스트
		
		//직원환급하기폼으로
		@RequestMapping(value="/employee/refund",method="GET")
		public static ModelAndView employeeRefundStart(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			service.employeeProductRegister(req);
			ModelAndView mav=new ModelAndView();
			mav.setView("/EmployeeRefund.jsp");
			return mav;
		}
		//직원환급하기
		@RequestMapping(value="/employee/refund",method="POST")
		public static ModelAndView employeeRefundEnd(HttpServletRequest req){
			HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
			service.employeeProductRegister(req);
			ModelAndView mav=new ModelAndView();
			mav.setView("/hooligan/employee/refund");
			return mav;
		}
}
