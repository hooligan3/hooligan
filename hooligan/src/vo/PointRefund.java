package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class PointRefund {
	private String employeeId;
	private Date refundDate;
	private int refundPoint;
}
