<%@page import="com.icia.vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>
<%Customer customer=(Customer)session.getAttribute("customer"); %>
<%Product product=(Product)request.getAttribute("result");%>
<%String order_size=(String)request.getAttribute("size"); %>
<%int size=Integer.parseInt(order_size); %>
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
</head>
<body>
<!--Start Header-->
<header id="header">
   <%@ include file="header/MainHeader.jsp" %>
 <!--end Header-->   
 
 <!--메뉴바 시작-->
    <div id="menu-bar">
        <div class="container">
            <div class="row">
                <!-- Logo / Mobile Menu -->
                 <div  class="col-lg-3 col-sm-3 ">
                    <div id="logo">
                        <h1><a href="index.html"><img src="/hooligan/images/logo.png" alt=""/></a></h1>
                    </div>
                </div>
                <!-- 메뉴바 시작2
================================================== -->
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


                            <li><a href="#" ><span class="data-hover" data-hover="brand">브랜드</span></a>
                               
                            </li>

                            <li ><a href="#"><span class="data-hover" data-hover="dress"> 의류</span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">점퍼</a>
                                        
                                    </li>
                                    <li>
                                        <a href="#">코트</a>
                                       
                                    </li>

                                    <li class="active">
                                        <a href="#">니트</a>
                                        
                                    </li>
                                     <li>
                                        <a href="#">정장</a>
                                       
                                    </li>
                                     <li>
                                        <a href="#">티셔츠</a>
                                       
                                    </li>
                                     <li>
                                        <a href="#">팬츠</a>
                                       
                                    </li>
                                </ul>
                            </li>

                            <li><a href="#"><span class="data-hover" data-hover="hand">수제품</span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">악세사리</a>
                                        <ul class="dropdown-menu">
                                            <li><a href="#">케이스</a></li>
                                            <li><a href="#">브로치</a></li>
                                        </ul>
                                    </li>
                                    <li class="active">
                                        <a href="#">잡화</a>
                                    </li>
                                    <li>
                                        <a href="#">가방</a>
                                    </li>
                                </ul>
                            </li>

                            <li><a href="#"> <span class="data-hover" data-hover="contact">식품</span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">과일</a></li>
                                    <li><a href="#">견과</a></li>
                                    <li><a href="#">음료</a></li>
                                    <li class="active"><a href="#" >과자</a></li>
                                    <li><a href="#">유제품</a></li>
                                    <li><a href="#">냉동식품</a></li>
                                    <li><a href="#">통조림</a></li>
                                    
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<!--End Header-->
	
	<!--start wrapper-->
	
		
		
                <section class="wrapper">
        <section class="page_head">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <nav id="breadcrumbs">
                            <ul>

                                <li><a href="index.html">Home</a></li>
                                <li>주문하기</li>
                            </ul>
                        </nav>

                        <div class="page_title">
                            <h2>주문하기</h2>
                        </div>
                    </div>
                </div>
            </div>
        </section>

		<section class="content portfolio_single">
			<div class="container">
				<div class="row sub_content">
					<div class="col-lg-6 col-md-6 col-sm-6">
						<div class="project_description">
							<div class="widget_title">
								<h4><span>주문 상품 정보</span></h4>
							</div>
								<table class="table table-striped table-hover">
                    <thead>
                    <tr>
										<th>상품명</th>
										<th>수량</th>
										<th>총 금액</th>
									</tr>
                    </thead>
                    <tbody>
                    <tr>
										<td><%=product.getProductName() %></td>
										<td><%=size%></td>
										<td><%=product.getPrice()*size%></td>
								       
									</tr>
                    <tr>
                       
                    </tbody>
                    
                    
                    
                    
                    
                    
                    
                </table>
							</ul>
						</div>
						<div class="project_details">
							<div class="widget_title">
								<h4><span>배송지 확인</span></h4>
							</div>
							<ul class="details">
								<li><span>수령인 </span><%=customer.getCustomerName()%></li>
								<li><span>우편 번호 </span> <%=customer.getPostalNo() %></li>
								<li><span>상세 주소</span> <%=customer.getAddress() %></li>
								<li><span>연락처 </span> <%=customer.getTell() %></li>
							</ul>
						</div>
					</div>
					
					<div class="col-lg-6 col-md-6 col-sm-6">
						<!--Project Details Page-->
						<br><br>
						<div class="porDetCarousel">
							<div class="carousel-content">
								<img class="carousel-item"  src="/hooligan/employees/productImg/<%=product.getMainImagePath() %>" alt="">
									<img class="carousel-item"  src="/hooligan/employees/productImg/<%=product.getDetailImagePath() %>" alt="">
							</div>
						<div class="carousel-control"><div class="carousel-prev"></div><div class="carousel-next"></div><ul class="carousel-pagination"><li class=""></li><li class=""></li><li class="active"></li></ul></div></div>
					</div>
					
				</div>
				
				
				<div class="col-lg-1 col-md-1 col-sm-1"></div>
				<div class="col-lg-6 col-md-6 col-sm-6">
                <input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="쇼핑 계속하기"> &nbsp; &nbsp;
                <input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="배송지 수정"> &nbsp; &nbsp;
                <input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="주문하기">
						
				</div>
				<div class="col-lg-5 col-md-5 col-sm-5"></div>
				
				
				<br><br><br><br>
				                    </div>
				
			</div>
		</section>
	</section>
	
	
	
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
