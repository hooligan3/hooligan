package com.icia.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.icia.dao.HooliganDao;
import com.icia.util.JdbcUtil;

public class HooliganService {
	private HooliganDao dao;
	public HooliganService(HooliganDao dao) {
		this.dao = dao;}
	public ArrayList<HashMap<String , Object>> mainView(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		
		return null;
	}
}

