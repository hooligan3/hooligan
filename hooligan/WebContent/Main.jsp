<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>
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

<body class="home">
    <header id="header">
        <!-- ===============================헤더 시작================================ -->
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <div class="hidden-xs col-lg-7 col-sm-5 top-info">
                        <span><a href="/hooligan/customer/login" style="color:white">로그인</a></span>
                        <span class="hidden-sm"><a href="/hooligan/main/selectRegister" style="color:white">회원가입</a></span>
                        <span class="hidden-sm"><a href="/hooligan/customer/update" style="color:white">마이페이지</a></span>
                        <span class="hidden-sm"><a href="#" style="color:white">로그아웃</a></span>
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
        <!--===========================헤더 끝========================================-->

        <div id="menu-bar">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-3">
                        <div id="logo">
                            <h1><a href="/hooligan/main/index"><img src="/hooligan/images/logo.png"/></a></h1>
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
                                <li class="active"><a href="product.html">브랜드</a>

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
                                </li>
                                 <li><a href="#">게시판</a>
                                    <ul class="dropdown-menu">
                                    
                                    <li><a href="#"> 공지사항</a>
                                    </li>
                                    
                                    <li><a href="#">문의사항</a>
                                    </li>
                                    
                                    <li><a href="FreeBoardList.jsp">자유게시판</a>
                                    </li>
                                    </ul>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->


        <!--=========================화면 가운데 슬라이드 시작=======================-->
        <div class="slider_block">
            <div class="flexslider top_slider">
                <ul class="slides">
                    <li class="slide1">
                        <div class="container">
                            <div class="flex_caption1">

                                <p class="slide-heading FromTop">헛개수!!!</p><br/>

                                <p class="sub-line FromBottom">그 다음날 갈증해소!!!헛!개!수!</p><br/>

                                <a href="product.html" class="slider-read FromLeft">구매하기</a>
                            </div>
                            <div class="flex_caption2 FromRight"><img src="/hooligan/images/헛개수.png" alt="Alternate Text" /></div>
                        </div>
                    </li>

                    <li class="slide2">
                        <div class="container">
                            <div class="slide flex_caption1">
                                <p class="slide-heading FromTop">i7 7세대 하이엔드 PC</p><br/>

                                <p class="sub-line FromRight">50%세일 2,990,000원</p><br/>

                                <a href="product.html" class="slider-read FromLeft">구매하기</a>

                            </div>
                            <div class="flex_caption2 FromBottom"><img src="/hooligan/images/컴퓨터.png" alt="Alternate Text" /></div>
                        </div>
                    </li>
                    <li class="slide3">
                        <div class="container">
                            <div class="slide flex_caption1">
                                <p class="slide-heading FromTop">옵티머스 프라임</p><br/>

                                <p class="sub-line FromRight">오토봇 대장 팔아요~</p><br/>

                                <a href="product.html" class="slider-read FromLeft">구매하기</a>

                            </div>
                            <div class="flex_caption2 FromRight"><img src="/hooligan/images/옵티머스.png" alt="Alternate Text" /></div>
                        </div>
                    </li>
            </div>
        </div>
    </header>
    <!--=========================화면 가운데 슬라이드 끝==================================-->





<section class="wrapper">

    <!--=====================최신등록 상품 시작======================-->

    <section class="latest_work">
        <div class="container">
            <div class="row sub_content">
                <div class="carousel-intro">
                    <div class="col-md-12">
                        <div class="dividerHeading">
                            <h4><span>최신등록 상품</span></h4>
                        </div>
                        <div class="carousel-navi">
                            <div id="work-prev" class="arrow-left jcarousel-prev"><i class="fa fa-angle-left"></i></div>
                            <div id="work-next" class="arrow-right jcarousel-next"><i class="fa fa-angle-right"></i></div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>

                <div class="jcarousel recent-work-jc">
                    <ul class="jcarousel-list">
                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_1.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_1.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_2.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_2.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_3.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_3.png" class="fa fa-search mfp-image"></a>
                                </div>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_4.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_4.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_5.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_5.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_6.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_6.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_7.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_7.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_8.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_8.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <!--=====================최신등록 상품 끝======================-->


    <!--=====================인기상품 시작========================-->
    <section class="latest_work">
        <div class="container">
            <div class="row sub_content">
                <div class="carousel-intro">
                    <div class="col-md-12">
                        <div class="dividerHeading">
                            <h4><span>인기 상품</span></h4>
                        </div>
                        <div class="carousel-navi">
                            <div id="work-prev" class="arrow-left jcarousel-prev"><i class="fa fa-angle-left"></i></div>
                            <div id="work-next" class="arrow-right jcarousel-next"><i class="fa fa-angle-right"></i></div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>

                <div class="jcarousel recent-work-jc">
                    <ul class="jcarousel-list">
                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_1.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_1.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_2.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_2.png" class="fa fa-search mfp-image"></a>
                                </div>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_3.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_3.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_4.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_4.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_5.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_5.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_6.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_6.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="/hooligan/touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_7.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_7.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="/hooligan/images/portfolio/portfolio_8.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="/hooligan/portfolio_single.html" class="fa fa-link"></a>
                                    <a href="/hooligan/images/portfolio/portfolio_8.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
</section>
    <!--=====================인기상품 끝========================-->






<!--
    밑에 꺼는 정확하게 어떤건지 모르니까 만지지 마시오...
-->

<!-- Parallax with Testimonial -->
    <section class="parallax parallax-1">
        <div class="container">
            <!--<h2 class="center">Testimonials</h2>-->
<!-- end : Parallax with Testimonial -->

<script type="text/javascript" src="/hooligan/js/jquery-1.10.2.min.js"></script>
<script src="/hooligan/js/bootstrap.min.js"></script>
<script src="/hooligan/js/jquery.easing.1.3.js"></script>
<script src="/hooligan/js/retina-1.1.0.min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.cookie.js"></script> <!-- jQuery cookie -->
<script type="text/javascript" src="/hooligan/js/styleswitch.js"></script> <!-- Style Colors Switcher -->
<!--
<script src="js/jquery.fractionslider.js" type="text/javascript" charset="utf-8"></script>
-->
<script type="text/javascript" src="/hooligan/js/jquery.smartmenus.min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.smartmenus.bootstrap.min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.jcarousel.js"></script>
<script type="text/javascript" src="/hooligan/js/jflickrfeed.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.magnific-popup.min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.isotope.min.js"></script>
<script type="text/javascript" src="/hooligan/js/swipe.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery-scrolltofixed-min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery-scrolltofixed-min.js"></script>
<script type="text/javascript" src="/hooligan/js/jquery.flexslider-min.js"></script>

<script src="/hooligan/js/main.js"></script>
    <script>
        $('.flexslider.top_slider').flexslider({
            animation: "fade",
            controlNav: false,
            directionNav: true,
            prevText: "&larr;",
            nextText: "&rarr;"
        });
    </script>

    <!-- WARNING: Wow.js doesn't work in IE 9 or less -->
    <!--[if gte IE 9 | !IE ]><!-->
        <script type="text/javascript" src="/hooligan/js/wow.min.js"></script>
        <script>
            // WOW Animation
            new WOW().init();
        </script>
    <![endif]-->

</body>
</html>