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
    
    <!-- <ul class="pagination" style="margin:0; margin-">
                        <li><a href="#">&laquo;</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>  
                    </ul> -->
                    
  <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	var result = <%=request.getAttribute("result")%>
	$(function(){
		var list = result.list;
		var pagination = result.pagination;
		var target= $("#notice");
		
		$.each(list, function(index, value){
			
			
			var str = "<tr><td>"+value.noticeArticleNo+"</td>";
			str = str+"<td><a href='adminView?pageNo="+pagination.pageNo+"&notice_article_no="+value.noticeArticleNo+"'>"+value.title+"</a></td>";
			str = str+ "<td>"+value.noticeDate+"</td></tr>";
			target.append(str);
		})
		
		$("#pagination").append("<ul class='pagination' style='height: 20px;'></ul>");
		var p = $("#pagination ul");
		if (pagination.prev > -1)
			p.append("<li><a href='admin?pageNo=" + pagination.prev + "'>이전으로</a></li>");
		for (var i = pagination.startPage; i <= pagination.endPage; i++)
			p.append("<li><a href='admin?pageNo=" + i + "'>" + i + "</a></li>");
		if (pagination.next > -1)
			p.append("<li><a href='admin?pageNo=" + pagination.next + "'>다음으로</a></li>");
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
                    <table>
                        <thead>
                            <tr>
                                <th style="text-align: center;">번호</th>
                                <th style="text-align: center;">제목</th>
                                <th style="text-align: center;">등록일</th>
                            </tr>
                        </thead>
                         <tbody id="notice">
                    
                   		 </tbody>
                    </table>
                    
                    <div style="margin-left: 100px;">
                    
                   <!--페이징 시작 -->
                    <br><br>
                    
                     <div id="pagination"></div>
                    
                    
                    <br><br>&nbsp;&nbsp;&nbsp;
                    </div>
                    
                    <div style="margin-left: 95px;">
                    <label for="search" class="search-label" >
                     <button class="search-button"><i class="fa fa-search"></i></button>
                      <input type="text" id="search" class="search-input" />
                     </label>
                     &nbsp;<button><a href="/hooligan/notice/register">글 쓰기</a></button>

            </div> <!--페이징 끝 -->
            </div>
            
            </section>
        </div>
    </div>
</body>
</html>