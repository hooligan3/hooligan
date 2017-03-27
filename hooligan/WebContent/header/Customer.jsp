<%@page import="com.icia.vo.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%Customer customer=(Customer)session.getAttribute("customer"); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<body class="home">
    <header id="header">
        <!-- ===============================헤더 시작================================ -->
       
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <div class="hidden-xs col-lg-7 col-sm-5 top-info">
                        
               			 <span class="hidden-sm" style="color:white"><%=customer.getCustomerName()%> 회원님</a></span>
               			  <span class="hidden-sm"style="color:white"><%=customer.getGradeName()%> 등급</a></span>
               			  <span class="hidden-sm"style="color:white">포인트:<%=customer.getPoint1()%> </a></span>
                        <span class="hidden-sm"><a href="/hooligan/customer/update" style="color:white">마이페이지</a></span>
                        <span class="hidden-sm"><a href="/hooligan/customer/logout" style="color:white">로그아웃</a></span>
                    </div>
                    <div class="col-lg-5 col-sm-7 top-info clearfix">
                        <ul>
                            <li>
                                <form class="search-bar">
                                    <label for="search" class="search-label">
                                        <button class="search-button"><i class="fa fa-search"></i></button><!-- Fix the break-row-bug
                                        --><input type="text" id="search" class="search-input" />
                                    </label>
                                </form>
                            </li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
        
</body>
</html>