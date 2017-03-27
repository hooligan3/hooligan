<%@page import="com.icia.vo.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%Customer customer=(Customer)session.getAttribute("customer"); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>유앤미 메인 페이지</title>
    <meta name="description" content="">

    <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/hooligan/css/style.css">
    <link rel="stylesheet" href="/hooligan/css/flexslider.css"/>
    <link rel="stylesheet" type="text/css" href="/hooligan/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" href="/hooligan/css/animate.css"/>

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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