<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/product_description.css" rel="stylesheet" />
 <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script>
	var result = <%=request.getAttribute("result")%>

	$(function(){
		
		var target= $("#product");
		var image = result.imagePath;
		var title = result.productName;
		var content = result.productContent;
		
		var str ="<tr><td rowspan='4' style='width:250px; height:250px;'><img src='/hooligan/brand/productimg/"+image+"' style='width:250px; height:250px;'></td>"
			str = str+"<td class='title' style='width:544px; height:30px; font-size : 1.2em;'>상품명</td></tr>";
			str = str+"<tr><td style='width:544px; height:30px; background-color : #EEE;'>"+title+"</td></tr>";
			str = str+"<tr><td class='title'style='width:544px; height:30px; font-size : 1.2em;' >상품 소개</td></tr>";
			str = str+"<tr><td style='background-color : #EEE;'>"+content+"</td></tr>";
			
			target.append(str);
		
	
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
                   <li><a href="/hooligan/admin/employee/NoActiveList">승인대기중인 개인사업자</a></li>
                    <hr/>
                    <li><a href="/hooligan/admin/employee/list">개인사업자 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/customer/list">회원 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/brand/list">브랜드 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminPointSelect.jsp">매출 내역</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/notice/list">공지사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>제품 상세정보</h2>
                <table height="250" width="800" id="product">
                
             
                </table>
            </section>
        </div>
    </div>
</body>
</html>