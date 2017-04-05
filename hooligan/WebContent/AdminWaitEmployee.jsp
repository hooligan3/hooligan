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
	var result = <%=request.getAttribute("result")%>
	var pagination = result.pagination;
	var pageNo = pagination.pageNo;
	$(function(){
		
		var list = result.list;
		var pagination = result.pagination;
		var pageNo = pagination.pageNo;
		var target= $("#wait");
		$.each(list, function(index,value){
			var str = "<tr><td>"+value.ename+"</td>";
			str = str+"<td>"+value.employeeId+"</td>";
			str = str+"<td>"+value.tell+"</td>";
			str = str+"<td>"+value.ssn1+"-"+value.ssn2+"</td>";
			str = str+"<td>"+value.email+"</td>";
			str = str+"<td>"+value.postalNo+"</td>";
			str = str+"<td>"+value.address+"</td>";
			str = str+"<td><form action='/hooligan/admin/employee/Activate' method='post'><input type='hidden' name='employeeId' value='"+value.employeeId+"'><input type='submit' value='승인' style='color : white; width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'></form><form action='/hooligan/admin/employee/DeleteNoActive' method='post'><input type='hidden' name='employeeId' value='"+value.employeeId+"'><input type='submit' value='삭제' style='color : white; width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'></form></td><td><form action='/hooligan/admin/employee/brnadView' method='get'><input type='hidden' name='brand_no' value='"+value.brandNo+"'><input type='submit' value='브랜드정보' style='color : white; width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'></form><form action='/hooligan/admin/employee/brandProductView' method='get'><input type='hidden' name='brand_no' value='"+value.brandNo+"'><input type='submit' value='상품' style='color : white; width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'></form></td></tr>";
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
                <h2>제휴 신청중인 사업자</h2>
                <div class="article">   
                
                
                    <table>
                        <thead>
                            <tr>
                                <th>이름</th>
                                <th>아이디</th>
                                <th>연락처</th>
                                <th>주민번호</th>
                     			<th>이메일</th>
                                <th>우편번호</th>
                                <th>주소</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        
                        <tbody id="wait">
                        
                        
                       
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