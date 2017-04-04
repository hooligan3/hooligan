<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/brand_description.css" rel="stylesheet" />
      <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/hooligan/css/style.css">
    <link rel="stylesheet" type="text/css" href="/hooligan/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />
    <script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script>
		var result = <%=request.getAttribute("result")%>
		
		var notice = result.notice
		var title = notice.title;
		var content = notice.content;
		var noticeArticleNo = notice.noticeArticleNo;
		$(function(){
			
			var str = "<input type='text' value='"+title+"' id='title' name='title' style='width:700px;'>";
			var str2 = "<textarea rows='13' cols='2' style='width:700px;'name='content' id='content'>"+content+"</textarea>";
			var str3 = "<input type='hidden' name='noticeArticleNo' value='"+ noticeArticleNo+"'>"; 
			$("#title").append(str);			   							
			$("#content").append(str2);
			$("#bunho").append(str3);
			
		})
	</script>
</head>
<body>
    <div id="wrap">
        <header id="header">
            <h1><a href="manager_index.html"><img class="main_logo_img" src="/hooligan/images/logo.png" alt="로고" /></a></h1>
            <p>Manager</p>
        </header>
        <!--==============헤더와 본문 영역 구분===============-->
        <div id="header_blank"></div>
        <!--==============헤더와 본문 영역 구분===============-->
        <div id="container">
            <nav class="main_gnb">
                  <ul>
                    <li><a href="/hooligan/AdminWaitEmployee.jsp">승인대기중인 개인사업자</a></li>
                    <hr/>
                    <li><a href="/hooligan/AdminEmployeeList.jsp">개인사업자 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminCustomerList.jsp">회원 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminBrandList.jsp">브랜드 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminPointSelect.jsp">매출 내역</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminNoticeList.jsp">공지사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>공지사항 수정</h2><br><br>
               
               <div style="margin-left: 33px;">
               
               <form action="/hooligan/admin/notice/update" method="post">
               
               	제목 : <div id="title">
               	
               	</div><br><br>
               	
               	<div>내용</div>
               	
               		<div id="content">
               			
               		</div>
               		<div id="bunho">
               			
               		</div>
               </div>
               <br>
               
               <button style="margin-left: 320px; width:60px; height:30px;">
               <a href="/hooligan/admin/notice/list">뒤로</a></button>
               &nbsp; &nbsp;
               <input type="submit" style="width:60px; height:30px;" value="등록">
               
               </form>
            </section>
        </div>
    </div>
</body>
</html>