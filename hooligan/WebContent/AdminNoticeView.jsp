<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/confirm_waiting_company.css" rel="stylesheet" />
    <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/hooligan/css/style.css">
    <link rel="stylesheet" type="text/css" href="/hooligan/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	/*
	  <thead id="notice">
				                    <tr>
										<th style="text-align: center;">1(글번호)</th>
										<th style="text-align: center;">유앤미 카페에 어서오세요</th>
										<th style="text-align: center;">조회수(1167)  </th>
									</tr>
                  					  </thead>
	*/
	
	var result = <%=request.getAttribute("result")%>
	var pageNo = <%= request.getParameter("pageNo") %>;
	
	$(function(){
		var noticeArticleNo = result.noticeArticleNo;
		
		var str5 = "<input type='hidden' name='noticeArticleNo' id='noticeArticleNo' value='"+noticeArticleNo+"'>";
		var str = "<tr><th style='text-align: center;'>"+result.noticeArticleNo+"</th>";
		str = str + "<th style='text-align: center;'>"+result.title+"</th>";
		str = str + "<th style='text-align: center;'>"+result.noticeDate+"</th><tr>";
		
		$("#notice").append(str);
		
		var str2 = result.content;
		$("#content").append(str2);
		
		$("#back").on("click","#list",function(){
			location.href='list?pageNo='+pageNo;
		});
		$("#back").on("click","#update", function() {
			location.href='update?notice_article_no=' + result.noticeArticleNo;
		});	
	
		var back = $("#back");
		var back2 = $("#back2 form");
		back.append(str5);
		back.append("<input type='submit' value='이전으로'data-loading-text='Loading...' class='btn btn-default btn-lg' id='list'>")
		back.append("<input type='submit' value='내용수정'data-loading-text='Loading...' class='btn btn-default btn-lg' id='update'>")
		back2.append("<input type='hidden' name='noticeArticleNo' id='noticeArticleNo' value='"+noticeArticleNo+"'>")
		back2.append("<input type='submit' value='삭제'data-loading-text='Loading...' class='btn btn-default btn-lg' id='delete'>")
	
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
                <h2>공지 사항</h2>
                
                <div class="article">
                
                    <div class="col-lg-12 col-md-12 col-sm-12">
							<br><br>
						
							
							<div class="well well-lg" style="padding-right: 50px;">
							
              				  			<table class="table table-striped table-hover" style="text-align: center;">
				                    <thead id="notice">
				                    
                  					  </thead>
                   

              						  </table>
              		
              		   <div class="col-lg-1 col-md-1 col-sm-1">
              		   </div>
              		   
              		   <div class="col-lg-10 col-md-10 col-sm-10">
              		   <br>
              		   <p style="max-height: 700px; min-height: 250px;">
              		    <spen id="content">
              		   
						</spen>
							
							</p>
							
							
              		   </div>
              		   	
              		   <div class="col-lg-1 col-md-1 col-sm-1">
              		   		
              		   </div>	
              		   
              		   <div class="col-lg-9 col-md-9 col-sm-9">
              		   		
              		   </div>  
              		   <div class="col-lg-3 col-md-3 col-sm-3" style="text-align: right;">
              		   	<div id="back">
              		   		
              		   </div>
              		   <div id="back2">
              		   	<form action='/hooligan/admin/notice/delete' method='post'>
              		   	
              		   	</form>
              		   </div>  
              		   </div>
						<table class="table table-striped table-hover" style="text-align: center;">
				                    <thead>
                  					  </thead>
                   

              						  </table>
            </div>
            
            </section>
        </div>
    </div>
</body>
</html>