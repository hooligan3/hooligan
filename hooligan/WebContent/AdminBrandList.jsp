<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/brand_list.css" rel="stylesheet" />
    
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
		
		var list = result.list;
		var pagination = result.pagination;
		var pageNo = pagination.pageNo;
		var target= $("#brand");
		
		$.each(list, function(index,value){
			var str = "<tr><td>"+value.brandNo+"</td>";
			str = str+"<td>"+value.brandName+"</td>";
			str = str+"<td><form action='/hooligan/admin/employee/brnadView' method='get'><input type='hidden' name='brand_no' value='"+value.brandNo+"'><input type='submit' value='상세보기'></form></td>";
			str = str+"<td><form action='/hooligan/admin/employee/brandProductView' method='get'><input type='hidden' name='brand_no' value='"+value.brandNo+"'><input type='submit' value='상품보기'></form></tr>";
			target.append(str);
		})
		$("#pagination").append("<ul class='pagination' style='height: 20px;' ></ul>");
		var p = $("#pagination ul");
		if (pagination.prev > -1)
			p.append("<li><a href='list?pageNo=" + pagination.prev + "'>이전으로</a></li>");
		for (var i = pagination.startPage; i <= pagination.endPage; i++)
			p.append("<li><a href='list?pageNo=" + i + "'>" + i + "</a></li>");
		if (pagination.next > -1)
			p.append("<li><a href='list?pageNo=" + pagination.next + "'>다음으로</a></li>");
	})
</script>
</head>
<body>
    <div id="wrap">
        <header id="header">
            <h1><a href="manager_index.html"><img class="main_logo_img" src="images/logo.png" alt="로고" /></a></h1>
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
                <h2>브랜드조회</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th>브랜드 번호</th>
                                <th>브랜드명 </th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody id="brand">
                        
                        </tbody>
                    </table>
                      <!--페이징 시작 -->
                    <div id="pagination" style="text-align: center;"></div>
                    <br><br>&nbsp;&nbsp;&nbsp;
                    
            </div>
                </div>
                </div>
            </section>
        </div>
    </div>
</body>
</html>