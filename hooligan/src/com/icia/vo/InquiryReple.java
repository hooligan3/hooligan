package com.icia.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class InquiryReple {
	private int inquiryRepleNo;
	private String content;
	private Date repleDate;
	private int inquiryNo;
}
