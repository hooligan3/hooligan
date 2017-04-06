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
<!--Start Header-->
<header id="header">
   <%@ include file="header/MainHeader.jsp" %>
 <!--end Header-->
 <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

 
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
               <%@include file="menu/MenuSelect.jsp" %>
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
                    <ul class="jcarousel-list" id="recentP">
                      <!-- 최신상품들어가는곳 -->
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
                    <ul class="jcarousel-list" id="hitP">
                     
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
<script type="text/javascript">
$(document).ready(function() {
	var recentList = <%= request.getAttribute("recent") %>
	var hitList=<%=request.getAttribute("hit")%>
	$.each(recentList, function(index, r) {

		var tagli=$('<li class="col-sm-3 col-md-3 col-lg-3"></li>');
		var tagli2=$('<figure class="touching effect-bubba"></figure>')
		var a=$("<a href='/hooligan/product/productMain?product_no="+r.productNo+"'></a>")
		var tagImg=$('<img src="/hooligan/employees/productImg/'+r.mainImagePath+'"alt="" style="width:350px; height:200px; " class="img-responsive"/>');
		a.append(tagImg);
		tagli2.append(a);
		tagli.append(tagli2);
		$("#recentP").append(tagli);
	});
	$.each(hitList, function(index, h) {

		var tagli=$('<li class="col-sm-3 col-md-3 col-lg-3"></li>');
		var tagli2=$('<figure class="touching effect-bubba"></figure>')
		var a=$("<a href='/hooligan/product/productMain?product_no="+h.productNo+"'></a>")
		var tagImg=$('<img src="/hooligan/employees/productImg/'+h.mainImagePath+'"alt=""  style="width:350px; height:200px; " class="img-responsive"/>');
		a.append(tagImg);
		tagli2.append(a);
		tagli.append(tagli2);
		$("#hitP").append(tagli);
	});
	
});

</script>
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