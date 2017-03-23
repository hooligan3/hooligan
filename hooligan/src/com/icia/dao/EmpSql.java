package com.icia.dao;

public interface EmpSql {
	// 직원 회원가입
		public String insertEmployee = "insert into employee(employee_id,employee_pwd, ename, postal_no, address, tell, ssn1, ssn2, email) values (?,?,?,?,?,?,?,?,? )";
		
		// 브랜드 등록(직원 회원가입)
		public String insertBrand = "insert into brand values(seq_employee.nextval,?,?,?)";
		
		// 미리보기 상품 등록(직원 회원가입)
		public String insertPreProduct ="insert into brand_product values(seq_brand.nextval,?,?,?,?,?,?,?)";
		
		//브랜드 대표이미지 등록(직원 회원가입)
		public String insertBrandImg = "insert into brand_image values(?,?);";
		
		//로그인
		public String login = "select count(*) from customer where employee_id=? and employee_pwd=?";
		
		//직원 주소 조회
		public String selecAddressOfEmployee = "select postal_no, address from employee where employee_id=?";
		
		//아이디 중복 확인
		public String confirmId= "select count(*) from customer where employee_id=?";
		
		//아이디 찾기
		public String findIdOfEmployee ="select employee_id from employee where employee_ssn1=? and employee_ssn2=?";
		
		//비밀번호 찾기
		public String findPwdOfEmployee="select employee_pwd from employee where employee_id=? and employee_ssn1=? and employee_ssn2=?";
		
		//직원 삭제
		public String deleteEmployee="delete from employee where employee_id=?";
		
		//직원 정보 수정
		public String updateEmployee="update employee set employee_pwd=?, postal_no=?, address=?, email=?, tell=? where employee_id=?";
		
		//맛보기 상품글 수정(직원 마이페이지)
		public String updatePreProduct ="update brand_product set product_name=?, product_content=?, product_price=?, image_path=?, maximum_size=?, minimum_size=? where product_no=?";
		
		//브랜드 수정(직원 마이페이지)
		public String updateBrand ="update brand set brand_name=?, brand_content=?, company_tell=? where brand_no=?";
		
		//주문한 회원목록 조회
		public String selectCustomerByorder = "select t2.* from (select rownum rnum, t1.* from (select customer_id, order_date, order_price, postal_no, address, order_size from product_order where product_no=?) t1 ) t2 where rnum between ? and ?";
		
		//포인트 환급
		public String refundPoint1 ="update employee set point=? where employee_id=?";
		public String refundPoint2 ="insert into refund_point values(?,sysdate,?)";
		
		//상품글 등록
		public String registerProduct ="insert into product values((select max(product_no)+1 from product),?,?,?,?,?,?,sysdate,?,?,?,?,?)";
		
		//상품글 수정
		public String updateProduct="update product set product_name=?, product_content=?, price=?, minimum_size=?, maximum_size=?, closing_data=? where product_no=?";
		
		//상품글 삭제
		public String deleteProduct="delete from product where product_no=?";
		
		//총 주문한 상품 개수 조회
		public String selectNumberOfProductOrder ="select count(*) from product_order where product_no=?";
		
		// 상품 마감여부 조회@@@@@@@
		
		/*수민이형 수정요망*/public String selectEndOfProduct1 ="select closing_date from product where product_no=?";
		/*수민이형 수정요망*/public String selectEndOfProduct2 ="update product set order_state=? where product_no=?";
		
		//총 즐겨찾기 수 조회
		public String selectNumberOfBookmark ="select count(*) from bookmark where  product_no=?";
		
		//제품 상세 조회(이미지+글)
		public String selectDetailImage ="select image_path, detail_content from detail_product where product_no=?";
		
		
}
