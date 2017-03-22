package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.JdbcUtil;
import vo.Product;

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
	//!!!!!!!!!!!!!!!!!!!!!!硫붿씤酉곌��졇�삱嫄�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//踰좎뒪�듃�긽�뭹媛��졇�삤湲�
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
	//理쒖떊�긽�뭹媛��졇�삤湲�
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
	//硫붿씤泥ロ솕硫� 利먭꺼李얘린 媛��옣�넂�� �긽�뭹戮묎린 �긽�뭹踰덊샇�슦�꽑
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
	
}
