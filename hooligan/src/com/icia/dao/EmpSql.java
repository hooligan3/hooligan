package com.icia.dao;

public interface EmpSql {
	// 직원 회원가입
		public String insertEmployee = "insert into employee(employee_id,employee_pwd, ename, postal_no, address, ssn1, ssn2, email, tell,active,brand_no,point1) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		public String maxBrandNo="select max(brand_no) from brand";
		public String maxProductNo="select max(product_no)from brand_product";
		public String brandSelectByBrandNo="select * from brand where brand_no=?";
		// 브랜드 등록(직원 회원가입)
		public String insertBrand = "insert into brand values(?,?,?,?,?)";
		//상품종류가져오기(상품등록)
		public String selectProductSort="select *from type order by type_no";
		// 미리보기 상품 등록(직원 회원가입)
		public String insertPreProduct ="insert into brand_product values(?,?,?,?,?)";
		
		//브랜드 대표이미지 등록(직원 회원가입)
		public String insertBrandImg = "insert into brand_image values(?,?);";
		
		//로그인
		public String employeelogin = "select e.* from employee e where e.employee_id=? and e.employee_pwd=? and active=1";
		
		//직원 주소 조회
		public String selecAddressOfEmployee = "select postal_no, address from employee where employee_id=?";
		
		//아이디 중복 확인
		public String doubleIdCheck= "select count(*) from employee where employee_id=?";
		
		//아이디 찾기
		public String employeeSelectById ="select employee_id from employee where employee_ssn1=? and employee_ssn2=?";
		
		//비밀번호 찾기
		public String findPwdOfEmployee="select employee_pwd from employee where employee_id=? and employee_ssn1=? and employee_ssn2=?";
		
		//직원 삭제
		public String deleteEmployee="delete from employee where employee_id=? and employee_pwd=?";
		
		//직원 정보 수정
		public String updateEmployee="update employee set employee_pwd=?, postal_no=?, address=?, email=?, tell=? where employee_id=?";
		
		//맛보기 상품글 수정(직원 마이페이지)
		public String updatePreProduct ="update brand_product set product_name=?, product_content=?, product_price=?, image_path=?, maximum_size=?, minimum_size=? where product_no=?";
		
		//브랜드 수정(직원 마이페이지)
		public String updateBrand ="update brand set brand_name=?, content=?, company_tell=?,image_path=? where brand_no=?";
		
		//주문한 회원목록 조회
		public String selectCustomerByorder = "select t2.* from (select rownum rnum, t1.* from (select customer_id, order_date, order_price, postal_no, address, order_size from product_order where product_no=?) t1 ) t2 where rnum between ? and ?";
		
		//포인트 환급
		public String refundPoint1 ="update employee set point=? where employee_id=?";
		
		public String refundPoint2 ="insert into refund_point values(?,sysdate,?)";
		//상품번호가져오기
		public String registerProductMaxNo="select max(product_no) from product";
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
		//직원 등록한 제품리스트(개수파악)
		public String productListCount = "select count(*)from product where employee_id=?";
		public String productList ="select rnum,t2.* from(select rownum rnum,t1.* from(select p.* from product p where p.employee_id=? order by p.REGISTRATION_DATE desc)t1)t2 where rnum between ? and ? ";
		

		

		//직원 전체 조회
		public String selectEmployees ="select t2.* from (select rownum rnum, t1.* from (select employee_id,ename,tell,ssn1,ssn2,email,postal_no,address,active from employee) t1 ) t2 where rnum between ? and ?";
		// 총 직원 수
		public String countEmployees ="select count(*) from employee";
	

		//신청중인 직원 조회
		public String selectNoActiveEmployees ="select t2.* from (select rownum rnum, t1.* from (select employee_id,ename,tell,ssn1,ssn2,email,postal_no,address,active,brand_no from employee where active=0) t1 ) t2 where rnum between ? and ?";
		//신청중인 직원 수
		public String countNoActiveEmployee = "select count(*) from employee where active=0";

		//직원 활성화 하기
		public String ActiveEmployee = "update employee set active=1 where employee_id=?";
		

		//직원 거절하기 
		public String DeleteEmployee = "delete from employee where employee_id=?";
		
		
}
