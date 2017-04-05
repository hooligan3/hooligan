<%@page import="com.icia.vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Product p = (Product) request.getAttribute("result");
	double result = (double) p.getPresentSize() / p.getMaximumSize();
	double result2 = result * 100;
	int result3 = (int) result2;
	String orderState=null;
	if(p.getOrderState()==0) orderState="주문중";
	else if(p.getOrderState()==1) orderState="주문성공";
	else if(p.getOrderState()==2) orderState="주문완료";
	else if(p.getOrderState()==3) orderState="주문실패";
	
%>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Portfolio Single - Edge Responsive Multipurpose Template</title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- CSS FILES -->
<link rel="stylesheet" href="/hooligan/css/bootstrap.min.css" />
<link rel="stylesheet" href="/hooligan/css/style.css">
<link rel="stylesheet" type="text/css" href="/hooligan/css/style.css"
	media="screen" data-name="skins">
<link rel="stylesheet" href="/hooligan/css/layout/wide.css"
	data-name="layout">

<link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css"
	media="screen" />
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    .order_status{
    	font-size:40px;
    	height:50px;
    	line-height:50px;
    	text-align:center;
    	color:white;
    	background:#694fa8;
    	border-radius: 5px;
    	margin-bottom:30px;
    	
    }
    </style>
</head>
<body>
	<!--Start Header-->
	<!--Start Header-->
	<header id="header">
		<%@ include file="header/MainHeader.jsp"%>
		<!--end Header-->
		<div id="menu-bar">
			<div class="container">
				<div class="row">
					<!-- Logo / Mobile Menu -->
					<div class="col-lg-3 col-sm-3 ">
						<div id="logo">
							<h1>
								<a href="/hooligan/main/index"><img src="/hooligan/images/logo.png" /></a>
							</h1>
						</div>
					</div>
					<!-- =====================메인 메뉴(우측상단) 시작============================= -->
					<div
						class="col-lg-9 col-sm-9 navbar navbar-default navbar-static-top container"
						role="navigation">
						<!--  <div class="container">-->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
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
									</ul></li>
								


										<li><a href="#">수제품</a>
											<ul class="dropdown-menu">
												<li><a href="about.html">악세사라</a>
													<ul class="dropdown-menu">
														<li><a href="about.html">케이스</a></li>
														<li><a href="about-2.html">브로치</a></li>
													</ul></li>
												<li><a href="services.html">잡화</a></li>
												<li><a href="faq.html">가방</a></li></ul></li>

										
								<li><a href="#">식품</a>
									<ul class="dropdown-menu">
										<li><a href="#">과일</a></li>
												<li><a href="#">견과</a></li>
												<li><a href="#">음료</a></li>
												<li><a href="#">과자</a></li>
												<li><a href="#">유제품</a></li>
												<li><a href="#">냉동식품</a></li>
												<li><a href="#">통조림</a></li>
											</ul></li>
											
											<li><a href="#">게시판</a>
											<ul class="dropdown-menu">

											<li><a href="/hooligan/notice/list"> 공지사항</a></li>

											<li><a href="/hooligan/FAQMain.jsp">문의사항</a></li>

											<li><a href="/hooligan/free/list">자유게시판</a></li></ul></li>
											
											
									</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!--End Header-->



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

								<li><a href="index.html">Home</a></li>
								<li>상품</li>
							</ul>
						</nav>

						<div class="page_title">
							<h2>상품 정보 보기</h2>
						</div>
					</div>
				</div>
			</div>
		</section>

		<section class="content portfolio_single">
			<div class="container">
				<div class="row sub_content">
					<div class="col-lg-8 col-md-8 col-sm-8">
						<!--Project Details Page-->
						<div class="porDetCarousel">
							<div class="carousel-content">
								<img class="carousel-item"
									src="/hooligan/employees/productImg/<%=p.getMainImagePath()%>"
									alt=""> <img class="carousel-item"
									src="/hooligan/employees/productImg/<%=p.getDetailImagePath()%>"
									alt="">
							</div>
						</div>
					</div>


					<div class="col-lg-4 col-md-4 col-sm-4">
						<div class="project_description">
							<div class="widget_title">
								<h2 id="productN">
									<span>상품명: <%=p.getProductName()%></span>
							</div>

							<p>상품 내용</p>
							<p style="height: 150px;" id="productC"><%=p.getProductContent()%></p>
							<p class="order_status"><%=orderState%></p>
							<p>
								상품 가격<span></span> :<%=p.getPrice()%>원
							</p>
							<p>
								마감일<span></span> :<%=p.getClosingDate()%></p>
							<p>
								등록일<span></span> :<%=p.getRegistrationDate()%></p>

							<p>
								최대수량<span></span> :<%=p.getMaximumSize()%></p>
							<p>
								최소주문가능수<span></span> :<%=p.getMinimumSize()%></p>
							<p>
								현재주문수량<span></span> :<%=p.getPresentSize()%></p>
							<ul class="progress-skill-bar mrg-0">

								<li><span class="lable" id="productB"><%=result3%>%</span>
									<div class="progress_skill">
										<div data-height="100" role="progressbar"
											data-value=<%=result3%> class="bar"
											style="width:<%=result3%>%; height: 100%;">현재 주문수</div>
									</div> <br>
									<p></p> <!-- 즐겨찾기 주문하기 상품평가 상세보기 --> <br>
									<div>
										<div>
											<a href="#"><input type="button"
												data-loading-text="Loading..." style="color: white;"
												class="btn btn-default btn-lg" value="즐겨찾기"></a> <a
												id="hool"
												href="/hooligan/product/productOrder?product_no=<%=p.getProductNo()%>&order_size=order_size.val()"><input
												type="button" data-loading-text="Loading..."
												style="color: white;" class="btn btn-default btn-lg"
												value="주문하기"></a> <a
												href="/hooligan/product/evalutionList?product_no=<%=p.getProductNo()%>"><input
												type="button" data-loading-text="Loading..."
												style="color: white;" class="btn btn-default btn-lg"
												value="상품평가"></a>

											<!-- 즐겨찾기 주문하기 상품평가 상세보기 -->
										</div>
									</div></li>
							</ul>
						</div>
					</div>
					</form>







				</div>


				<div class="row sub_content">
					<div class="carousel-intro">
						<div class="col-md-12">
							<div class="dividerHeading">



								<script type="text/javascript"
									src="/hooligan/js/jquery-1.10.2.min.js"></script>
								<script src="/hooligan/js/bootstrap.min.js"></script>
								<script src="/hooligan/js/jquery.easing.1.3.js"></script>
								<script src="/hooligan/js/retina-1.1.0.min.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery.cookie.js"></script>
								<!-- jQuery cookie -->
								<script type="text/javascript" src="/hooligan/js/styleswitch.js"></script>
								<!-- Style Colors Switcher -->
								<script type="text/javascript"
									src="/hooligan/js/jquery.smartmenus.min.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery.smartmenus.bootstrap.min.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery.jcarousel.js"></script>
								<script type="text/javascript" src="/hooligan/js/jflickrfeed.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery.magnific-popup.min.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery.isotope.min.js"></script>
								<script type="text/javascript" src="/hooligan/js/swipe.js"></script>
								<script type="text/javascript"
									src="/hooligan/js/jquery-scrolltofixed-min.js"></script>


								<script type="text/javascript">
									$(document)
											.ready(
													function() {
														$.fn.carousel = function(
																op) {
															var op, ui = {};
															op = $
																	.extend(
																			{
																				speed : 500,
																				autoChange : false,
																				interval : 5000
																			},
																			op);
															ui.carousel = this;
															ui.items = ui.carousel
																	.find('.carousel-item');
															ui.itemsLen = ui.items.length;

															// CREATE CONTROLS
															ui.ctrl = $(
																	'<div />',
																	{
																		'class' : 'carousel-control'
																	});
															ui.prev = $(
																	'<div />',
																	{
																		'class' : 'carousel-prev'
																	});
															ui.next = $(
																	'<div />',
																	{
																		'class' : 'carousel-next'
																	});
															ui.pagList = $(
																	'<ul />',
																	{
																		'class' : 'carousel-pagination'
																	});
															ui.pagItem = $('<li></li>');
															for (var i = 0; i < ui.itemsLen; i++) {
																ui.pagItem
																		.clone()
																		.appendTo(
																				ui.pagList);
															}
															ui.prev
																	.appendTo(ui.ctrl);
															ui.next
																	.appendTo(ui.ctrl);
															ui.pagList
																	.appendTo(ui.ctrl);
															ui.ctrl
																	.appendTo(ui.carousel);
															ui.carousel
																	.find(
																			'.carousel-pagination li')
																	.eq(0)
																	.addClass(
																			'active');
															ui.carousel
																	.find(
																			'.carousel-item')
																	.each(
																			function() {
																				$(
																						this)
																						.hide();
																			});
															ui.carousel
																	.find(
																			'.carousel-item')
																	.eq(0)
																	.show()
																	.addClass(
																			'active');

															// CHANGE ITEM

															var changeImage = function(
																	direction,
																	context) {
																var current = ui.carousel
																		.find('.carousel-item.active');

																if (direction == 'index') {
																	if (current
																			.index() === context
																			.index())
																		return false;

																	context
																			.addClass(
																					'active')
																			.siblings()
																			.removeClass(
																					'active');

																	ui.items
																			.eq(
																					context
																							.index())
																			.addClass(
																					'current')
																			.fadeIn(
																					op.speed,
																					function() {
																						current
																								.removeClass(
																										'active')
																								.hide();
																						$(
																								this)
																								.addClass(
																										'active')
																								.removeClass(
																										'current');
																					});
																}

																if (direction == 'prev') {
																	if (current
																			.index() == 0) {
																		ui.carousel
																				.find(
																						'.carousel-item:last')
																				.addClass(
																						'current')
																				.fadeIn(
																						op.speed,
																						function() {
																							current
																									.removeClass(
																											'active')
																									.hide();
																							$(
																									this)
																									.addClass(
																											'active')
																									.removeClass(
																											'current');
																						});
																	} else {
																		current
																				.prev()
																				.addClass(
																						'current')
																				.fadeIn(
																						op.speed,
																						function() {
																							current
																									.removeClass(
																											'active')
																									.hide();
																							$(
																									this)
																									.addClass(
																											'active')
																									.removeClass(
																											'current');
																						});
																	}
																}

																if (direction == undefined) {
																	if (current
																			.index() == ui.itemsLen - 1) {
																		ui.carousel
																				.find(
																						'.carousel-item:first')
																				.addClass(
																						'current')
																				.fadeIn(
																						300,
																						function() {
																							current
																									.removeClass(
																											'active')
																									.hide();
																							$(
																									this)
																									.addClass(
																											'active')
																									.removeClass(
																											'current');
																						});
																	} else {
																		current
																				.next()
																				.addClass(
																						'current')
																				.fadeIn(
																						300,
																						function() {
																							current
																									.removeClass(
																											'active')
																									.hide();
																							$(
																									this)
																									.addClass(
																											'active')
																									.removeClass(
																											'current');
																						});
																	}
																}
																ui.carousel
																		.find(
																				'.carousel-pagination li')
																		.eq(
																				ui.carousel
																						.find(
																								'.carousel-item.current')
																						.index())
																		.addClass(
																				'active')
																		.siblings()
																		.removeClass(
																				'active');
															};

															ui.carousel
																	.on(
																			'click',
																			'li',
																			function() {
																				changeImage(
																						'index',
																						$(this));
																			})
																	.on(
																			'click',
																			'.carousel-prev',
																			function() {
																				changeImage('prev');
																			})
																	.on(
																			'click',
																			'.carousel-next',
																			function() {
																				changeImage();
																			});

															// AUTO CHANGE

														};

														$('.porDetCarousel')
																.each(
																		function() {
																			$(
																					this)
																					.carousel(
																							{
																								autoChange : true
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