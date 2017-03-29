package com.icia.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Product {
	private int productNo;
	private String productName;
	private String productContent;
	private int price;
	private int minimumSize;
	private int maximumSize;
	private int presentSize;
	private Date registrationDate;
	private Date closingDate;
	private int orderState;
	private int typeNo;
	private int brandNo;
	private String employeeId;
	private String mainImagePath;
	private String detailContent;
	private String detailImagePath;
	
	
	
	
}
