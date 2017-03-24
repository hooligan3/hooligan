package com.icia.util;

import javax.servlet.http.HttpServletRequest;

import com.icia.vo.Customer;

public class MappingUtil {
	public static Customer	makeCustomer(HttpServletRequest req){
		Customer customer=new Customer();
		customer.setAddress(req.getParameter("address"));
		customer.setCustomerId(req.getParameter("id"));
		customer.setCustomerName(req.getParameter("username"));
		customer.setCustomerPwd(req.getParameter("password"));
		customer.setEmail(req.getParameter("email"));
		customer.setGradeNo(1);
		customer.setPostalNo(Integer.parseInt(req.getParameter("postal_number")));
		customer.setPoint(0);
		customer.setSsn1(req.getParameter("ssn1"));
		customer.setSsn2(req.getParameter("ssn2"));
		customer.setTell(Integer.parseInt(req.getParameter("phone_number")));
		return customer;
	}
	public static Customer	makeUpdateCustomer(HttpServletRequest req){
		Customer customer=new Customer();
		customer.setAddress(req.getParameter("address"));
		customer.setCustomerId(req.getParameter("customer_id"));
		customer.setCustomerName(req.getParameter("customer_name"));
		customer.setCustomerPwd(req.getParameter("customer_pwd"));
		customer.setEmail(req.getParameter("email"));
		
		customer.setPostalNo(Integer.parseInt(req.getParameter("postal_no")));
		customer.setSsn1(req.getParameter("ssn1"));
		customer.setSsn2(req.getParameter("ssn2"));
		customer.setTell(Integer.parseInt(req.getParameter("tell")));
		return customer;
	}
}
