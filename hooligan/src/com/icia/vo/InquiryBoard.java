package com.icia.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class InquiryBoard {
	private int inquiryNo;
	private String title;
	private String content;
	private Date inquiryDate;
	private String customerId;
	private int productNo;
}
