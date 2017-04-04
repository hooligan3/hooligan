<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Portfolio Single - Edge Responsive Multipurpose Template</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

    <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css"/>
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
    <style>
    	th{
    	text-align: center;
    	}
    </style>
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
                 <div  class="col-lg-3 col-sm-3 ">
                    <div id="logo">
                        <h1><a href="index.html"><img src="images/logo.png" alt=""/></a></h1>
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
                                <li ><a href="product.html">브랜드</a>

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
                                    
                                    <li><a href="/hooligan/notice/list"> 공지사항</a> </li>
                                    
                                    <li><a href="/hooligan/FAQMain.jsp">문의사항</a> </li>
                                    
                                    <li><a href="/hooligan/free/list">자유게시판</a></li>
                                    </li>
                                    </ul>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </header>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
<!--End Header-->
	
	<!--start wrapper-->
	<section class="wrapper">
    <section class="page_head">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <nav id="breadcrumbs">
                        <ul>

                            <li><a href="/hooligan/index.html">Home</a></li>
                            <li>상품평가</li>
                        </ul>
                    </nav>

                    <div class="page_title">
                        <h2>상품 평가보기</h2>
                    </div>
                    
                </div>
                
            </div>
            
        </div>
        
    </section>
    
    	<br><br>
    	<div class="col-lg-12 col-md-12 col-sm-12">
		<table class="table table-striped table-hover" style="text-align: center; margin-left: 50px; margin-right: 50px;" >
                    <thead >
                    <tr >
										<th>고객 아이디</th>
										<th>평가 내용</th>
										<th>평가 등록일</th>
										<th>점수</th>
									</tr>
                    </thead>
                    <tbody style="text-align: center;">
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
									</tr>
                    <tr>
                       					 <td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
										</tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    <tr>
										<td>qhrals8</td>
										<td>배송이 빠릅니다. 물건이 보통입니다</td>
										<td>2015/11/11</td>
										<td>10</td>
                    </tr>
                    </tbody>
	
                </table>
                  <div class="col-lg-10 col-md-10 col-sm-10">
                  </div>
                   <div class="col-lg-2 col-md-2 col-sm-2">
                   <!-- 제품글 등록하기로 이동하기 버튼 -->
                 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                 <a href="/hooligan/ProductEvaluation.jsp"><input type="button" data-loading-text="Loading..."  style="color:white; "class="btn btn-default btn-lg" value="상품평 글 쓰기"></a>
                </div>
                
                    <!--페이징 시작 -->
               <div class="col-sm-12 text-center">
                     <br><ul class="pagination">
                        <li><a href="#">&laquo;</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>
                </div>
</div>
</section>
            <!--페이징 끝 -->
            
                <!-- 최신 상품 -->
					<section class="content portfolio_single">
				<div class="container">
					<div class="row sub_content">
					
															
                <div class="carousel-intro">
                    <div class="col-md-12">
                        <div class="dividerHeading">
                            <h4><span>최신 상품</span></h4>
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
                                <img src="images/portfolio/portfolio_1.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_1.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_2.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_2.png" class="fa fa-search mfp-image"></a>
                                </div>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_3.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_3.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_4.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_4.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_5.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_5.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_6.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_6.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_7.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_7.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>

                        <!-- Recent Work Item -->
                        <li class="col-sm-3 col-md-3 col-lg-3">
                            <figure class="touching effect-bubba">
                                <img src="images/portfolio/portfolio_8.png" alt="" class="img-responsive">

                                <div class="option">
                                    <a href="portfolio_single.html" class="fa fa-link"></a>
                                    <a href="images/portfolio/portfolio_8.png" class="fa fa-search mfp-image"></a>
                                </div>
                            </figure>
                        </li>
                    </ul>
        </div>
						
				
	
	
	
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


	<script type="text/javascript">
		$(document).ready(function() {
			$.fn.carousel = function(op) {
				var op, ui = {};
				op = $.extend({
					speed: 500,
					autoChange: false,
					interval: 5000
				}, op);
				ui.carousel = this;
				ui.items    = ui.carousel.find('.carousel-item');
				ui.itemsLen = ui.items.length;

				// CREATE CONTROLS
				ui.ctrl 	= $('<div />', {'class': 'carousel-control'});
				ui.prev 	= $('<div />', {'class': 'carousel-prev'});
				ui.next 	= $('<div />', {'class': 'carousel-next'});
				ui.pagList  = $('<ul />', {'class': 'carousel-pagination'});
				ui.pagItem  = $('<li></li>');
				for (var i = 0; i < ui.itemsLen; i++) {
					ui.pagItem.clone().appendTo(ui.pagList);
				}
				ui.prev.appendTo(ui.ctrl);
				ui.next.appendTo(ui.ctrl);
				ui.pagList.appendTo(ui.ctrl);
				ui.ctrl.appendTo(ui.carousel);
				ui.carousel.find('.carousel-pagination li').eq(0).addClass('active');
				ui.carousel.find('.carousel-item').each(function() {
					$(this).hide();
				});
				ui.carousel.find('.carousel-item').eq(0).show().addClass('active');
				
				
				// CHANGE ITEM
				var changeImage = function(direction, context) {
					var current = ui.carousel.find('.carousel-item.active');

					if (direction == 'index') {
						if(current.index() === context.index())
							return false;

						context.addClass('active').siblings().removeClass('active');

						ui.items.eq(context.index()).addClass('current').fadeIn(op.speed, function() {
							current.removeClass('active').hide();
							$(this).addClass('active').removeClass('current');
						});
					} 

					if (direction == 'prev') {
						if (current.index() == 0) {
							ui.carousel.find('.carousel-item:last').addClass('current').fadeIn(op.speed, function() {
								current.removeClass('active').hide();
								$(this).addClass('active').removeClass('current');
							});
						}
						else {
							current.prev().addClass('current').fadeIn(op.speed, function() {
								current.removeClass('active').hide();
								$(this).addClass('active').removeClass('current');
							});
						}
					}

					if (direction == undefined) {
						if (current.index() == ui.itemsLen - 1) {
							ui.carousel.find('.carousel-item:first').addClass('current').fadeIn(300, function() {
								current.removeClass('active').hide();
								$(this).addClass('active').removeClass('current');
							});
						}
						else {
							current.next().addClass('current').fadeIn(300, function() {
								current.removeClass('active').hide();
								$(this).addClass('active').removeClass('current');
							});
						}
					}
					ui.carousel.find('.carousel-pagination li').eq( ui.carousel.find('.carousel-item.current').index() ).addClass('active').siblings().removeClass('active');
				};

				ui.carousel
					.on('click', 'li', function() {
						changeImage('index', $(this));
					})
					.on('click', '.carousel-prev', function() {
						changeImage('prev');
					})
					.on('click', '.carousel-next', function() {
						changeImage();
					});
				
				// AUTO CHANGE
				if (op.autoChange) {
					var changeInterval = setInterval(changeImage, op.interval);
					ui.carousel
						.on('mouseenter', function() {
							clearInterval(changeInterval);
						})
						.on('mouseleave', function() {
							changeInterval = setInterval(changeImage, op.interval);
						});
				}
				return this;
			};
			
			$('.porDetCarousel').each(function() {
				$(this).carousel({
					autoChange: true
				});
			});
		});
	</script>
	<script src="/hooligan/js/main.js"></script>
	
	<!-- Start Style Switcher -->
	<div class="switcher"></div>
	<!-- End Style Switcher -->
</body>
</html>
ml>