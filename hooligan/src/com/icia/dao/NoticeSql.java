package com.icia.dao;

public interface NoticeSql {
	// 자유게시판
		public String insertFreeBoard = " insert into free_board values(?,?,?,?,?,?)" ;
		// 자유게시판글 작성
		public String updateFreeBoard = "update free_board set title=?, content=? where article_no=?";
		// 자유게시판글 수정
		public String deleteFreeBoard = "delete from free_board where article_no=?";
		// 자유게시판글 삭제
		public String insertFreeReple = "insert into free_reple values(?,?,?)";
		// 자유게시판댓글 작성 
		public String updateFreeReple = "update free_reple set content=? where free_reple_no=?";
		// 자유게시판댓글 수정
		public String deleteFreeReple = "delete from free_reple where free_reple_no=?";
		// 자유게시판댓글 삭제
		
		// 공지게시판
		public String insertNotice = "insert into notice values(?,?,?,?)";
		// 공지사항 작성
		public String updateNotice = "update notice set title=?, content=? where notice_articele_no=?";
		// 공지사항 수정
		public String deleteNotice = "delete from notice where notice_article_no=?";
		// 공지사항 삭제
		
		
}
