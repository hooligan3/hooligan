package com.icia.vo;


import lombok.Data;

@Data
public class DetailProduct {
	private int productNo;
	private int detailNo;
	private String imagePath;
	private String detailContent;
}
