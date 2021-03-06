package com.icia.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import com.icia.util.JdbcUtil;
import com.icia.util.MappingUtil;
import com.icia.vo.Bookmark;
import com.icia.vo.Brand;
import com.icia.vo.BrandProduct;
import com.icia.vo.Customer;
import com.icia.vo.Employee;
import com.icia.vo.FreeBoard;
import com.icia.vo.FreeReple;
import com.icia.vo.InquiryBoard;
import com.icia.vo.InquiryReple;
import com.icia.vo.Notice;
import com.icia.vo.Order;
import com.icia.vo.PointCharge;
import com.icia.vo.PointRefund;
import com.icia.vo.Product;
import com.icia.vo.Type;

public class HooliganDao {

	// 고객 회원가입 Insert
	public int insertCustomer(Connection conn, Customer customer) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.insertCustomer);
			pstmt.setString(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerPwd());
			pstmt.setString(3, customer.getCustomerName());
			pstmt.setInt(4, customer.getPostalNo());
			pstmt.setString(5, customer.getAddress());
			pstmt.setString(6, customer.getTell());
			pstmt.setString(7, customer.getSsn1());
			pstmt.setString(8, customer.getSsn2());
			pstmt.setString(9, customer.getEmail());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//회원업데이트 정보가져오기
	public Customer updateCustomerStart(Connection conn,String customerId){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.updateCustomerStart);
			pstmt.setString(1, customerId);
			rs = pstmt.executeQuery();
			Customer c = new Customer();
			if (rs.next()) {
				c.setAddress(rs.getString("address"));
				c.setCustomerId(rs.getString("customer_id"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setCustomerPwd(rs.getString("customer_pwd"));
				c.setEmail(rs.getString(rs.getString("email")));
				c.setGradeNo(rs.getInt("grade_no"));
				c.setPostalNo(rs.getInt("postal_no"));
				c.setSsn1(rs.getString("ssn1"));
				c.setSsn2(rs.getString("ssn2"));
				c.setTell(rs.getString("tell"));
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;

	}

	// 고객정보 수정 Update
	public int updateCustomerEnd(Connection conn, Customer customer) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.updateCustomer);
			pstmt.setString(1, customer.getCustomerPwd());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setInt(3, customer.getPostalNo());
			pstmt.setString(4, customer.getAddress());
			pstmt.setString(5, customer.getTell());
			pstmt.setString(6, customer.getEmail());
			pstmt.setString(7, customer.getCustomerId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	//업데이트할때 세션얻어오기
	public Customer customerUpdateSession(Connection conn, String customer_id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer c = new Customer();
		try {
			pstmt = conn.prepareStatement(CustomerSql.updateSesstionCustomer);
			pstmt.setString(1, customer_id);
			rs = pstmt.executeQuery();
			if (rs.next()){
				c.setCustomerId(rs.getString("customer_id"));
				c.setCustomerPwd(rs.getString("customer_pwd"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setPostalNo(rs.getInt("postal_no"));
				c.setAddress(rs.getString("address"));
				c.setTell(rs.getString("tell"));
				c.setSsn1(rs.getString("ssn1"));
				c.setSsn2(rs.getString("ssn2"));
				c.setEmail(rs.getString("email"));
				c.setPoint1(rs.getInt("point1"));
				c.setGradeNo(rs.getInt("grade_no"));
				c.setGradeName(rs.getString("grade_name"));
				c.setDiscountRate(rs.getFloat("discount_rate"));
				System.out.println(c.toString());
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	
	// 고객회원탈퇴 Delete
	public int deleteCustomer(Connection conn, HashMap<String, String>map ) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.deleteCustomer);
			pstmt.setString(1,map.get("customer_id"));
			pstmt.setString(2, map.get("customer_pwd"));
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	// 고객로그인 CustomerLogin
	public Customer customerLogin(Connection conn, HashMap<String, String> customer) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer c = new Customer();
		try {
			pstmt = conn.prepareStatement(CustomerSql.loginCustomer);
			pstmt.setString(1, customer.get("customer_id"));
			pstmt.setString(2, customer.get("customer_pwd"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				c.setCustomerId(rs.getString("customer_id"));
				c.setCustomerPwd(rs.getString("customer_pwd"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setPostalNo(rs.getInt("postal_no"));
				c.setAddress(rs.getString("address"));
				c.setTell(rs.getString("tell"));
				c.setSsn1(rs.getString("ssn1"));
				c.setSsn2(rs.getString("ssn2"));
				c.setEmail(rs.getString("email"));
				c.setPoint1(rs.getInt("point1"));
				c.setGradeNo(rs.getInt("grade_no"));
				c.setGradeName(rs.getString("grade_name"));
				c.setDiscountRate(rs.getFloat("discount_rate"));
				System.out.println(c.toString());
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}

	// 고객 아이디 중복 체크 DoubleIdCheck
	public int customerDoubleIdCheck(Connection conn, String customerId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.doubleIdCheck);
			pstmt.setString(1, customerId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return -1;
	}

	// 회원 아이디 찾기 CustomerSelectById
	public String customerSeachId(Connection conn, HashMap<String, String> map) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(CustomerSql.selectById);

		pstmt.setString(1, map.get("ssn1"));
		pstmt.setString(2, map.get("ssn2"));
		rs=	pstmt.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getString("customer_id"));
				return rs.getString("customer_id");
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	//회원비밀번호찾기
	public String customerSeachPwd(Connection conn, HashMap<String, String> map) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.selectByPwd);
			pstmt.setString(1, map.get("customer_id"));
			pstmt.setString(2, map.get("ssn1"));
			pstmt.setString(3, map.get("ssn2"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getString("customer_pwd");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}return null;
	}



	//////////////////////////////////////////////////////////////////////////////////
	
	// 직원 회원가입 InsertEmployee
	public int insertEmployee(Connection conn, Employee employee) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(EmpSql.insertEmployee);
			pstmt.setString(1, employee.getEmployeeId());
			pstmt.setString(2, employee.getEmployeePwd());
			pstmt.setString(3, employee.getEname());
			pstmt.setInt(4, employee.getPostalNo());
			pstmt.setString(5, employee.getAddress());
			pstmt.setString(6, employee.getSsn1());
			pstmt.setString(7, employee.getSsn2());
			pstmt.setString(8, employee.getEmail());
			pstmt.setString(9, employee.getTell());
			pstmt.setInt(10, employee.getActive());// 0 이면 비활성화 1이면 활성화
			pstmt.setInt(11, employee.getBrandNo());
			pstmt.setInt(12, employee.getPoint1());
			
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//직원회원가입 브랜드입력
	public int insertEmployee2(Connection conn, Brand b) {
		PreparedStatement pstmt = null;
		try {
			pstmt=conn.prepareStatement(EmpSql.insertBrand);
			pstmt.setInt(1, b.getBrandNo());
			pstmt.setString(2, b.getBrandName());
			pstmt.setString(3, b.getBrandContent());
			pstmt.setString(4, b.getCompanyTell());
			pstmt.setString(5, b.getImagePath());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt, null);
		}
		return 0;
	}//직원회원가입 브랜드제품입력
	public int insertEmployee3(Connection conn, BrandProduct b) {
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(EmpSql.insertPreProduct);
			pstmt.setInt(1,b.getBrandNo());
			pstmt.setInt(2, b.getProductNo());
			pstmt.setString(3, b.getProductName());
			pstmt.setString(4, b.getProductContent());
			pstmt.setString(5, b.getImagePath());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt, null);
		}
		return 0;
	}


	// 직원정보 수정 UpdateEmployee
	public int updateEmployee(Connection conn, Employee employee) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(EmpSql.updateEmployee);
			pstmt.setString(1, employee.getEmployeePwd());
			pstmt.setInt(2, employee.getPostalNo());
			pstmt.setString(3, employee.getAddress());
			pstmt.setString(4, employee.getEmail());
			pstmt.setString(5, employee.getTell());
			pstmt.setString(6, employee.getEmployeeId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return 0;
	}
	//직원업데이트(브랜드분야)
	public int updateBrand(Connection conn, Brand b) {
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(EmpSql.updateBrand);
			pstmt.setString(1, b.getBrandName());
			pstmt.setString(2, b.getBrandContent());
			pstmt.setString(3, b.getCompanyTell());
			pstmt.setString(4, b.getImagePath());
			pstmt.setInt(5, b.getBrandNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// 직원탈퇴 DeleteEmployee
	public int deleteEmployee(Connection conn, HashMap<String,String> map) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(EmpSql.deleteEmployee);
			pstmt.setString(1,map.get("employee_id"));
			pstmt.setString(2, map.get("employee_pwd"));
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	// 직원로그인 EmployeeLogin
	public Employee EmployeeLogin(Connection conn, HashMap<String, String> employee) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Employee emp = new Employee();
		try {
			pstmt = conn.prepareStatement(EmpSql.employeelogin);
			pstmt.setString(1, employee.get("employee_id"));
			pstmt.setString(2, employee.get("employee_pwd"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setEmployeePwd(rs.getString("employee_pwd"));
				emp.setEname(rs.getString("ename"));
				emp.setPostalNo(rs.getInt("postal_no"));
				emp.setAddress(rs.getString("address"));
				emp.setSsn1(rs.getString("ssn1"));
				emp.setSsn2(rs.getString("ssn2"));
				emp.setEmail(rs.getString("email"));
				emp.setTell(rs.getString("tell"));
				emp.setActive(rs.getInt("active"));
				emp.setBrandNo(rs.getInt("brand_no"));
				emp.setPoint1(rs.getInt("point1"));

				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}

	// 아이디 중복 체크 EmployeeDoubleIdCheck
	public int employeeDoubleIdCheck(Connection conn, String employeeId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(EmpSql.doubleIdCheck);
			pstmt.setString(1, employeeId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return -1;
	}

	// 회원 아이디 찾기 SelectById
	public int employeeSelectById(Connection conn, HashMap<String, String> employee) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(EmpSql.employeeSelectById);
			pstmt.setString(1, employee.get("ename"));
			pstmt.setString(2, employee.get("ssn1"));
			pstmt.setString(3, employee.get("ssn2"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return -1;
	}

	// 회원 비밀번호 찾기 SelectByPwd
	public int selectByPwd(Connection conn, HashMap<String, String> customer) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.selectByPwd);
			pstmt.setString(1, customer.get("customer_id"));
			pstmt.setString(2, customer.get("customer_ssn1"));
			pstmt.setString(3, customer.get("customer_ssn2"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return -1;
	}

	public Product makeProduct(ResultSet rs) {
		Product pro = new Product();
		try {
			pro.setBrandNo(rs.getInt("brand_no"));
			pro.setClosingDate(rs.getDate("closing_date"));
			pro.setEmployeeId(rs.getString("employee_id"));
			pro.setMainImagePath(rs.getString("image_path"));
			pro.setMaximumSize(rs.getInt("maximum_size"));
			pro.setMinimumSize(rs.getInt("minimum_size"));
			pro.setOrderState(rs.getInt("order_state"));
			pro.setPresentSize(rs.getInt("present_size"));
			pro.setPrice(rs.getInt("price"));
			pro.setProductContent(rs.getString("product_content"));
			pro.setProductName(rs.getString("product_name"));
			pro.setProductNo(rs.getInt("product_no"));
			pro.setRegistrationDate(rs.getDate("registration_date"));
			pro.setTypeNo(rs.getInt("type_no"));
			return pro;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
	public BrandProduct makebrandKind(ResultSet rs){
		BrandProduct bp = new BrandProduct();
		try{
			bp.setProductNo(rs.getInt("product_no"));
			bp.setBrandNo(rs.getInt("brand_no"));
			bp.setProductName(rs.getString("product_name"));
			bp.setProductContent(rs.getString("product_content"));
			bp.setImagePath(rs.getString("image_path"));
			return bp;
		}catch(SQLException e){
			e.printStackTrace();
		}return null;
	}
	//직원제품 등록
	public int insertProduct(Connection conn,Product product){
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(ProductSql.insertProduct);
			pstmt.setInt(1, product.getProductNo());
			pstmt.setString(2,product.getProductName());
			pstmt.setString(3, product.getProductContent());
			pstmt.setInt(4, product.getPrice());
			pstmt.setInt(5, product.getMinimumSize());
			pstmt.setInt(6, product.getMaximumSize());
			pstmt.setInt(7, product.getPresentSize());
			pstmt.setDate(8, product.getRegistrationDate());
			pstmt.setDate(9, product.getClosingDate());
			pstmt.setInt(10,product.getOrderState());
			pstmt.setString(11, product.getMainImagePath());
			pstmt.setInt(14, product.getTypeNo());
			pstmt.setString(15, product.getEmployeeId());
			pstmt.setInt(16, product.getBrandNo());
			pstmt.setString(12, product.getDetailImagePath());
			pstmt.setString(13, product.getDetailContent());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//제품명검색
		public ArrayList<Product> searchOfProduct(Connection conn,Product product){
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<Product> list = new ArrayList<>();
			try {
				pstmt = conn.prepareStatement(ProductSql.searchOfProduct);
				pstmt.setString(1, product.getProductName());
				rs = pstmt.executeQuery();
				while(rs.next()) {
					list.add(makeProduct(rs));
				}
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, rs);
			}
			return null;
		}
		//상픔종류별 검색 //잘모르겠음
		public ArrayList<Product> searchOfKind(Connection conn,Type type) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<Product> list = new ArrayList<>();
			try {
				pstmt = conn.prepareStatement(ProductSql.searchOfKind);
				pstmt.setString(1, type.getTypeName());
				rs = pstmt.executeQuery();
				while(rs.next()) {
					list.add(makeProduct(rs));
				}
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, rs);
			}
			return null;
		}	
	// !!!!!!!!!!!!!!!!!!!!!!메인뷰가져올거!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// 베스트상품가져오기
	public ArrayList<Product> bestProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Product> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(ProductSql.searchOfBestProduct);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(makeProduct(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	
	// 최신상품가져오기
	public ArrayList<Product> newProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Product> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(ProductSql.searchOfNewProduct);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(makeProduct(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}

	// 메인첫화면 즐겨찾기 가장높은 상품뽑기 상품번호우선
	public int bookmarkBest(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(ProductSql.searchOfBestBookMark);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				return rs.getInt("product_no");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return -1;
	}

	public Product bookmarkBest2(Connection conn, int productNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(ProductSql.productMain);
			pstmt.setInt(1, productNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return makeProduct(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;

	}
	///////////////////////////////////////////////////////////////////////////////////
	/* 공지 게시판 */

	// 공지사항 작성
	public int insertNotice(Connection conn, Notice notice) {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(NoticeSql.insertNotice);
			pstmt.setString(1, notice.getTitle());
			pstmt.setString(2, notice.getContent());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;

	}

	// 공지사항 수정
	public int updateNotice(Connection conn, Notice notice) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.updateNotice);
			pstmt.setString(1, notice.getTitle());
			pstmt.setString(2, notice.getContent());
			pstmt.setInt(3, notice.getNoticeArticleNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	// 공지사항 삭제
	public int deleteNotice(Connection conn, int noticeArticleNo) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.deleteNotice);

			pstmt.setInt(1, noticeArticleNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//공지사항 리스트보기
	public ArrayList<Notice> NoticeList(Connection conn, int startId, int endId){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Notice> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(NoticeSql.NoticeList);
			pstmt.setInt(1, startId);
			pstmt.setInt(2, endId);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Notice notice = new Notice();
				notice.setTitle(rs.getString("title"));
				notice.setContent(rs.getString("content"));
				notice.setNoticeDate(rs.getDate("notice_date"));
				notice.setNoticeArticleNo(rs.getInt("notice_article_no"));
				list.add(notice);
				
			}return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	//공지사항 총 게시글 갯수
	public int NoticeCount(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(NoticeSql.countNotice);
			rs=  pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
			
		}return 0;
		
		
	}
	// 공지사항 뷰
	public Notice noticeView(Connection conn, int notice_article_no){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.NoticeView);
			pstmt.setInt(1, notice_article_no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Notice notice = new Notice();
				notice.setNoticeArticleNo(rs.getInt("notice_article_no"));
				notice.setTitle(rs.getString("title"));
				notice.setContent(rs.getString("content"));
				notice.setNoticeDate(rs.getDate("notice_date"));
				return notice;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	//////////////////////////////////////////////////////////////////////
	// 자유게시판

	// 자유게시판 작성
	public int insertFreeBoard(Connection conn, FreeBoard freeBoard) {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(NoticeSql.insertFreeBoard);
			pstmt.setString(1, freeBoard.getTitle());
			pstmt.setString(2, freeBoard.getContent());
			pstmt.setString(3, freeBoard.getCustomerId());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;

	}

	// 자유게시판 수정
	public int updateFreeBoard(Connection conn, FreeBoard freeBoard) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.updateFreeBoard);
			pstmt.setString(1, freeBoard.getTitle());
			pstmt.setString(2, freeBoard.getContent());
			pstmt.setInt(3, freeBoard.getArticleNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	// 자유게시판 삭제
	public int deleteFreeBoard(Connection conn, int articleNo) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.deleteFreeBoard);

			pstmt.setInt(1, articleNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//자유게시판 리스트 조회
	public ArrayList<FreeBoard> FreeList(Connection conn, int startId, int endId){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.FreeList);
			pstmt.setInt(1, startId);
			pstmt.setInt(2, endId);
			rs = pstmt.executeQuery();
			
			ArrayList<FreeBoard> list =new ArrayList<>();
			while(rs.next()){
				FreeBoard free = new FreeBoard();
				free.setArticleNo(rs.getInt("article_no"));
				free.setTitle(rs.getString("title"));
				free.setHits(rs.getInt("hits"));
				free.setContent(rs.getString("content"));
				free.setArticleDate(rs.getDate("article_date"));
				free.setCustomerId(rs.getString("customer_id"));
				list.add(free);
			}return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	//자유게시판 총 글 개수
	public int countFree(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.countFree);
			rs = pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return -1;
	}
	//자유게시판 조회수 증가
	public int hitsUpdate(Connection conn, int article_no){
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.hitsPlust);
			pstmt.setInt(1, article_no);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}JdbcUtil.close(pstmt, null);
		return -1;
	}
	//자유게시판 뷰
	public FreeBoard FreeView(Connection conn, int article_no){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FreeBoard free = new FreeBoard();
		try {
			pstmt= conn.prepareStatement(NoticeSql.FreeView);
			pstmt.setInt(1, article_no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				free.setArticleNo(rs.getInt("article_no"));
				free.setTitle(rs.getString("title"));
				free.setHits(rs.getInt("hits"));
				free.setContent(rs.getString("content"));
				free.setArticleDate(rs.getDate("article_date"));
				free.setCustomerId(rs.getString("customer_id"));
				return free;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	
	
	// 자유게시판 댓글 작성
		public int insertFreeReple(Connection conn, FreeReple freeReple) {
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(NoticeSql.insertFreeReple);
				pstmt.setInt(1, freeReple.getArticleNo());
				pstmt.setString(2, freeReple.getWriteId());
				pstmt.setString(3, freeReple.getContent());
				return pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;

		}

		// 자유게시판댓글 수정
		public int updateFreeReple(Connection conn, FreeReple freeReple) {
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(NoticeSql.updateFreeReple);
				pstmt.setString(1, freeReple.getContent());
				pstmt.setInt(2, freeReple.getFreeRepleNo());
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;
		}

		// 자유게시판 댓글 삭제
		public int deleteFreeReple(Connection conn, int freeRepleNo ) {
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(NoticeSql.deleteFreeReple);

				pstmt.setInt(1, freeRepleNo);
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;
		}
		// 자유게시판 댓글 조회
		public ArrayList<FreeReple> FreeRepleList(Connection conn,int articleNo){
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<FreeReple> list = new ArrayList<>();
			try {
				pstmt = conn.prepareStatement(NoticeSql.freeRepleList);
				pstmt.setInt(1, articleNo);
				rs = pstmt.executeQuery();
				while(rs.next()){
					FreeReple freeReple = new FreeReple();
					freeReple.setFreeRepleNo(rs.getInt("free_reple_no"));
					freeReple.setArticleNo(rs.getInt("article_no"));
					freeReple.setWriteId(rs.getString("write_id"));
					freeReple.setContent(rs.getString("content"));			
					freeReple.setRepleDate(rs.getDate("reple_date"));
					list.add(freeReple);
				}return list;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JdbcUtil.close(pstmt, rs);
			}return null;
		}
		//자유게시판 댓글 하나 조회
		public FreeReple freeRepleView(Connection conn, int free_reple_no){
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(NoticeSql.freeRepleView);
				pstmt.setInt(1, free_reple_no);
				rs =pstmt.executeQuery();
				if(rs.next()){
					FreeReple freeReple = new FreeReple();
					freeReple.setArticleNo(rs.getInt("article_no"));
					freeReple.setContent(rs.getString("content"));
					freeReple.setFreeRepleNo(rs.getInt("free_reple_no"));
					freeReple.setRepleDate(rs.getDate("reple_date"));
					freeReple.setWriteId(rs.getString("write_id"));
					return freeReple;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JdbcUtil.close(pstmt, rs);
			}return null;
		}
		
	///////////////////////////////////////////////////////////////////////

	/* 즐겨찾기 */
	/* 즐겨 찾기 조회 --------잠시 생각생각 헿---------금맹 */

	// 즐겨찾기 등록
	public int bookmarkInsert(Connection conn, Bookmark bookmark) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.bookmarkInsert);
			pstmt.setString(1, bookmark.getCustomerId());
			pstmt.setInt(2, bookmark.getProductNo());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return 0;
	}
	/* 전체 브랜드 조회 */
	private Brand makeBrand(ResultSet rs) throws SQLException {
		Brand brand = new Brand();
		brand.setBrandNo(rs.getInt("brand"));
		brand.setBrandName(rs.getString("brandName"));
		brand.setBrandContent(rs.getString("brandContent"));
		brand.setCompanyTell(rs.getString("company_tell"));
		return brand;
	}
	// 브랜드 전체조회
	public ArrayList<Brand> brandAllList(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Brand> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(CustomerSql.brandAll);
			rs = pstmt.executeQuery();
			while (rs.next())
				list.add(makeBrand(rs));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	/* 문의게시판 */

	// 문의게시판 작성
	public int insertInquiryAticle(Connection conn, InquiryBoard inquiryBoard) {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(CustomerSql.insertInquiryAticle);
			pstmt.setString(1, inquiryBoard.getTitle());	//제목
			pstmt.setString(2, inquiryBoard.getContent());	//내용
			pstmt.setString(3, inquiryBoard.getCustomerId());//고객아이디
			pstmt.setString(4, inquiryBoard.getGroupName());//분류이름
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;

	}

	// 문의게시판 수정
	public int updateInquiryAticle(Connection conn, InquiryBoard inquiryBoard) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.updateInquiryAticle);
			
			pstmt.setString(1, inquiryBoard.getTitle());
			pstmt.setString(2, inquiryBoard.getContent());
			pstmt.setString(3, inquiryBoard.getGroupName());		
			pstmt.setInt(4, inquiryBoard.getInquiryNo());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}

	// 문의게시판 삭제
	public int deleteInquiryAticle(Connection conn, int inquiryNo) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.deleteInquiryAticle);

			pstmt.setInt(1, inquiryNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	//문의게시판 리스트
	public ArrayList<InquiryBoard> InquiryList(Connection conn, int startId, int endId, String customer){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<InquiryBoard> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(CustomerSql.inquiryArticleList);
			pstmt.setString(1, customer);
			pstmt.setInt(2, startId);
			pstmt.setInt(3, endId);
			rs = pstmt.executeQuery();
			while(rs.next()){
				InquiryBoard inquiry = new InquiryBoard();
				inquiry.setInquiryNo(rs.getInt("inquiry_no"));
				inquiry.setTitle(rs.getString("title"));
				inquiry.setContent(rs.getString("content"));
				inquiry.setInquiryDate(rs.getDate("inquiry_date"));
				inquiry.setCustomerId(rs.getString("customer_id"));
				inquiry.setGroupName(rs.getString("group_name"));
				list.add(inquiry);			
			}return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	//문의게시판 뷰
	public InquiryBoard InquiryView(Connection conn, int inquiryNo){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		InquiryBoard inquiry = new InquiryBoard();
		try {
			pstmt = conn.prepareStatement(CustomerSql.inquiryView);
			pstmt.setInt(1, inquiryNo);
			rs = pstmt.executeQuery();
			if(rs.next()){
				inquiry.setInquiryNo(rs.getInt("inquiry_no"));				
				inquiry.setTitle(rs.getString("title"));
				inquiry.setContent(rs.getString("content"));
				inquiry.setInquiryDate(rs.getDate("inquiry_date"));
				inquiry.setCustomerId(rs.getString("customer_id"));
				inquiry.setGroupName(rs.getString("group_name"));
				return inquiry;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
	}
	//문의게시판 총 게시글 수
	public int InquiryCount(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.inquiryCount);
			rs = pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return -1;
	}
	
	// 문의게시판 댓글 작성
			public int insertInquiryReple(Connection conn,InquiryReple inquiryReple) {
				PreparedStatement pstmt = null;
				
				try {
					pstmt = conn.prepareStatement(CustomerSql.insertInquiryAticleIReple);
					pstmt.setString(1, inquiryReple.getContent());
					pstmt.setInt(2,inquiryReple.getInquiryNo());

					return pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(pstmt, null);
				}
				return -1;

			}

	// 문의게시판 댓글 리스트
			public ArrayList<InquiryReple> InquiryRepleList(Connection conn, int inquiryNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<InquiryReple> list = new ArrayList<>();
				try {
					pstmt = conn.prepareStatement(CustomerSql.inquiryRepleList);
					pstmt.setInt(1, inquiryNo);
					rs = pstmt.executeQuery();
					while(rs.next()){
						InquiryReple iqrReple = new InquiryReple();
						iqrReple.setInquiryRepleNo(rs.getInt("inquiry_reple_no"));
						iqrReple.setContent(rs.getString("content"));
						iqrReple.setRepleDate(rs.getDate("reple_date"));
						iqrReple.setInquiryNo(rs.getInt("inquiry_no"));
						list.add(iqrReple);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
	// 문의게시판 댓글 뷰
			public InquiryReple InquiryRepleView(Connection conn, int inquiryRepleNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;				
				try {
					pstmt = conn.prepareStatement(CustomerSql.inquiryRepleView);
					pstmt.setInt(1, inquiryRepleNo);
					rs = pstmt.executeQuery();
					if(rs.next()){
						InquiryReple iqrReple = new InquiryReple();
						iqrReple.setInquiryRepleNo(rs.getInt("inquiry_reple_no"));
						iqrReple.setContent(rs.getString("content"));
						iqrReple.setRepleDate(rs.getDate("reple_date"));
						iqrReple.setInquiryNo(rs.getInt("inquiry_no"));
						return iqrReple;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			
			// 문의게시판  댓글 수정
			public int updateInquiryReple(Connection conn, InquiryReple inquiryReple) {
				PreparedStatement pstmt = null;
				try {
					pstmt = conn.prepareStatement(CustomerSql.updateInquiryAticleReple);
					pstmt.setString(1,inquiryReple.getContent());
					pstmt.setInt(2,inquiryReple.getInquiryRepleNo());
					return pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(pstmt, null);
				}
				return -1;
			}

			// 문의게시판 댓글 삭제
			public int deleteInquiryReple(Connection conn,int inquiryRepleNo ) {
				PreparedStatement pstmt = null;
				try {
					pstmt = conn.prepareStatement(CustomerSql.deleteInquiryAticleReple);

					pstmt.setInt(1,inquiryRepleNo);
					return pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(pstmt, null);
				}
				return -1;
			}
			
	
			//브랜드번호가져오기
			public int maxBrandNo(Connection conn) {
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				pstmt=conn.prepareStatement(EmpSql.maxBrandNo);
				rs=pstmt.executeQuery();
				if(rs.next()){
					return rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
				return 0;
			}
			//브랜드제품 번호가져오기
			public int maxProductNo(Connection conn) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(EmpSql.maxProductNo);
					rs=pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}JdbcUtil.close(pstmt, rs);
				
				return 0;
			}
			//제품등록번호가져오기
			public int maxPno(Connection conn) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(EmpSql.registerProductMaxNo);
					rs=pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return 0;
			}
			//상품등록시 종류가져오기
			public ArrayList<HashMap<String, Object>> productSort(Connection conn) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				ArrayList<HashMap<String, Object>> list=new ArrayList<>();
				try {
					pstmt=conn.prepareStatement(EmpSql.selectProductSort);
					rs=pstmt.executeQuery();
					while(rs.next()){
						HashMap<String, Object> map=new HashMap<>();
						map.put("type_no", rs.getInt("type_no"));
						map.put("type_name", rs.getString("type_name"));
						list.add(map);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				return null;
			}
			//직원로그인시 브랜드를 세션에 넣어주는 역활
			public Brand BrandselectByBrandNO(Connection conn, int brandNo) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				Brand b=new Brand();
				try {
					pstmt=conn.prepareStatement(EmpSql.brandSelectByBrandNo);
					pstmt.setInt(1, brandNo);
					rs=pstmt.executeQuery();
					if(rs.next()){
						b.setBrandContent(rs.getString("content"));
						b.setBrandNo(rs.getInt("brand_no"));
						b.setBrandName(rs.getString("brand_name"));
						b.setCompanyTell(rs.getString("company_tell"));
						b.setImagePath(rs.getString("image_path"));
						return b;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				
				
				return null;
			}
			//메인 최근등록상품가져오기
			public ArrayList<Product> mainRecentProduct(Connection conn) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				ArrayList<Product> list=new ArrayList<>();
				try {
					pstmt=conn.prepareStatement(ProductSql.mainRecentProduct);
					rs=pstmt.executeQuery();
					while(rs.next()){
						Product p=new Product();
						p.setBrandNo(rs.getInt("brand_no"));
						p.setClosingDate(rs.getDate("closing_date"));
						p.setEmployeeId(rs.getString("employee_id"));
						p.setMainImagePath(rs.getString("main_image_path"));
						p.setMaximumSize(rs.getInt("maximum_size"));
						p.setMinimumSize(rs.getInt("minimum_size"));
						p.setOrderState(rs.getInt("order_state"));
						p.setTypeNo(rs.getInt("type_no"));
						p.setRegistrationDate(rs.getDate("registration_date"));
						p.setPresentSize(rs.getInt("present_size"));
						p.setPrice(rs.getInt("price"));
						p.setProductNo(rs.getInt("product_no"));
						p.setProductName(rs.getString("product_name"));
						p.setProductContent(rs.getString("product_content"));
						p.setDetailImagePath(rs.getString("image_path"));
						
						
						list.add(p);
						
					}return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}
				return null;
			}
			//메인 인기상품가져오기
			public ArrayList<Product> mainHitProduct(Connection conn) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				ArrayList<Product> list=new ArrayList<>();
				try {
					pstmt=conn.prepareStatement(ProductSql.mainHitProduct);
					rs=pstmt.executeQuery();
					while(rs.next()){
						
						Product p=new Product();
						p.setBrandNo(rs.getInt("brand_no"));
						p.setClosingDate(rs.getDate("closing_date"));
						p.setEmployeeId(rs.getString("employee_id"));
						p.setMainImagePath(rs.getString("main_image_path"));
						p.setMaximumSize(rs.getInt("maximum_size"));
						p.setMinimumSize(rs.getInt("minimum_size"));
						p.setOrderState(rs.getInt("order_state"));
						p.setTypeNo(rs.getInt("type_no"));
						p.setRegistrationDate(rs.getDate("registration_date"));
						p.setPresentSize(rs.getInt("present_size"));
						p.setPrice(rs.getInt("price"));
						p.setProductNo(rs.getInt("product_no"));
						p.setProductName(rs.getString("product_name"));
						p.setProductContent(rs.getString("product_content"));
						list.add(p);
						
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}
				return null;
			}
			//직원이 등록한 회원의 제품리스트
			public ArrayList<Product> productList(Connection conn, String employeeId, int i, int j) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				ArrayList<Product> list=new ArrayList<>();
				try {
					pstmt=conn.prepareStatement(EmpSql.productList);
					pstmt.setInt(2, i);
					pstmt.setInt(3, j);
					pstmt.setString(1, employeeId);
					rs=pstmt.executeQuery();
					while(rs.next()){
						Product p=new Product();
						p.setBrandNo(rs.getInt("brand_no"));
						p.setClosingDate(rs.getDate("closing_date"));
						p.setEmployeeId(rs.getString("employee_id"));
						p.setMainImagePath(rs.getString("main_image_path"));
						p.setMaximumSize(rs.getInt("maximum_size"));
						p.setMinimumSize(rs.getInt("minimum_size"));
						p.setOrderState(rs.getInt("order_state"));
						p.setTypeNo(rs.getInt("type_no"));
						p.setRegistrationDate(rs.getDate("registration_date"));
						p.setPresentSize(rs.getInt("present_size"));
						p.setPrice(rs.getInt("price"));
						p.setProductNo(rs.getInt("product_no"));
						p.setProductName(rs.getString("product_name"));
						p.setProductContent(rs.getString("product_content"));
						list.add(p);
						
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				return null;
			}
			//직원이 등록한 회원의 개수를 세기
			public int employeeSelectCount(Connection conn, String employeeId) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(EmpSql.productListCount);
					pstmt.setString(1, employeeId);
					rs=pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				return 0;
			}
			public int ProductOrderSelectCount(Connection conn, String customerId) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.productOrderCount);
					pstmt.setString(1, customerId);
					rs=pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				return 0;
			}
			//상품메인화면나오게하기
			public Product productMain(Connection conn, int product_no) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.productMain);
					pstmt.setInt(1, product_no);
					rs=pstmt.executeQuery();
					if(rs.next()){
						Product p=new Product();
						return MappingUtil.makeProduct(rs);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				return null;
			}
			public void updateCustomerUpdate(Connection conn,String customerId,int point) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(CustomerSql.updatePoint);
					pstmt.setInt(1, point);
					pstmt.setString(2, customerId);
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
			//주문시
			//상품의 주문상태를 변경시켜준다
			public void updateOrderState(Connection conn, int productNo, int orderState) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.updateOrderState);
					pstmt.setInt(1, orderState);
					pstmt.setInt(2, productNo);
					pstmt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
			//주문상품의 주문상태를 변경시켜준다
			public void updateOrderStateProductOrder(Connection conn, int productNo, int orderState) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.updateOrderStateProductOrder);
					pstmt.setInt(1, orderState);
					pstmt.setInt(2, productNo);
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
			//고객의 포인트차감
			public void updateCusomerPoint(Connection conn, String customerId, int resultPoint) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.updateCustomerPoint);
					pstmt.setInt(1, resultPoint);
					pstmt.setString(2, customerId);
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				
			}
			//주문내역추가
			public void insertOrder(Connection conn, Order order) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.insertOrder);
					pstmt.setInt(1, order.getProductNo());
					pstmt.setString(2, order.getCustomerId());
					pstmt.setInt(3, order.getOrderState());
					pstmt.setInt(4, order.getOrderPrice());
					pstmt.setInt(5, order.getPostalNo());
					pstmt.setString(6, order.getAddress());
					pstmt.setInt(7, order.getOrderSize());
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}
				
			}
			public void updateProductPresentSize(Connection conn, int productNo, int resultSize) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(ProductSql.updatePresentSize);
					pstmt.setInt(1, resultSize);
					pstmt.setInt(2, productNo);
					pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
			public ArrayList<Order> orderList(Connection conn, String customerId, int startArticle, int endArticle) {
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			ArrayList<Order> list=new ArrayList<>();
			try {
				pstmt=conn.prepareStatement(ProductSql.orderList);
			
				pstmt.setString(1, customerId);
				pstmt.setInt(2, startArticle);
				pstmt.setInt(3, endArticle);
				rs=pstmt.executeQuery();
				while(rs.next()){
					list.add(MappingUtil.makeOrder(rs));
				}return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				JdbcUtil.close(pstmt, rs);
			}
				return null;
			}
			
			//회원 전체 조회
			
			public ArrayList<Customer> selectAllCustomers(Connection conn, int startId, int endId){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<Customer> list = new ArrayList<>();
				try {
					pstmt = conn.prepareStatement(CustomerSql.selectCustomer);
					pstmt.setInt(1, startId);
					pstmt.setInt(2, endId);
					rs = pstmt.executeQuery();
					while(rs.next()){
						Customer customer = new Customer();
						customer.setCustomerId(rs.getString("customer_id"));
						customer.setCustomerName(rs.getString("customer_name"));
						customer.setTell(rs.getString("tell"));
						customer.setSsn1(rs.getString("ssn1"));
						customer.setSsn2(rs.getString("ssn2"));
						customer.setEmail(rs.getString("email"));
						customer.setGradeName(rs.getString("grade_name"));
						customer.setPostalNo(rs.getInt("postal_no"));
						customer.setAddress(rs.getString("address"));
						list.add(customer);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
				
			}
			
			//직원 전체 조회
			public ArrayList<Employee> selectAllEmployees(Connection conn, int startId, int endId){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<Employee> list = new ArrayList<>();
				
				try {
					pstmt = conn.prepareStatement(EmpSql.selectEmployees);
					pstmt.setInt(1, startId);
					pstmt.setInt(2, endId);
					rs= pstmt.executeQuery();
					while(rs.next()){
						Employee employee= new Employee();
						employee.setEmployeeId(rs.getString("employee_id"));
						employee.setEname(rs.getString("ename"));
						employee.setTell(rs.getString("tell"));
						employee.setSsn1(rs.getString("ssn1"));
						employee.setSsn2(rs.getString("ssn2"));
						employee.setEmail(rs.getString("email"));
						employee.setPostalNo(rs.getInt("postal_no"));
						employee.setAddress(rs.getString("address"));
						employee.setActive(rs.getInt("active"));
						list.add(employee);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
				
			}
			
			
			//총 회원 수 조회
			public int countCustomer(Connection conn){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt = conn.prepareStatement(CustomerSql.countCustomer);
					rs = pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return -1;
			}
			
			// 총 직원 수 조회
	
			public int countEmployee(Connection conn){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					pstmt = conn.prepareStatement(EmpSql.countEmployees);
					rs= pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return -1;
	
			}
			//브랜드 전체 조회
			public ArrayList<Brand> selectAllBrand(Connection conn, int startId, int endId){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<Brand> list = new ArrayList<>();
				try {
					pstmt = conn.prepareStatement(ProductSql.selectAllBrand);
					pstmt.setInt(1, startId);
					pstmt.setInt(2, endId);
					rs = pstmt.executeQuery();
					while(rs.next()){
						Brand brand = new Brand();
						brand.setBrandNo(rs.getInt("brand_no"));
						brand.setBrandName(rs.getString("brand_name"));
						list.add(brand);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			//전체 브랜드 수
			public int countBrand(Connection conn){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					pstmt = conn.prepareStatement(ProductSql.countBrand);
					rs= pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return -1;
				
			}
			
			//비활성화 직원 조회
			public ArrayList<Employee> selectNoActiveEmployees(Connection conn, int startId, int endId){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<Employee> list =new ArrayList<>();
				try {
					pstmt = conn.prepareStatement(EmpSql.selectNoActiveEmployees);
					pstmt.setInt(1, startId);
					pstmt.setInt(2, endId);
					rs = pstmt.executeQuery();
					while(rs.next()){
						Employee emp = new Employee();
						emp.setEname(rs.getString("ename"));
						emp.setEmployeeId(rs.getString("employee_id"));
						emp.setTell(rs.getString("tell"));
						emp.setSsn1(rs.getString("ssn1"));
						emp.setSsn2(rs.getString("ssn2"));
						emp.setEmail(rs.getString("email"));
						emp.setPostalNo(rs.getInt("postal_no"));
						emp.setAddress(rs.getString("address"));
						emp.setActive(rs.getInt("active"));
						emp.setBrandNo(rs.getInt("brand_no"));
						list.add(emp);
					}return list;
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			//승인 대기중인 직원 수
			public int countNoActiveEmployee(Connection conn){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					pstmt = conn.prepareStatement(EmpSql.countNoActiveEmployee);
					rs = pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return -1;
			}
			
			//직원 활성화
			public int activateEmployee(Connection conn,String employeeId){
				PreparedStatement pstmt = null;
				try {
					pstmt = conn.prepareStatement(EmpSql.ActiveEmployee);
					pstmt.setString(1, employeeId);
					return pstmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, null);
				}return -1;
			}
			//직원 거절
			public int deleteEmployee(Connection conn, String employeeId){
				PreparedStatement pstmt = null;
				try {
					pstmt = conn.prepareStatement(EmpSql.DeleteEmployee);
					pstmt.setString(1, employeeId);
					return pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, null);
				}return -1;
			}
			//브랜드 상세보기
			public Brand selectBrandByBrandNo(Connection conn, int brandNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt= conn.prepareStatement(ProductSql.selectDetailBrand);
					pstmt.setInt(1, brandNo);
					rs = pstmt.executeQuery();
					if(rs.next()){
						Brand brand = new Brand();
						brand.setImagePath(rs.getString("image_path"));
						brand.setBrandName(rs.getString("brand_name"));
						brand.setBrandContent(rs.getString("content"));
						return brand;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			//브랜드 상품 상세보기 
			public BrandProduct selectBrandProductByBrand_no(Connection conn, int brandNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt= conn.prepareStatement(ProductSql.selectDetailProduct);
					pstmt.setInt(1, brandNo);
					rs = pstmt.executeQuery();
					if(rs.next()){
						BrandProduct bp = new BrandProduct();
						bp.setImagePath(rs.getString("image_path"));
						bp.setProductName(rs.getString("product_name"));
						bp.setProductContent(rs.getString("content"));
						return bp;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			//종류별 상품 뿌리기
			public ArrayList<Product> selectProductByPageNo(Connection conn, int startId, int endId, int typeNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<Product> list = new ArrayList<>();
				try {
					pstmt = conn.prepareStatement(ProductSql.selectProductByType);
					pstmt.setInt(1, typeNo);
					pstmt.setInt(2, startId);
					pstmt.setInt(3, endId);
					rs = pstmt.executeQuery();
					while(rs.next()){
						Product product = new Product();
						product.setProductNo(rs.getInt("product_no"));
						product.setProductName(rs.getString("product_name"));
						product.setProductContent(rs.getString("product_content"));
						product.setPrice(rs.getInt("price"));
						product.setMinimumSize(rs.getInt("minimum_size"));
						product.setMaximumSize(rs.getInt("maximum_size"));
						product.setPresentSize(rs.getInt("present_size"));
						product.setRegistrationDate(rs.getDate("registration_date"));
						product.setClosingDate(rs.getDate("closing_date"));
						product.setOrderState(rs.getInt("order_state"));
						product.setTypeNo(rs.getInt("type_no"));
						product.setBrandNo(rs.getInt("brand_no"));
						product.setEmployeeId(rs.getString("employee_id"));
						product.setMainImagePath(rs.getString("main_image_path"));
						product.setDetailImagePath(rs.getString("image_path"));
						product.setDetailContent(rs.getString("detail_content"));
						list.add(product);
					}return list;
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return null;
			}
			//종류별 상품 개수
			public int countProductByTypeNo(Connection conn, int typeNo){
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt = conn.prepareStatement(ProductSql.countProductByType);
					pstmt.setInt(1, typeNo);
					rs = pstmt.executeQuery();
					if(rs.next()){
						return rs.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					JdbcUtil.close(pstmt, rs);
				}return -1;
			}
			public void customerCharge(Connection conn, String customerId, int result) {
					PreparedStatement pstmt=null;
					ResultSet rs=null;
					try {
						pstmt=conn.prepareStatement(CustomerSql.chargePoint);
						pstmt.setInt(1, result);
						pstmt.setString(2, customerId);
						pstmt.executeUpdate();
						
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
						JdbcUtil.close(pstmt, rs);
					}
			}
			//충전내역 넣기
			public void insertPoint(Connection conn, PointCharge p) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(CustomerSql.insertPoint);
					pstmt.setString(1, p.getCustomerId());
					pstmt.setInt(2, p.getChargePoint());
					pstmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
			public void employeeRefund(Connection conn, String employeeId, int result) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(EmpSql.refundPoint1);
					pstmt.setInt(1, result);
					pstmt.setString(2, employeeId);
					pstmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
				
			}
			public void insertRefundPoint(Connection conn, PointRefund p) {
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					pstmt=conn.prepareStatement(EmpSql.refundPoint2);
					pstmt.setString(1, p.getEmployeeId());
					pstmt.setInt(2, p.getRefundPoint());
					pstmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JdbcUtil.close(pstmt, rs);
				}
			}
}










