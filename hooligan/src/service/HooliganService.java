package service;



import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import dao.HooliganDao;
import util.JdbcUtil;

public class HooliganService {
	private HooliganDao dao;
	public HooliganService(HooliganDao dao) {
		this.dao = dao;
	public ArrayList<HashMap<String , Object>> Best(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		
	}
}
}