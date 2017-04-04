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
	<!-- End Header -->
        <div id="menu-bar">
            <div class="container">
                <div class="row">
                    <!-- Logo / Mobile Menu -->
                    <div class="col-lg-3 col-sm-3 ">
                        <div id="logo">
                            <h1><a href="index.html"><img src="/hooligan/images/logo.png" alt="" /></a></h1>
                        </div>
                    </div>
                     <!-- =====================메인 메뉴(우측상단) 시작============================= -->
                    <div class="col-lg-9 col-sm-9 navbar navbar-default navbar-static-top container" role="navigation">
                        <!--  <div class="container">-->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li><a href="product.html">브랜드</a>

                                </li>

                                <li><a href="#">의류</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="elements.html">점퍼</a></li>
                                        <li><a href="columns.html"> 코트</a></li>
                                        <li><a href="typography.html">니트</a></li>
                                        <li><a href="pricing-tables.html">정장</a></li>
                                        <li><a href="icons.html">티셔츠</a></li>
                                        <li><a href="icons.html">팬츠</a></li>
                                    </ul>
                                </li>

                                <li><a href="#" >수제품</a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="about.html">악세사라</a>
                                            <ul class="dropdown-menu">
                                                <li><a href="about.html">케이스</a></li>
                                                <li><a href="about-2.html">브로치</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="services.html">잡화</a></li>
                                        <li><a href="faq.html">가방</a></li>
     
                                    </ul>
                                </li>

                                <li><a href="#">식품</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">과일</a>
       
                                        </li>
                                        <li>
                                            <a href="portfolio_masonry_3.html">견과</a>
 
                                        </li>

                                        <li>
                                            <a href="portfolio_single.html">음료</a>

                                        </li>
                                         <li>
                                            <a href="portfolio_single.html">과자</a>

                                        </li>
                                          <li>
                                            <a href="portfolio_single.html">유제품</a>
             
                                        </li>
                                        <li>
                                            <a href="portfolio_single.html">냉동식품</a>
               
                                        </li>
                                        <li>
                                            <a href="portfolio_single.html">통조림</a>
                           
                                        </li>
                                        
                                        
                                    </ul>
                                     <li><a href="#">게시판</a>
                                    <ul class="dropdown-menu">
                                         <li><a href="/hooligan/main/freeBoardList">자유 게시판</a></li>
                                        <li><a href="/hooligan/"> 문의 게시판</a></li> <!-- 아직안만듬 -->
                                        <li><a href="/hooligan/main/noticeBoardList">공지 사항</a></li>
            
                                </li>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
        <!--start wrapper-->
        <section class="wrapper">
            <section class="page_head">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12">
                            <div class="page_title">
                                <h2>회원 비밀번호 찾기</h2>
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
                        <h4><span>비밀번호 찾기</span></h4>
                        
                    </div>
                    <form id="contactForm" action="" novalidate="novalidate" method="post">
                        <div class="row">
                            <div class="form-group">
                            <div class="col-lg-12 col-md-12 col-sm-12">
                             <input type="text" id="id" name="id" class="form-control" maxlength="100" data-msg-required="회원 아이디" value="" placeholder="회원 아이디">
                            </div>
                            	<div class="col-lg-6 col-md-6 col-sm-6">
                            		 <input type="text" id="id" name="id" class="form-control" maxlength="100" data-msg-required="주민등록번호 앞자리" value="" placeholder="주민번호 앞자리-">
                            	</div>
                            	
                            	<div class="col-lg-6 col-md-6 col-sm-6">
                            		 <input type="password" id="password" name="password" class="form-control" maxlength="100" data-msg-required="주민등록번호 뒷자리" value="" placeholder="-주민번호 뒷자리">
                            	</div>
                               
                               
                                
                                
                                 <div class="col-lg-4 col-md-4 col-sm-4">
                                <br>
                               <input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="비밀번호 찾기" style="text-align:left;">
                                
                                <searchId.html/div>
                                
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
