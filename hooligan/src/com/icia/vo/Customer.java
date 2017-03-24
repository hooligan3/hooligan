package com.icia.vo;

import lombok.Data;

@Data
public class Customer {
	private String customerId;
	private String customerPwd;
	private String customerName;
	private int postalNo;
	private String address;
	private String tell;
	private String ssn1;
	private String ssn2;
	private String email;
	private int point;
	private int gradeNo;
	private String gradeName;
	private float discountRate;
	
}
