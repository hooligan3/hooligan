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
    
     <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script>
	var result = <%=request.getAttribute("result")%>

	$(function(){
		
		var target= $("#brand");
		var image = result.imagePath;
		var title = result.brandName;
		var content = result.brandContent;
		
		var str ="<tr><td rowspan='4' style='width:250px; height:250px;'><img src='/hooligan/brand/brandimg/"+image+"' style='width:250px; height:250px;'></td>"
			str = str+"<td class='title' style='width:544px; height:30px; font-size : 1.2em;'>브랜드 명</td></tr>";
			str = str+"<tr><td style='width:544px; height:30px; background-color : #EEE; font-size : 1.2em;'>"+title+"</td></tr>";
			str = str+"<tr><td class='title'style='width:544px; height:30px; font-size : 1.2em;' >브랜드 소개</td></tr>";
			str = str+"<tr><td style='background-color : #EEE; font-size : 1.2em;'>"+content+"</td></tr>";
			
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
                <h2>브랜드 상세정보</h2>
                <table height="250" width="800" id="brand">
                
                	
                    
                </table>
            </section>
        </div>
    </div>
</body>
</html>