package com.icia.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class FreeReple {
	private int freeRepleNo;
	private int articleNo;
	private String content;
	private Date repleDate;
}
