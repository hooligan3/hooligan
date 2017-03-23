package com.icia.dao;

public interface CustomerSql {
	// 회원
		//회원가입
		public String insertCustomer= " insert into CUSTOMER(CUSTOMER_ID,CUSTOMER_PWD,CUSTOMER_NAME,postal_no,address,tell,ssn1,ssn2,email,point1,grade_no)values(?,?,?,?,?,?,?,?,?,0,1)";

		//아이디 중복 확인
		public String doubleIdCheck ="select count(*) from coustomer where customer_id=?"; 
		
		//회원 아이디 찾기
		public String selectById="select customer_id from customer where ssn1=? and ssn2=?";
		
		//회원 비밀번호 찾기
		public String selectByPwd="select customer_pwd from customer where customer_id=? and ssn1=? and ssn2=?"; 

		//회원 탈퇴
		public String deleteCustomer="delete from customer where customer_pwd=?"; //exrd한번확인 employee_pwd 였음

		//회원 정보수정
		public String updateCustomer ="update customer set CUSTOMER_PWD=?,CUSTOMER_NAME=?,POSTAL_NO=?,ADDRESS=?,tell=?,email=?";
		//로그인
		public String loginCustomer="select c.*,g.grade_name,g.discount_rate from customer c,grade g where c.grade_no=g.grade_no and c.customer_id=? and c.customer_pwd=?";
		//로그인
		
		//즐겨 찾기 조회
		//즐겨찾기 수 가져오기
		public String bookmarkByInquiry= "select count(*) from bookmark where product_no=?";
		public String bookmarkByNumber ="select b.product_no,m.image_path,p.product_name,p.closing_date from bookmark b,customer c,product p,main_image m where c.customer_id=b.CUSTOMER_ID and b.PRODUCT_NO=p_product_no and p.PRODUCT_NO=m.PRODUCT_NO and b.CUSTOMER_ID=?";

		//즐겨 찾기 등록
		public String  bookmarkInsert="insert into BOOKMARK(customer_id,PRODUCT_NO)values(?,?)";
		
		//주문 내역조회

		//주문하기

		/*회원 등급 업
		select c.customer_id,g.grade_no,g.grade_name,g.discount_rate,g.maximum_condition,g.minimum_condition from customer c,grade g
		where c.grade_no=g.grade_no where c.customer_id;
		 */
		/* 포인트 충전 
		update set customer point=+? where customer_id=?
		update set point set=? where point 
		 */

		//전체 브랜드 조회
		public String brandAll = "select i.image_path, b.* from brand b,brand_image i  where  b.brand_no=i.brand_no";
		/* -----------------------------------------------------------------------------------------------------*/
		/* 문의 게시판*/
		
		//문의게시판글 작성
		public String  insertInquiryAticle= "insert into INQUIRY_BOARD values(?,?,?,?)";
		//문의게시판글수정
		public String updateInquiryAticle = "update INQUIRY_BOARD set title=?, content=? where inquiry_no=?";
		//문의게시판글삭제
		public String deleteInquiryAticle = "delete from INQUIRY_BOARD where inquiry_no=?";
		
		//문의게시판댓글작성
		public String insertInquiryAticleIReple  = "insert into INQUIRY_REPLE values(?,?,?,?)";
		//문의게시판댓글수정
		public String updateInquiryAticleReple ="update INQUIRY_REPLE set content=? where INQUIRY_REPLE_NO=?";
		//문의게시판댓글삭제
		public String deleteInquiryAticleReple ="delete from INQUIRY_REPLE where INQUIRY_REPLE_NO=?";
		
		/*--------------------------------------------------------------------------------------------------------*/
		/*상품평가 게시판*/
		
		//상품게시판글 작성
		public String evaluationArticleInsert =" insert into EVALUATION values(?,?,sysdate,?,?,?)";
		//상품게시판글수정
		public String evaluationArticleUpdate = "update EVALUATION set title=?, content=? where EVALUATION_NO=?";
		//상품게시판글삭제
		public String  evaluationArticleDelete="delete from EVALUATION where EVALUATION_NO=?";
	/* -- 게시 시간 넣어야함 !@ !@!@!@!@!@!@!
		//내가쓴 평가글 조회  
		public  String evaluationArticleMy ="select c.CUSTOMER_ID,e.title,e.SCORE from CUSTOMER c,EVALUATION e where c.CUSTOMER_ID=e.CUSTOMER_ID and c.CUSTOMER_ID=?";
	*/
	}
