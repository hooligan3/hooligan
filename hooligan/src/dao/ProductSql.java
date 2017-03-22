package dao;

public interface ProductSql {
	//제품등록
	public  String insertProduct= "insert into product values(?,?,?,?,?,?,?,sysdate,sysdate,1,10,'qwelsmmin',1)";
	//제품명검색
	public String searchOfProduct="select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.product_name=?";
	//상품종류별검색
	public String searchOfKind="select rnum,t2.* from(select rownum rnum,t1.* from(select p.*,m.* from product p,main_image m where p.product_no=m.product_no and p.type_no=?)t1)t2 where rnum between ? and ?";
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
	public String updatePresentSize="update present_size set present_size=? where product_no=?";
	//3.주문상태변경
	public String updateOrderState="update product set order_state=? where product_no=?";
	//4.현재상품주문내역에 추가
	public String insertOrder="insert into order(product_no,customer_id,order_state,order_date,order_price,postal_no,address,order_size,send_date,sent_no) values(?,?,?,sysdate,?,?,?,?,?,?)";
	
	
	
	
	
	
	
	
}