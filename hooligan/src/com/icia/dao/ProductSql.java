package com.icia.dao;

public interface ProductSql {
	//제품등록
	public  String insertProduct= "insert into product values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	//제품명검색
	public String searchOfProduct="select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.product_name=?";
	//상품종류별검색
	public String searchOfKind="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.type_no=?)t1)t2 where rnum between ? and ?";
	//메인 최신제품받기
	public String mainRecentProduct="select rnum,t2.* from(select rownum rnum,t1.* from(select p.* from product p  order by p.REGISTRATION_DATE desc )t1)t2 where rnum between 1 and 15";
	//메인 인기상품받기
	public String mainHitProduct="select rnum,t2.* from(select rownum rnum,t1.* from(select p.* from product p  order by p.present_size ASC, p.product_no desc )t1)t2 where rnum between 1 and 15";
	//브랜드의종류별검색
	
	//1.최신
	public String searchOfRecentOfBrandOfKind="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.type_no=? and brand_no=? order by p.REGISTRATION_DATE desc)t1)t2 where rnum between ? and ?";
	//2.베스트
	public String searchOfBestOfBrand="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.type_no=? and brand_no=? order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";
	//!!!!!!!!!!!!!!메인뷰!!!!!!!!!!!!!!!
	//즐겨찾기 제일높은걸 찾고
	public String searchOfBestBookMark="select product_no,count(*)from bookmark group by product_no order by count(*) desc";
	//상품꺼내오기
	public String searchOfBestBookMark2="select p.*,m.image_path from MAIN_IMAGE m,product p where m.product_no=p.product_no and where product_no=?";
	//베스트상품조회
	public String searchOfBestProduct="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";
	//최신상품조회
	public String searchOfNewProduct="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m order by p.registration_date desc)t1)t2 where rnum between ? and ?";

	//브랜드별베스트게시물조회
	public String searchOfBestBrand="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m WHERE p.BRAND_NO=? order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";
	//의류별베스트게시물조회
	public String searchOfBestOfKind="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m WHERE p.TYPE_NO=? order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";
	
	//수제품별베스트게시물조회
	public String searchOfHandBest="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m WHERE p.BRAND_NO=1000 order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";

	//식품별베스트게시물조회
	public String searchOfFood="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m WHERE p.BRAND_NO=2000 order by p.PRESENT_SIZE desc)t1)t2 where rnum between ? and ?";
	//초성으로 브랜드이름검색
	/*SELECT *FROM PRODUCT WHERE PRODUCT_NAME<=NCHR(45207);--ㄱ으로검색
	SELECT *FROM product
	where product_name between NCHR(45208) AND NCHR(45795);--ㄴ으로 검색
*/
	//주문
	
	//1.현재주문수량과 최소 최대수량 가져오기
	public String selectPresentSize="select present_size,minimum_size,maximum_size from product  where product_no=?";
	//2.주문수량변경
	public String updatePresentSize="update product set present_size=? where product_no=?";
	//3.주문상태변경
	public String updateOrderState="update product set order_state=? where product_no=?";
	//상품내역의 주문상태변경
	public String updateOrderStateProductOrder = "update product_order set order_state=? where product_no=?";
	//4.현재상품주문내역에 추가
	public String insertOrder="insert into product_order(product_no,customer_id,order_state,order_date,order_price,postal_no,address,order_size) values(?,?,?,sysdate,?,?,?,?)";
	
	//제품 메인보기
	public String productMain = "select *from product where product_no=?";
	public String updateCustomerPoint = "update customer set point1=? where customer_id=?";
	public String productOrderCount = "select count(*)from product_order where customer_id=?";
	
	public String orderList = "select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,o.product_name from product_order p,product o where p.customer_id=? and p.product_no=o.product_no order by p.order_date desc)t1)t2 where rnum between ? and ? ";

	
	//브랜드 전체 조회
	public String selectAllBrand = "select t2.* from (select rownum rnum, t1.* from (select brand_no, brand_name from brand order by brand_no desc) t1) t2 where rnum between ? and ?";
	// 브랜드 전체 수
	public String countBrand = "select count(*) from brand";
	
	//브랜드 상세조회
	public String selectDetailBrand ="select image_path, brand_name, content from brand where brand_no=?";
	//상품 상세 조회
	public String selectDetailProduct = "select *from brand_product where brand_no=?";
	//종류별 상품 뿌리기
	public String selectProductByType = "select t2.* from (select rownum rnum, t1.* from (select * from product where type_no=? order by product_no desc) t1 ) t2 where rnum between ? and ?";
	//종류별 상품 총 개수
	public String countProductByType = "select count(*) from product where type_no=?";
	
	
}
