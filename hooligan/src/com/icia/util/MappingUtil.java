package com.icia.util;

import java.io.*;
import java.sql.Date;

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
import com.icia.vo.Brand;
import com.icia.vo.BrandProduct;
import com.icia.vo.Customer;
import com.icia.vo.Employee;
import com.icia.vo.Product;

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
		e.setActive(0);
		e.setAddress(req.getParameter("address"));
		e.setBrandNo(maxBrand + 1);
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
		HttpSession session=req.getSession();
		Employee emp=(Employee)session.getAttribute("employee");
		Product p=new Product();
		String path = req.getServletContext().getRealPath("employees/productImg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> list;
		System.out.println();
		try {
			list = uploader.parseRequest(req);
			for (FileItem item : list) {
				
				if(item.isFormField()) {
					if(item.getFieldName().equals("product_name")){
						p.setProductName(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("product_content")){
						p.setProductContent(item.getString("UTF-8"));	
				}
					else if(item.getFieldName().equals("minimum_size")){
						p.setMinimumSize(Integer.parseInt(item.getString("UTF-8")));	
				}
					else if(item.getFieldName().equals("maximum_size")){
						p.setMaximumSize(Integer.parseInt(item.getString("UTF-8")));	
				}
					else if(item.getFieldName().equals("type_no")){
						p.setTypeNo(Integer.parseInt(item.getString("UTF-8")));	
				}
					else if(item.getFieldName().equals("price")){
						p.setPrice(Integer.parseInt(item.getString("UTF-8")));	
				}
					else if(item.getFieldName().equals("detailcontent")){
						p.setDetailContent(item.getString("UTF-8"));	
						
				}	else if(item.getFieldName().equals("closing_date")){
					String result=item.getString("UTF-8");
					java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(result);
					System.out.println(2);
					Date close=new Date(date.getTime());
					p.setClosingDate(close);
				
			}
					
					
				}else{
					if(item.getFieldName().equals("main_image_path")){
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
				
					else if(item.getFieldName().equals("image_path")){
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
			}}catch (Exception e) {
			e.printStackTrace();
		}
		
		p.setProductNo(maxProduct+1);
		java.sql.Date date = null;
		java.util.Date d = new java.util.Date();
		date = new java.sql.Date(d.getTime());
		p.setRegistrationDate(date);
		p.setBrandNo(emp.getBrandNo());
		p.setEmployeeId(emp.getEmployeeId());
		p.setOrderState(0);
		System.out.println("들어왔냐 임마"+p.toString());
		return p;
		
	}

	public static Notice getNoticeMaker(HttpServletRequest req, int noticeArticleNo) {
		Notice notice = new Notice();
		notice.setNoticeArticleNo(noticeArticleNo);
		notice.setTitle(req.getParameter("title"));
		notice.setContent(req.getParameter("content"));
		return notice;
	}
}
