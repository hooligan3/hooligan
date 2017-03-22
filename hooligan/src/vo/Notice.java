package vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Notice {
	private int noticeArticleNo;
	private String title;
	private String content;
	private Date noticeDate;
}
