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
import com.icia.vo.Customer;
import com.icia.vo.Employee;
import com.icia.vo.InquiryBoard;
import com.icia.vo.Notice;
import com.icia.vo.Product;

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
			pstmt.setInt(6, customer.getTell());
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
	// 회원정보 수정 Update
	public int updateCustomer(Connection conn, Customer customer) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.updateCustomer);
			pstmt.setString(1, customer.getCustomerPwd());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setInt(3, customer.getPostalNo());
			pstmt.setString(4, customer.getAddress());
			pstmt.setInt(5, customer.getTell());
			pstmt.setString(6, customer.getEmail());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	// 고객회원탈퇴 Delete
	public int deleteCustomer(Connection conn, String customerPwd) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(NoticeSql.deleteNotice);
			pstmt.setString(1, customerPwd);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
	// 회원로그인 CustomerLogin
	public Customer customerLogin(Connection conn, HashMap<String, String> customer) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer c = new Customer();
		try {
			pstmt = conn.prepareStatement(CustomerSql.loginCustomer);
			pstmt.setString(1, customer.get("customer_id"));
			pstmt.setString(2, customer.get("customer_pwd"));
			rs = pstmt.executeQuery();
			if (rs.next()){
				c.setCustomerId(rs.getString("customer_id"));
				c.setCustomerPwd(rs.getString("customer_pwd"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setPostalNo(rs.getInt("postal_no"));
				c.setAddress(rs.getString("address"));
				c.setTell(rs.getInt("tell"));
				c.setSsn1(rs.getString("ssn1"));
				c.setSsn2(rs.getString("ssn2"));
				c.setEmail(rs.getString("email"));
				c.setPoint(rs.getInt("point"));
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
	// 아이디 중복 체크 DoubleIdCheck
	public int customerDoubleIdCheck(Connection conn, String customerId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.doubleIdCheck);
			pstmt.setString(1, customerId);
			pstmt.executeQuery();
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
	public int customerSelectById(Connection conn,HashMap<String,String> customer ) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.selectById);
			pstmt.setString(1, customer.get("customer_Name"));
			pstmt.setString(2, customer.get("ssn1"));
			pstmt.setString(3, customer.get("ssn2"));
			pstmt.executeQuery();
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
	// 회원 비밀번호 찾기 CustomerSelectByPwd
	public int customerSelectByPwd(Connection conn, HashMap<String,String> customer) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.selectByPwd);
			pstmt.setString(1, customer.get("customer_id"));
			pstmt.setString(2, customer.get("ssn1"));
			pstmt.setString(3, customer.get("ssn2"));
			pstmt.executeQuery();
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
	/////////////////////////////////////////////////////////////////////////////
	
	// 직원   회원가입 InsertEmployee
		public int insertEmployee(Connection conn,Employee employee) {
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(EmpSql.insertEmployee);
				pstmt.setString(1, employee.getEmployeeId());
				pstmt.setString(2, employee.getEmployeePwd());
				pstmt.setString(3, employee.getEname());
				pstmt.setInt(4, employee.getPostalNo());
				pstmt.setString(5, employee.getAddress());
				pstmt.setString(6, employee.getEmail());
				pstmt.setString(7, employee.getSsn1());
				pstmt.setString(8, employee.getSsn2());
				pstmt.setInt(9, employee.getTell());
				pstmt.setInt(10,0);// 0 이면 비활성화 1이면 활성화
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;
		}
		// 직원정보 수정 UpdateEmployee
		public int updateEmployee(Connection conn,Employee employee) {
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(EmpSql.updateEmployee);
				pstmt.setString(1, employee.getEmployeePwd());
				pstmt.setInt(2, employee.getPostalNo());
				pstmt.setString(3, employee.getAddress());
				pstmt.setString(4, employee.getEmail());
				pstmt.setInt(5, employee.getTell());
				pstmt.setString(6,employee.getEmployeeId());
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;
		}
		// 직원탈퇴 DeleteEmployee
		public int deleteEmployee(Connection conn, String employeePwd) {
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(EmpSql.deleteEmployee);
				pstmt.setString(1, employeePwd);
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(pstmt, null);
			}
			return -1;
		}
		// 직원로그인  EmployeeLogin
		public Employee EmployeeLogin(Connection conn, HashMap<String, String> employee) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Employee emp = new Employee();
			try {
				pstmt = conn.prepareStatement(EmpSql.employeelogin);
				pstmt.setString(1, employee.get("employee_id"));
				pstmt.setString(2, employee.get("employee_pwd"));
				rs = pstmt.executeQuery();
				if (rs.next()){
					emp.setEmployeeId(rs.getString("employee_id"));
					emp.setEmployeePwd(rs.getString("employee_pwd"));
					emp.setEname(rs.getString("ename"));
					emp.setPostalNo(rs.getInt("postal_no"));
					emp.setAddress(rs.getString("address"));
					emp.setEmail(rs.getString("email"));
					emp.setSsn1(rs.getString("ssn1"));
					emp.setSsn2(rs.getString("ssn2"));
					emp.setTell(rs.getInt("tell"));
					emp.setActive(rs.getInt("active"));
					emp.setBrandNo(rs.getInt("brand_no"));
					
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
				pstmt.executeQuery();
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
		public int employeeSelectById(Connection conn,HashMap<String,String> employee ) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = conn.prepareStatement(EmpSql.employeeSelectById);
				pstmt.setString(1, employee.get("ename"));
				pstmt.setString(2, employee.get("ssn1"));
				pstmt.setString(3, employee.get("ssn2"));
				pstmt.executeQuery();
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
		public int selectByPwd(Connection conn, HashMap<String,String> customer) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = conn.prepareStatement(CustomerSql.selectByPwd);
				pstmt.setString(1, customer.get("customer_id"));
				pstmt.setString(2, customer.get("customer_ssn1"));
				pstmt.setString(3, customer.get("customer_ssn2"));
				pstmt.executeQuery();
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
	////
	public Product makeProduct(ResultSet rs) {
		Product pro = new Product();
		try {
			pro.setBrandNo(rs.getInt("brand_no"));
			pro.setClosingDate(rs.getDate("closing_date"));
			pro.setEmployeeId(rs.getString("employee_id"));
			pro.setImgPath(rs.getString("image_path"));
			pro.setMaxmumSize(rs.getInt("maximum_size"));
			pro.setMinmumSize(rs.getInt("minimum_size"));
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
	/* 회원 */

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
		brand.setCompanyTell(rs.getInt("columnIndex"));
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
	public int deleteInquiryAticle(Connection conn, InquiryBoard inquiryBoard) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(CustomerSql.deleteInquiryAticle);

			pstmt.setInt(1, inquiryBoard.getInquiryNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, null);
		}
		return -1;
	}
}
