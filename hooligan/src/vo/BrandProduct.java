package vo;

import lombok.Data;

@Data
public class BrandProduct {
	private int productNo;
	private int brandNo;
	private String productName;
	private String productContent;
	private int price;
	private String imagePath;
	private int minimumSize;
	private int maximumSize;
	
}
