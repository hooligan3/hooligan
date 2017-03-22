package controller;

import javax.servlet.http.HttpServletRequest;

import di.ModelAndView;
import di.RequestMapping;
import service.HooliganService;

public class HooliganController {
	
	public static ModelAndView main(HttpServletRequest req){
		HooliganService service=(HooliganService)req.getServletContext().getAttribute("service");
		ModelAndView mav=new ModelAndView();
	return mav;
	}
	@RequestMapping(value="/customer/login",method="GET")
	public static ModelAndView loginStart(HttpServletRequest req){
		ModelAndView mav=new ModelAndView();
		
		mav.setView("/login_form.html");
		return mav;
	}
}
