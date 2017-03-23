package com.icia.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.icia.dao.HooliganDao;
import com.icia.util.JdbcUtil;
import com.icia.vo.Customer;

public class HooliganService {
	private HooliganDao dao;
	public HooliganService(HooliganDao dao) {
		this.dao = dao;}
	public ArrayList<HashMap<String , Object>> mainView(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		
		return null;
	}
	public int employeeRegisterEnd(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		return 0;
	}
	public Customer customerLogin(HttpServletRequest req) {
		Connection conn = JdbcUtil.getConnection();
		  HashMap<String, String> customer = new HashMap<>();
		  customer.put("customer_id", req.getParameter("customer_id"));
		  customer.put("customer_pwd", req.getParameter("customer_pwd"));
		  Customer result = null; 
		  result = dao.customerLogin(conn, customer);
		  JdbcUtil.close(conn);
		  return result;
	}
	
}

