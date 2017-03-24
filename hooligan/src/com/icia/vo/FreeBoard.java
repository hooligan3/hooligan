package com.icia.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class FreeBoard {
	private int articleNo;
	private String title;
	private int hits;
	private String Content;
	private Date articleDate;
	private String customerId;
	
}
