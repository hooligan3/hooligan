package com.icia.util;

import javax.servlet.http.HttpServletRequest;

import com.icia.vo.Customer;
import com.icia.vo.Employee;

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
		customer.setPoint1(0);
		customer.setSsn1(req.getParameter("ssn1"));
		customer.setSsn2(req.getParameter("ssn2"));
		customer.setTell(req.getParameter("phone_number"));
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
		customer.setTell(req.getParameter("tell"));
		return customer;
	}
	public static Employee makeEmployee(HttpServletRequest req, int maxBrand) {
		Employee e=new Employee();
		e.setActive(1);
		e.setAddress(req.getParameter("address"));
		e.setBrandNo(maxBrand+1);
		e.setEmail(req.getParameter("email"));
		e.setEmployeeId(req.getParameter("employee_id"));
		e.setEmployeePwd(req.getParameter("employee_pwd"));
		e.setEname(req.getParameter("employee_name"));
		e.setPoint1(0);
		e.setPostalNo(Integer.parseInt(req.getParameter("postal_no")));
		e.setSsn1(req.getParameter("ssn1"));
		e.setSsn2(req.getParameter("ssn2"));
		e.setTell(req.getParameter("tell"));
		return e;
		
		
		
		return null;
	}
}
