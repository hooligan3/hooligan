package com.icia.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.icia.dao.HooliganDao;
import com.icia.service.HooliganService;

import di.AnnotationRunner;
import di.ModelAndView;

@WebServlet({"/employee/*", "/main/*","/customer/*","/product/*","/admin/*","/notice/*","/free/*","/faq/*"})
public class DispatcherServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		super.init();
		HooliganDao dao = new HooliganDao();
		HooliganService service = new HooliganService(dao);
		ServletContext context = getServletContext();
		context.setAttribute("service", service);
		String path = getServletContext().getRealPath("/");
		String packageName = getServletContext().getInitParameter("packageName");
		AnnotationRunner.getRequestMapping(path, packageName);
		
	}
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = AnnotationRunner.execute(request);
		if(mav.getView()==null) {
			HashMap<String,Object> model = mav.getModel();
			response.setContentType("application/x-json; charset=UTF-8");
			PrintWriter out = response.getWriter();
			System.out.println("리절트 1은"+model.get("result"));
			System.out.println("리절트 2는 "+model.get("result2"));
			out.print(model.get("result"));
			out.print(model.get("result2"));
			out.flush();
		}
		else {
			if (mav.isRedirect() == false) {
				HashMap<String,Object> model = mav.getModel();
				Set<String> set = model.keySet();
				for(String name:set)
					request.setAttribute(name, model.get(name));
				RequestDispatcher rd = request.getRequestDispatcher(mav.getView());
				rd.forward(request, response);
			} else {
				String destination = mav.getView();
				if(mav.getView().equals("/")) 
					destination = "/" + request.getServletContext().getInitParameter("webappName");
				System.out.println(destination);
				response.sendRedirect(destination);
			}
		}	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
}
