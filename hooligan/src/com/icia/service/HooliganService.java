package com.icia.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.icia.dao.HooliganDao;
import com.icia.util.*;
import com.icia.vo.*;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class HooliganService {
	private HooliganDao dao;
	public HooliganService(HooliganDao dao) {
		this.dao = dao;}
	public ArrayList<HashMap<String , Object>> mainView(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		JdbcUtil.close(conn);
		return null;
	}

	//회원로그인하기
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
	
	//회원등록
	public int customerInsert(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		System.out.println("여기까지왓다매");
		int result=dao.insertCustomer(conn, MappingUtil.makeCustomer(req));
		JdbcUtil.close(conn);
		 return result;
	
	}
	//회원업데이트 시작
	public String customerUpdateStart(HttpServletRequest req, String customerId) {
		Connection conn=JdbcUtil.getConnection();
		Customer customer=dao.updateCustomerStart(conn,customerId);
		JsonObject ob=new JsonObject();
		HashMap<String,Object>map=new HashMap<>();
		map.put("customer",customer);
		JdbcUtil.close(conn);
		return new Gson().toJson(map);
	}
	//회원업데이트하기
	public Customer customerUpdateEnd(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		Customer customer=MappingUtil.makeUpdateCustomer(req);
		dao.updateCustomerEnd(conn, customer);
		Customer c=dao.customerUpdateSession(conn, customer.getCustomerId());
		JdbcUtil.close(conn);
		return c;
		
	}//회원삭제하기
	public int customerDelete(HttpServletRequest req, String customer_id) {
		Connection conn=JdbcUtil.getConnection();
		HashMap<String, String> map=new HashMap<>();
		System.out.println("고객의 아이디는:"+customer_id);
		map.put("customer_id", customer_id);
		map.put("customer_pwd", req.getParameter("customer_pwd"));
		System.out.println("고객의 비밀번호는:"+req.getParameter("customer_pwd"));
		int result=dao.deleteCustomer(conn, map);
		JdbcUtil.close(conn);
		return result;
		
	}
	//회원아이디찾기
		public Object customerSeachId(HttpServletRequest req) {
			System.out.println("들어왓냐이년아");
			Connection conn=JdbcUtil.getConnection();
			HashMap<String, String> map=new HashMap<>();
		
			System.out.println("두번쨰"+req.getParameter("ssn1"));
			map.put("ssn1", req.getParameter("ssn1"));
			map.put("ssn2", req.getParameter("ssn2"));
			JsonObject ob=new JsonObject();
			String customerId=dao.customerSeachId(conn,map);
			ob.addProperty("result", customerId);
			JdbcUtil.close(conn);
			return new Gson().toJson(ob);
		}
		//회원패스워드찾기
		public Object customerSeachPwd(HttpServletRequest req) {
			Connection conn=JdbcUtil.getConnection();
			HashMap<String, String> map=new HashMap<>();	
			map.put("ssn1", req.getParameter("ssn1"));
			map.put("ssn2", req.getParameter("ssn2"));
			map.put("customer_id", req.getParameter("customer_id"));
			JsonObject ob=new JsonObject();
			String customerPwd=dao.customerSeachPwd(conn,map);
			ob.addProperty("result", customerPwd);
			JdbcUtil.close(conn);
			return new Gson().toJson(ob);
			
		}
	//!!!!!!!!!!!!!!!여기까지 회원!!!!!!!!!!!!!!!!!!!!!!!!!!
	//직원로그인하기
	public String EmployeeLogin(HttpServletRequest req) {
		Connection conn = JdbcUtil.getConnection();
		HttpSession sesstion=req.getSession();
		  HashMap<String, String> employee = new HashMap<>();
		  employee.put("employee_id", req.getParameter("employee_id"));
		  employee.put("employee_pwd", req.getParameter("employee_pwd"));
		  System.out.println("아이디는:"+req.getParameter("employee_id")+"비밀번호는:"+req.getParameter("employee_pwd"));
		  Employee result = null; 
		  JsonObject ob=new JsonObject();
		  
		  if(null!=dao.EmployeeLogin(conn, employee)){
			Employee emp=dao.EmployeeLogin(conn, employee);
			int brandNo=emp.getBrandNo();
			Brand b=dao.BrandselectByBrandNO(conn,brandNo);
			emp.setBrandContent(b.getBrandContent());
			emp.setBrandName(b.getBrandName());
			emp.setCompanyTell(b.getCompanyTell());
			emp.setImage_path(b.getImagePath());
			sesstion.setAttribute("employee", emp);
			
		  }else 
			 ob.addProperty("result", "아이디와 비밀번호를 확인하세요");
		  JdbcUtil.close(conn);
		  return new Gson().toJson(ob);
	
	}


	//직원등록1단계
	public int employeeRegisterEnd(HttpServletRequest req){
		Connection conn=JdbcUtil.getConnection();
		int maxBrand=dao.maxBrandNo(conn);
		int result=dao.insertEmployee(conn, MappingUtil.makeEmployee(req,maxBrand));
		System.out.println("결과가모냐고 시발년아"+result);
		JdbcUtil.close(conn);
		return 0;
	}//직원등록2단계
	public void employeeRegisterEnd2(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		int maxBrand=dao.maxBrandNo(conn);
		System.out.println("시발년아들어와라"+req.getParameter("imagepath"));
		Brand b=(Brand)MappingUtil.makeBrand(req,maxBrand);
		System.out.println(b.toString());
		int result=dao.insertEmployee2(conn,b);
		JdbcUtil.close(conn);
	}//직원등록3단계
	public String employeeRegisterEnd3(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		int maxBrand=dao.maxBrandNo(conn);
		int maxProduct=dao.maxProductNo(conn);
		BrandProduct b=(BrandProduct)MappingUtil.makeBrandProduct(req,maxBrand,maxProduct);
		int result=dao.insertEmployee3(conn,b);
		JdbcUtil.close(conn);
		JsonObject ob=new JsonObject();
		if(result==0){
		ob.addProperty("result","회원등록에 실패했습니다" );
		}else ob.addProperty("result", "회원가입되었습니다");
		return  new Gson().toJson(ob);
	}
	//직원업데이트
	public String employeeUpdateEnd(HttpServletRequest req) {
	Connection conn=JdbcUtil.getConnection();
	Employee e=MappingUtil.updateEmployee(req);
	int resultE=dao.updateEmployee(conn, e);
	Brand b=new Brand();
	b.setBrandContent(e.getBrandContent());
	b.setBrandName(e.getBrandName());
	b.setBrandNo(e.getBrandNo());
	b.setCompanyTell(e.getCompanyTell());
	b.setImagePath(e.getImage_path());
	int  resultB=dao.updateBrand(conn, b);
	String result=null;
	if(resultB==0||resultE==0) result="업데이트에 실패했습니다"; 
	JdbcUtil.close(conn);
		return new Gson().toJson(result);
	}
	//직원상품등록 종류가져오기
		public ArrayList<HashMap<String, Object>> employeeProductRegisterStart(HttpServletRequest req) {
			Connection conn=JdbcUtil.getConnection();
			System.out.println("들어왓습니까??");
			ArrayList<HashMap<String, Object>> result=dao.productSort(conn);
			JdbcUtil.close(conn);
			return result;
		}
	//직원상품등록하기
	public void employeeProductRegister(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		int maxProduct=dao.maxPno(conn);
		Product p=(Product)MappingUtil.makeRegisterProduct(req,maxProduct);
		dao.insertProduct(conn, p);
		JdbcUtil.close(conn);
	}

	//공지사항 게시글
	public String readNotice(HttpServletRequest req){
		Connection conn= JdbcUtil.getConnection();
		int pageNo=1;
		if(req.getParameter("pageNo")!=null)
			pageNo= Integer.parseInt(req.getParameter("pageNo"));
		int numberOfTotalArticle = dao.NoticeCount(conn);
		Pagination pagination = PagingUtil.setPageMaker(pageNo, numberOfTotalArticle);
		ArrayList<Notice> list = dao.NoticeList(conn, pagination.getStartArticle(), pagination.getEndArticle());
		HashMap<String,Object> map = new HashMap<>();
		map.put("pagination", pagination);
		map.put("list", list);
		System.out.println("게시판어떻냐"+map.get(list));
		JdbcUtil.close(conn);
		return new Gson().toJson(map);
		
		
	}
	//공지사항 등록
	public String insertNotice(HttpServletRequest req){
		Connection conn= JdbcUtil.getConnection();
		Notice notice = new Notice();
		notice.setTitle(req.getParameter("title"));
		notice.setContent(req.getParameter("content"));
		
		int result = dao.insertNotice(conn, notice);		
		JsonObject ob = new JsonObject();
		if(result==1) ob.addProperty("result", "success");
		else ob.addProperty("result", "fail");
		JdbcUtil.close(conn);
		return new Gson().toJson(ob);
		
	}
	//공지사항 뷰
	public String noticeView(HttpServletRequest req){
		Connection conn = JdbcUtil.getConnection();
		Notice notice = dao.noticeView(conn, Integer.parseInt(req.getParameter("notice_article_no")));
		JdbcUtil.close(conn);
		return new Gson().toJson(notice);
	}
	//공지사항 수정 GET
	public String noticeUpdateStart(HttpServletRequest req){
		Connection conn = JdbcUtil.getConnection();
		Notice notice = dao.noticeView(conn, Integer.parseInt(req.getParameter("notice_article_no")));
		HashMap<String,Object> map = new HashMap<>();
		map.put("notice", notice);
		JdbcUtil.close(conn);
		return new Gson().toJson(map);
		
	}
	//공지사항 수정 POST
	public String noticeUpdateEnd(HttpServletRequest req){
		Connection conn = JdbcUtil.getConnection();
		Notice notice = new Notice();
		System.out.println(req.getParameter("noticeArticleNo"));
		System.out.println(req.getParameter("content"));
		System.out.println(req.getParameter("title"));
		
		int noticeArticleNo = Integer.parseInt(req.getParameter("noticeArticleNo"));
																 
	
		int result = dao.updateNotice(conn, MappingUtil.getNoticeMaker(req, noticeArticleNo));
		
		JsonObject ob = new JsonObject();
		
		if(result==1) ob.addProperty("result", "success");
		else ob.addProperty("result", "fail");
		JdbcUtil.close(conn);
		
		return new Gson().toJson(ob);
	}
	
	//공지사항 삭제
	public String noticeDelete(HttpServletRequest req){
		Connection conn = JdbcUtil.getConnection();
		Notice notice = new Notice();
		System.out.println(req.getParameter("noticeArticleNo"));
		int noticeArticleNo = Integer.parseInt(req.getParameter("noticeArticleNo"));
		
		int result = dao.deleteNotice(conn, noticeArticleNo);
		
		JsonObject ob = new JsonObject();
		
		if(result==0) ob.addProperty("result", "fail");
		else ob.addProperty("result", "success");
		JdbcUtil.close(conn);
		
		return new Gson().toJson(ob);
	}
	//메인화면 최근 제품가져오기
	public Object mainRecentProduct(HttpServletRequest req) {
	Connection conn=JdbcUtil.getConnection();
	ArrayList<Product> p=dao.mainRecentProduct(conn);
	JdbcUtil.close(conn);
		return new Gson().toJson(p);
	}
	//메인화면에서 인기상품가져오기
	public Object mainHitProduct(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		ArrayList<Product> p=dao.mainHitProduct(conn);
		JdbcUtil.close(conn);
			return new Gson().toJson(p);
		}

	//직원이 등록한 상품조회
	public Object employeeProductList(HttpServletRequest req) {
		Connection conn=JdbcUtil.getConnection();
		HttpSession session=req.getSession();
		Employee emp=(Employee)session.getAttribute("employee");
		int pageNo=1;
		if(req.getParameter("pageNo")!=null)
			pageNo=Integer.parseInt(req.getParameter("pageNo"));
		int numberOfProduct=dao.employeeSelectCount(conn,emp.getEmployeeId());
		Pagination pagination=PagingUtil.setPageMaker(pageNo, numberOfProduct);
		
		ArrayList<Product> p=dao.productList(conn,emp.getEmployeeId(),pagination.getStartArticle(),pagination.getEndArticle());
		HashMap<String, Object> map=new HashMap<>();
		map.put("pagination", pagination);
		map.put("list", p);
		JdbcUtil.close(conn);
		return new Gson().toJson(map);
	}

}















