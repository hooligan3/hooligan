<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="no-js" lang="en">
 <!--<![endif]-->
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Edge Responsive Multipurpose Template</title>
    <meta name="description" content="">

    <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/hooligan/css/style.css">
    <link rel="stylesheet" type="text/css" href="/hooligan/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!--Start Header-->
<header id="header">
   <%@ include file="header/MainHeader.jsp" %>
 <!--end Header-->
        <div id="menu-bar">
            <div class="container">
                <div class="row">
                    <!-- Logo / Mobile Menu -->
                    <div class="col-lg-3 col-sm-3 ">
                        <div id="logo">
                            <h1><a href="/hooligan/main/index"><img src="/hooligan/images/logo.png" alt="" /></a></h1>
                        </div>
                    </div>
                   <!-- =====================메인 메뉴(우측상단) 시작============================= -->
                       <%@include file="menu/MenuSelect.jsp" %>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
        </header>
        <!--헤더 끝 -->
        <!--start wrapper-->
        <section class="wrapper">
            <section class="page_head">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12">
                            <div class="page_title">
                                <h2>로그인</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <div class="row sub_content">
                <div class="col-lg-4 col-md-4 col-sm-4">
                </div>

                <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="dividerHeading">
                        <h4><span>로그인</span></h4>
                    </div>
                    <form  action="/hooligan/customer/login"  novalidate="novalidate" method="post">
                        <div class="row">
                            <div class="form-group">
                                <input type="text" id="id" name="id" class="form-control" maxlength="100" data-msg-required="아이디를 입력해주세요" value="" placeholder="아이디">
                                <input type="password" id="password" name="password" class="form-control" maxlength="100" data-msg-required="비밀번호를 입력해주세요" value="" placeholder="비밀번호">
                            	 <div class="col-lg-4 col-md-4 col-sm-4">
                                
                                <input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="로그인" style="text-align:left;">
                                
                                </div>
                                <div class="col-lg-8 col-md-8 col-sm-8" style="text-align: right;">
                                
                                <a href="/hooligan/customer/searchId"><input type="button" class="btn btn-default btn-lg" value="아이디 찾기" style="color:white;"></a>
                                <a href="/hooligan/customer/searchPwd"><input type="button" class="btn btn-default btn-lg" value="비밀번호 찾기"style="color:white;"></a>
                                
                                </div>
                            
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                </div>
            </div>
        </section>
        <!--end wrapper-->

        <script type="text/javascript" src="/hooligan/js/jquery-1.10.2.min.js"></script>
        <script src="/hooligan/js/bootstrap.min.js"></script>
        <script src="/hooligan/js/jquery.easing.1.3.js"></script>
        <script src="/hooligan/js/retina-1.1.0.min.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.cookie.js"></script> <!-- jQuery cookie -->
        <script type="text/javascript" src="/hooligan/js/styleswitch.js"></script> <!-- Style Colors Switcher -->
        <script type="text/javascript" src="/hooligan/js/jquery.smartmenus.min.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.smartmenus.bootstrap.min.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.jcarousel.js"></script>
        <script type="text/javascript" src="/hooligan/js/jflickrfeed.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.magnific-popup.min.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.isotope.min.js"></script>
        <script type="text/javascript" src="/hooligan/js/swipe.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery-scrolltofixed-min.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.validate.js"></script>
        <script type="text/javascript" src="/hooligan/js/view.contact.js"></script>
        <script type="text/javascript" src="/hooligan/js/jquery.gmap.js"></script>

        <script src="/hooligan/js/main.js"></script>
</body>
</html>
