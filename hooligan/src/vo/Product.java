package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Product {
	private int productNo;
	private String productName;
	private String productContent;
	private int price;
	private int minmumSize;
	private int maxmumSize;
	private int presentSize;
	private Date registrationDate;
	private Date closingDate;
	private int orderState;
	private int typeNo;
	private String employeeId;
	private int brandNo;
	private String imgPath;
	
	
	
}
