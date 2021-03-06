package com.icia.util;

import java.io.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;

import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.icia.vo.*;

public class MappingUtil {
	public static Customer makeCustomer(HttpServletRequest req) {
		Customer customer = new Customer();
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

	public static Customer makeUpdateCustomer(HttpServletRequest req) {
		Customer customer = new Customer();
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

	// 직원가입하기1단계
	public static Employee makeEmployee(HttpServletRequest req, int maxBrand) {
		Employee e = new Employee();
		e.setActive(1);
		e.setAddress(req.getParameter("address"));
		e.setBrandNo(maxBrand + 1);
		e.setEmail(req.getParameter("email"));
		e.setEmployeeId(req.getParameter("employee_id"));
		e.setEmployeePwd(req.getParameter("employee_pwd"));
		e.setEname(req.getParameter("ename"));
		e.setPoint1(0);
		e.setPostalNo(Integer.parseInt(req.getParameter("postal_no")));
		e.setSsn1(req.getParameter("ssn1"));
		e.setSsn2(req.getParameter("ssn2"));
		e.setTell(req.getParameter("tell"));
		return e;

	}

	// 직원가입하기 브랜드분야
	public static Object makeBrand(HttpServletRequest req, int maxBrand) {
		Brand b = new Brand();
		String path = req.getServletContext().getRealPath("brand/brandimg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);

		try {
			List<FileItem> list = uploader.parseRequest(req);
			for (FileItem item : list) {

				if (item.isFormField()) {
					if (item.getFieldName().equals("brand_name")) {
						b.setBrandName(item.getString("UTF-8"));
					} else if (item.getFieldName().equals("company_phone_number")) {
						b.setCompanyTell(item.getString("UTF-8"));
					} else if (item.getFieldName().equals("content")) {
						b.setBrandContent(item.getString("UTF-8"));
					}
				} else {
					String fileName = item.getName();
					System.out.println(item.getName());
					int indexOfPoint = fileName.indexOf(".");
					System.out.println(fileName.indexOf("."));
					String fName = fileName.substring(0, indexOfPoint);
					String ext = fileName.substring(indexOfPoint + 1);
					fileName = fName + "-" + System.nanoTime() + "." + ext;
					item.write(new File(path + "/" + fileName));
					System.out.println("파일이름제대로들어왓냐" + path + "/" + fileName);
					b.setImagePath(fileName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		b.setBrandNo(maxBrand + 1);
		return b;

	}

	// 직원가입하기 브랜드제품
	public static Object makeBrandProduct(HttpServletRequest req, int maxBrand, int maxProduct) {
		BrandProduct p = new BrandProduct();
		String path = req.getServletContext().getRealPath("brand/productimg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> list;

		try {
			list = uploader.parseRequest(req);
			for (FileItem item : list) {

				if (item.isFormField()) {
					if (item.getFieldName().equals("product_name")) {
						p.setProductName(item.getString("UTF-8"));
					} else if (item.getFieldName().equals("product_content")) {
						p.setProductContent(item.getString("UTF-8"));
					}
				} else {
					String fileName = item.getName();
					// System.out.println(item.getName());
					int indexOfPoint = fileName.indexOf(".");
					// System.out.println(fileName.indexOf("."));
					String fName = fileName.substring(0, indexOfPoint);
					String ext = fileName.substring(indexOfPoint + 1);
					fileName = fName + "-" + System.nanoTime() + "." + ext;
					item.write(new File(path + "\\" + fileName));
					System.out.println(path + "\\" + fileName);
					p.setImagePath(fileName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		p.setProductNo(maxProduct + 1);
		p.setBrandNo(maxBrand);
		return p;

	}

	// 제품등록맵핑
	public static Product makeRegisterProduct(HttpServletRequest req, int maxProduct) {
		HttpSession session = req.getSession();
		Employee emp = (Employee) session.getAttribute("employee");
		Product p = new Product();
		String path = req.getServletContext().getRealPath("employees/productImg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> list;
		System.out.println();
		try {
			list = uploader.parseRequest(req);
			for (FileItem item : list) {

				if (item.isFormField()) {
					if (item.getFieldName().equals("product_name")) {
						p.setProductName(item.getString("UTF-8"));
					} else if (item.getFieldName().equals("product_content")) {
						p.setProductContent(item.getString("UTF-8"));
					} else if (item.getFieldName().equals("minimum_size")) {
						p.setMinimumSize(Integer.parseInt(item.getString("UTF-8")));
					} else if (item.getFieldName().equals("maximum_size")) {
						p.setMaximumSize(Integer.parseInt(item.getString("UTF-8")));
					} else if (item.getFieldName().equals("type_no")) {
						p.setTypeNo(Integer.parseInt(item.getString("UTF-8")));
					} else if (item.getFieldName().equals("price")) {
						p.setPrice(Integer.parseInt(item.getString("UTF-8")));
					} else if (item.getFieldName().equals("detailcontent")) {
						p.setDetailContent(item.getString("UTF-8"));

					} else if (item.getFieldName().equals("closing_date")) {
						String result = item.getString("UTF-8");
						java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(result);
						System.out.println(2);
						Date close = new Date(date.getTime());
					
						p.setClosingDate(close);

					}

				} else {
					if (item.getFieldName().equals("main_image_path")) {
						String fileName = item.getName();
						// System.out.println(item.getName());
						int indexOfPoint = fileName.indexOf(".");
						// System.out.println(fileName.indexOf("."));
						String fName = fileName.substring(0, indexOfPoint);
						String ext = fileName.substring(indexOfPoint + 1);
						fileName = fName + "-" + System.nanoTime() + "." + ext;
						item.write(new File(path + "\\" + fileName));
						System.out.println(path + "\\" + fileName);
						p.setMainImagePath(fileName);
					}

					else if (item.getFieldName().equals("image_path")) {
						String fileName = item.getName();
						// System.out.println(item.getName());
						int indexOfPoint = fileName.indexOf(".");
						// System.out.println(fileName.indexOf("."));
						String fName = fileName.substring(0, indexOfPoint);
						String ext = fileName.substring(indexOfPoint + 1);
						fileName = fName + "-" + System.nanoTime() + "." + ext;
						item.write(new File(path + "\\" + fileName));
						System.out.println(path + "\\" + fileName);
						p.setDetailImagePath(fileName);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		p.setProductNo(maxProduct + 1);
		java.sql.Date date = null;
		java.util.Date d = new java.util.Date();
		date = new java.sql.Date(d.getTime());
		p.setRegistrationDate(date);
		p.setBrandNo(emp.getBrandNo());
		p.setEmployeeId(emp.getEmployeeId());
		p.setOrderState(0);
		System.out.println("들어왔냐 임마" + p.toString());
		return p;

	}

	public static Notice getNoticeMaker(HttpServletRequest req, int noticeArticleNo) {
		Notice notice = new Notice();
		notice.setNoticeArticleNo(noticeArticleNo);
		notice.setTitle(req.getParameter("title"));
		notice.setContent(req.getParameter("content"));
		return notice;
	}
	public static FreeBoard getFreeMaker(HttpServletRequest req, int articleNo){
		FreeBoard free = new FreeBoard();
		free.setArticleNo(articleNo);
		free.setTitle(req.getParameter("title"));
		free.setContent(req.getParameter("content"));
		return free;
	}
	public static FreeReple getFreeRepleMaker(HttpServletRequest req, int free_reple_no){
		FreeReple freeReple = new FreeReple();
		freeReple.setContent(req.getParameter("content"));
		freeReple.setFreeRepleNo(free_reple_no);
		return freeReple;
		
	}
//직원업데이트
	public static Employee updateEmployee(HttpServletRequest req) {
		String path = req.getServletContext().getRealPath("brand/brandimg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		Employee emp=new Employee();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> list;
		HttpSession session = req.getSession();
		Employee emp1 = (Employee) session.getAttribute("employee");
		System.out.println("원래세션의 값은"+emp1.getImage_path());
		emp.setEmployeeId(emp1.getEmployeeId());
		emp.setEname(emp1.getEname());
		emp.setSsn1(emp1.getSsn1());
		emp.setSsn2(emp1.getSsn2());
		emp.setBrandNo(emp1.getBrandNo());
		emp.setBrandContent(emp1.getBrandContent());
		emp.setBrandName(emp1.getBrandName());
		emp.setActive(emp1.getActive());
		emp.setPoint1(emp1.getPoint1());
		try {
			list = uploader.parseRequest(req);
			for (FileItem item : list) {

				if (item.isFormField()) {
					if (item.getFieldName().equals("company_tell")) {
						emp.setCompanyTell(item.getString("UTF-8"));
						System.out.println("전화번호의 값은"+item.getString("UTF-8"));
					}
					else if (item.getFieldName().equals("employee_pwd")) {
						emp.setEmployeePwd(item.getString("UTF-8"));
						System.out.println("패스워드값은"+item.getString("UTF-8"));
					}
					else if (item.getFieldName().equals("email")) {
						emp.setEmail(item.getString("UTF-8"));
					}
					else if (item.getFieldName().equals("postal_no")) {
						emp.setPostalNo(Integer.parseInt(item.getString("UTF-8")));
					}
					else if (item.getFieldName().equals("address")) {
						emp.setAddress(item.getString("UTF-8"));
					}
					else if (item.getFieldName().equals("tell")) {
						emp.setTell(item.getString("UTF-8"));
					}
				} else {
					if (item.getFieldName().equals("brand_image")) {
						System.out.println("아이템의 이름은"+item.getName());
						if(item.getName()!=null){
							String fileName = item.getName();
						int indexOfPoint = fileName.indexOf(".");
						String fName = fileName.substring(0, indexOfPoint);
						String ext = fileName.substring(indexOfPoint + 1);
						fileName = fName + "-" + System.nanoTime() + "." + ext;
						item.write(new File(path + "\\" + fileName));
						System.out.println(path + "\\" + fileName);
						emp.setImage_path(fileName);
						}else if(item.getName()==null) emp.setImage_path(emp1.getImage_path());
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.removeAttribute("employee");
		session.setAttribute("employee", emp);
		System.out.println("새로생긴 세션의 값은:"+emp.toString());
		return emp;

	}

	public static Product makeProduct(ResultSet rs) {
		Product p=new Product();
		try {
			p.setProductNo(rs.getInt("product_no"));
			p.setProductName(rs.getString("product_name"));
			p.setProductContent(rs.getString("product_content"));
			p.setPrice(rs.getInt("price"));
			p.setMaximumSize(rs.getInt("maximum_size"));
			p.setMinimumSize(rs.getInt("minimum_size"));
			p.setPresentSize(rs.getInt("present_size"));
			p.setRegistrationDate(rs.getDate("registration_date"));
			p.setClosingDate(rs.getDate("closing_date"));
			p.setOrderState(rs.getInt("order_state"));
			p.setMainImagePath(rs.getString("main_image_path"));
			p.setDetailImagePath(rs.getString("image_path"));
			p.setDetailContent(rs.getString("detail_content"));
			p.setTypeNo(rs.getInt("type_no"));
			p.setEmployeeId(rs.getString("employee_id"));
			p.setBrandNo(rs.getInt("brand_no"));
			return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	public static Order makeOrder(Customer customer, Product p, int orderSize, int orderState) {
	Order o=new Order();
	o.setProductNo(p.getProductNo());
	o.setCustomerId(customer.getCustomerId());
	o.setOrderState(orderState);
	o.setOrderPrice(p.getPrice()*orderSize);
	o.setPostalNo(customer.getPostalNo());
	o.setAddress(customer.getAddress());
	o.setOrderSize(orderSize);
	return o;
	}

	public static Order makeOrder(ResultSet rs) {
		Order o=new Order();
		try {
			o.setProductNo(rs.getInt("product_no"));
			o.setAddress(rs.getString("address"));
			o.setCustomerId(rs.getString("customer_id"));
			o.setOrderDate(rs.getDate("order_date"));
			o.setOrderPrice(rs.getInt("order_price"));
			o.setOrderSize(rs.getInt("order_size"));
			o.setOrderState(rs.getInt("order_state"));
			o.setPostalNo(rs.getInt("postal_no"));
			o.setSendDate(rs.getDate("send_date"));
			o.setSendNo(rs.getString("send_no"));
			o.setProductName(rs.getString("product_name"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return o;
	}
}
