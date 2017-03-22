package com.icia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.icia.util.JdbcUtil;
import com.icia.vo.Customer;
import com.icia.vo.Notice;
import com.icia.vo.Product;

public class HooliganDao {
	
	public Product makeProduct(ResultSet rs){
		Product pro=new Product();
		try {
			pro.setBrandNo(rs.getInt("brand_no"));
			pro.setClosingDate(rs.getDate("closing_date"));
			pro.setEmployeeId(rs.getString("employee_id"));
			pro.setImgPath(rs.getString("image_path"));
			pro.setMaxmumSize(rs.getInt("maximum_size"));
			pro.setMinmumSize(rs.getInt("minimum_size"));
			pro.setOrderState(rs.getInt("order_state"));
			pro.setPresentSize(rs.getInt("present_size"));
			pro.setPrice(rs.getInt("price"));
			pro.setProductContent(rs.getString("product_content"));
			pro.setProductName(rs.getString("product_name"));
			pro.setProductNo(rs.getInt("product_no"));
			pro.setRegistrationDate(rs.getDate("registration_date"));
			pro.setTypeNo(rs.getInt("type_no"));
			return pro;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}return null;
		
	}
	//!!!!!!!!!!!!!!!!!!!!!!메인뷰가져올거!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//베스트상품가져오기
	public ArrayList<Product> bestProduct(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Product> list=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(ProductSql.searchOfBestProduct);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(makeProduct(rs));
			}	return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	//최신상품가져오기
	public ArrayList<Product> newProduct(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Product> list=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(ProductSql.searchOfNewProduct);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(makeProduct(rs));
			}	return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt, rs);
		}
		return null;
	}
	//메인첫화면 즐겨찾기 가장높은 상품뽑기 상품번호우선
	public int bookmarkBest(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(ProductSql.searchOfBestBookMark);
			rs=pstmt.executeQuery();
			while(rs.next()){
				return rs.getInt("product_no");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt, rs);
		}return -1;
	}
	public Product bookmarkBest2(Connection conn,int productNo){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(ProductSql.searchOfBestBookMark2);
			pstmt.setInt(1, productNo);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				return makeProduct(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(pstmt, rs);
		}return null;
		
	}
	

/* 공지 게시판 */

// 공지사항 작성
public int insertNotice(Connection conn,Notice notice){
	PreparedStatement pstmt=null;
	
	try {
		pstmt=conn.prepareStatement(noticeSql.insertNotice);
		pstmt.setInt(1,notice.getNoticeArticleNo());
		pstmt.setString(2,notice.getTitle());
		pstmt.setString(3, notice.getContent());
		pstmt.setDate(4, notice.getNoticeDate());
		return  pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JdbcUtil.close(pstmt, null);
	}return -1;
	
}
//공지사항 수정
public int updateNotice(Connection conn,Notice notice){
	PreparedStatement pstmt = null;
			try {
				pstmt=conn.prepareStatement(noticeSql.insertNotice);
				pstmt.setString(1,notice.getTitle());
				pstmt.setString(2,notice.getContent());
				pstmt.setInt(3, notice.getNoticeArticleNo());
				return	pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JdbcUtil.close(pstmt, null);
			}return -1;
}
//공지사항 삭제
public int deleteNotice(Connection conn,int noticeArticleNo){
	PreparedStatement pstmt = null;
	try {
		pstmt=conn.prepareStatement(noticeSql.deleteNotice);
		
		pstmt.setInt(1, noticeArticleNo);
		return pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JdbcUtil.close(pstmt, null);
	}return -1;
}

public int insertCustomer(Connection conn,Customer customer){
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
}


}
