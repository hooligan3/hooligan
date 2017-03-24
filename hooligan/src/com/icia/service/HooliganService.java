package com.icia.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.icia.dao.HooliganDao;
import com.icia.util.JdbcUtil;
import com.icia.util.MappingUtil;
import com.icia.vo.Customer;

public class HooliganService {
	private HooliganDao dao;
	public HooliganService(HooliganDao dao) {
		this.dao = dao;}
	public ArrayList<HashMap<String , Object>> mainView(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		JdbcUtil.close(conn);
		return null;
	}
	public int employeeRegisterEnd(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		JdbcUtil.close(conn);
		return 0;
	}
	//고객로그인하기
	public Customer customerLogin(HttpServletRequest req) {
		Connection conn = JdbcUtil.getConnection();
		  HashMap<String, String> customer = new HashMap<>();
		  customer.put("customer_id", req.getParameter("id"));
		  customer.put("customer_pwd", req.getParameter("password"));
		  System.out.println("아이디는:"+req.getParameter("id")+"비밀번호는:"+req.getParameter("password"));
		  Customer result = null; 
		  if(null!=dao.customerLogin(conn, customer))
			 return  dao.customerLogin(conn, customer);
		  System.out.println("결과값은"+result);
		  JdbcUtil.close(conn);
		  return result;
	}
	public int customerInsert(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		System.out.println("여기까지왓다매");
		int result=dao.insertCustomer(conn, MappingUtil.makeCustomer(req));
		JdbcUtil.close(conn);
		 return result;
	

	}
	public String customerUpdateStart(HttpServletRequest req, String customerId) {
		Connection conn=JdbcUtil.getConnection();
		Customer customer=dao.updateCustomerStart(conn,customerId);
		JsonObject ob=new JsonObject();
		HashMap<String,Object>map=new HashMap<>();
		map.put("customer",customer);
		JdbcUtil.close(conn);
		return new Gson().toJson(map);
	}
	public String customerUpdateEnd(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		Customer customer=MappingUtil.makeUpdateCustomer(req);
		int result=dao.updateCustomerEnd(conn, customer);
		HashMap<String,Object> map=new HashMap<>();
		map.put("result",result);
		JsonObject ob=new JsonObject();
		return new Gson().toJson(map);
		
	}
	
}

