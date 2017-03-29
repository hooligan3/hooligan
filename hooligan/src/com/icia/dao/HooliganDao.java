package com.icia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.icia.util.JdbcUtil;
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
			pstmt.setInt(1,b.getProductNo());
			pstmt.setInt(2, b.getBrandNo());
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
		return -1;
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
	//제품 등록
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
			pstmt.setInt(11, product.getTypeNo());
			pstmt.setInt(12, product.getBrandNo());
			pstmt.setString(13, product.getEmployeeId());
			pstmt.setString(14, product.getMainImagePath());
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
			pstmt = conn.prepareStatement(ProductSql.searchOfBestBookMark2);
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
			pstmt.setInt(1, notice.getNoticeArticleNo());
			pstmt.setString(2, notice.getTitle());
			pstmt.setString(3, notice.getContent());
			pstmt.setDate(4, notice.getNoticeDate());
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
			pstmt = conn.prepareStatement(NoticeSql.insertNotice);
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
	//////////////////////////////////////////////////////////////////////
	// 자유게시판

	// 자유게시판 작성
	public int insertFreeBoard(Connection conn, FreeBoard freeBoard) {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(NoticeSql.insertFreeBoard);
			pstmt.setInt(1, freeBoard.getArticleNo());
			pstmt.setString(2, freeBoard.getTitle());
			pstmt.setInt(3, freeBoard.getHits());
			pstmt.setString(4, freeBoard.getContent());
			pstmt.setDate(5, freeBoard.getArticleDate());
			pstmt.setString(6, freeBoard.getCustomerId());

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
	// 자유게시판 댓글 작성
		public int insertFreeReple(Connection conn, FreeReple freeReple) {
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(NoticeSql.insertFreeReple);
				pstmt.setInt(1, freeReple.getFreeRepleNo());
				pstmt.setInt(2, freeReple.getArticleNo());
				pstmt.setString(3, freeReple.getContent());
				pstmt.setDate(4, freeReple.getRepleDate());

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
			pstmt.setInt(1, inquiryBoard.getInquiryNo());
			pstmt.setString(2, inquiryBoard.getTitle());
			pstmt.setString(3, inquiryBoard.getContent());
			pstmt.setDate(4, inquiryBoard.getInquiryDate());
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
			pstmt.setInt(3, inquiryBoard.getInquiryNo());
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
	// 문의게시판 댓글 작성
			public int insertInquiryReple(Connection conn,InquiryReple inquiryReple) {
				PreparedStatement pstmt = null;
				
				try {
					pstmt = conn.prepareStatement(CustomerSql.insertInquiryAticleIReple);
					pstmt.setInt(1, inquiryReple.getInquiryRepleNo());
					pstmt.setString(2, inquiryReple.getContent());
					pstmt.setDate(3,inquiryReple.getRepleDate());
					pstmt.setInt(4,inquiryReple.getInquiryNo());

					return pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JdbcUtil.close(pstmt, null);
				}
				return -1;

			}
			
			// 자유게시판  댓글 수정
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

			// 자유게시판 댓글 삭제
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
		
	
}
