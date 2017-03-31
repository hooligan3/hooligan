package com.icia.dao;

public interface NoticeSql {
	// 자유게시판
		public String insertFreeBoard = " insert into free_board values(seq_free.nextval,?,0,?,sysdate,?)";
		// 자유게시판글 작성
		public String updateFreeBoard = "update free_board set title=?, content=? where article_no=?";
		// 자유게시판글 수정
		public String deleteFreeBoard = "delete from free_board where article_no=?";
		// 자유게시판글 삭제
		public String insertFreeReple = "insert into free_reple values(req_free_reple.nextval,?,?,?,sysdate)";
		// 자유게시판댓글 작성 
		public String updateFreeReple = "update free_reple set content=? where free_reple_no=?";
		// 자유게시판댓글 수정
		public String deleteFreeReple = "delete from free_reple where free_reple_no=?";
		// 자유게시판댓글 삭제
		public String FreeList = "select t2.* from (select rownum rnum, t1.* from (select * from free_board order by article_no desc) t1) t2 where rnum between ? and ?";
		//자유게시판 리스트
		public String countFree ="select count(*) from free_board";
		//자유게시판 총 게시글 개수
		
		//자유게시판 조회수 증가
		public String hitsPlust= "update free_board set hits=hits+1 where article_no=? ";
		public String FreeView = "select * from free_board where article_no=?";
		//자유게시판 댓글 조회
		public String freeRepleList = "select * from free_reple where article_no=?";
		//자유게시판 댓글 하나 조회
		public String freeRepleView = "select * from free_reple where free_reple_no=?";
		
		
		// 공지게시판
		public String insertNotice = "insert into notice values(seq_notice.nextval,?,?,sysdate)";
		// 공지사항 작성
		public String updateNotice = "update notice set title=?, content=? where notice_article_no=?";
		// 공지사항 수정
		public String deleteNotice = "delete from notice where notice_article_no=?";
		// 공지사항 삭제
		
		//공지사항 게시판 리스트 보기
		public String NoticeList = "select t2.* from (select rownum rnum, t1.* from (select notice_article_no,title,content,notice_Date from notice order by NOTICE_ARTICLE_NO desc) t1) t2 where rnum between ? and ?";
		
		public String countNotice = "select count(*) from notice";
		//공지사항 게시판 조회
		public String NoticeView = "select * from notice where notice_article_no=?";
}
