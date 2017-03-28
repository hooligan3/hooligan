package com.icia.util;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.icia.vo.Customer;
import com.icia.vo.Employee;

public class MappingUtil {
	public static Customer	makeCustomer(HttpServletRequest req){
		Customer customer=new Customer();
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
	public static Customer	makeUpdateCustomer(HttpServletRequest req){
		Customer customer=new Customer();
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
	public static Employee makeEmployee(HttpServletRequest req, int maxBrand) {
		Employee e=new Employee();
		e.setActive(1);
		e.setAddress(req.getParameter("address"));
		e.setBrandNo(maxBrand+1);
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
	public static Employee makeEmplFromRequest(HttpServletRequest req, int beautyNo) {
		Employee e= new Employee();

		
		java.sql.Date date = null;
		String path = req.getServletContext().getRealPath("beautys/beautyimg");
		DiskFileItemFactory f = new DiskFileItemFactory();
		ServletFileUpload uploader = new ServletFileUpload(f);
		uploader.setFileSizeMax(1024 * 1024 * 10);
		List<FileItem> list;

		try {
			list = uploader.parseRequest((RequestContext) req);
			for (FileItem item : list) {
				
				if(item.isFormField()) {
					if(item.getFieldName().equals("orner_id")){
						b.setBeautyId(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_pwd")){
						b.setBeautyPwd(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_name")){
						b.setBeautyOrnerName(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_address")){
						b.setBeautyAddress(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("business_name")){
						b.setBeautyName(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_no")){
						b.setBeautyOrnerNo(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_mail")){
						b.setBeautyMail(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_phone")){
						b.setBeautyPhone(item.getString("UTF-8"));
					}else if(item.getFieldName().equals("orner_active")){
						b.setBeautyActive(Integer.parseInt(item.getString("UTF-8")));
						if (b.getBeautyActive() == 2) {
							java.util.Date d = new java.util.Date();
							date = new java.sql.Date(d.getTime());
						}
						b.setBeautyActiveDate(date);
					}else if(item.getFieldName().equals("orner_adminno")){
						b.setAdminNo(Integer.parseInt(item.getString("UTF-8")));
					}
				}else{
					String fileName = item.getName();
					// System.out.println(item.getName());
					int indexOfPoint = fileName.indexOf(".");
					// System.out.println(fileName.indexOf("."));
					String fName = fileName.substring(0, indexOfPoint);
					String ext = fileName.substring(indexOfPoint + 1);
					fileName = fName + "-" + System.nanoTime() + "." + ext;
					item.write(new File(path + "\\" + fileName));
					System.out.println(path + "\\" + fileName);
					b.setBeautyPhoto(fileName);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
