package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Order {
	private int productNo;
	private String customerId;
	private int orderState;
	private Date orderDate;
	private int orderPrice;
	private int postalNo;
	private String address;
	private int orderSize;
	private Date sendDate;
	private String sendNo;
	
}
