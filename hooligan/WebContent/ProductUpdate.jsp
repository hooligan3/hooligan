<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

<link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css"
	media="screen" />
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>



.name {
	text-align: center;
	padding-left: 200px;
	padding-right: 200px;
}


.well {
    min-height: 360px;
    padding : 0;
    padding-left: 50px;
    }
    tr{
    	font-size: 1.1em;
    	height: 28px;
    	line-height: 28px;
    }
    
    .form-control{
    height: 20px;
    	line-height: 20px;
    	
    }
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	
</script>
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
							<h1>
								<a href="/Java/project/html_semi/WebContent/UandMe/index.html"><img
									src="/hooligan/images/logo.png" alt="" /></a>
							</h1>
						</div>
					</div>
					
				     <!-- =====================메인 메뉴(우측상단) 시작============================= -->
                       <%@include file="menu/MenuSelect.jsp" %>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
		<!--End Header-->
		<!--start wrapper-->
		<section class="page_head">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">

                        <div class="page_title">
                            <h2>직원 마이페이지</h2>
                        </div>
                    </div>
                </div>
            </div>
             </section>
            
 
           
            <div class="col-lg-12 col-md-12 col-sm-12">
            <br><br>
					<div class="col-lg-3 col-md-3 col-sm-3">

									<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/EmployeeUpdate.jsp" class="btn btn-block btn-default">내 정보 수정</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/EmployeeProductRegister.jsp" class="btn btn-block btn-default">상품 판매등록</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/EmployeeProductList.jsp" class="btn btn-block btn-default">내 상품조회</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/EmployeeRefund.jsp" class="btn btn-block btn-default">포인트 환급하기</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/EmployeeDelete.jsp" class="btn btn-block btn-default">회원 탈퇴</a>
								</div>

							</div>
							
							<div class="col-lg-9 col-md-9 col-sm-9">
							<div class="well well-lg" style="height: 360px;"><h3><i class="fa fa-leaf"></i>    상품 수정하기</h3>
						
							<form action="update" method="post">
							
							<div class="col-lg-3 col-md-3 col-sm-3">
							<table>
								<tbody>
									
									<tr><td>상품명</td></tr>	
									<tr><td>가격</td></tr>
									<tr><td>최소수량</td></tr>
									<tr><td>최대수량</td></tr>
									<tr><td>상품 내용</td></tr>

									
								</tbody>
							</table>
							</div>
							
							<div class="col-lg-3 col-md-3 col-sm-3">
								<table>
									<tbody>
										<tr><td><input type="text" ></td></tr>
										<tr><td><input type="text" ></td></tr>
										<tr><td><input type="text" ></td></tr>
										<tr><td><input type="text" ></td></tr>
										<tr><td><textarea rows="4" cols="3" style="width:180px;"></textarea></td></tr>
										
									</tbody>
								</table>
							</div>
							<div class="col-lg-2 col-md-2 col-sm-2">
							<table>
									<tbody>

										<tr><td>상품 이미지</td></tr>
										<tr><td>제품 상세 이미지</td></tr>

									</tbody>
								</table>
							</div>
							<div class="col-lg-3 col-md-3 col-sm-3">
								<table>
									<tbody>
										<tr><td><input type="file" ></td></tr>
										<tr><td><input type="file" ></td></tr>
										
										</tbody>
								</table>
								<br><br><br><br><br><br><br><br>
								<button class="btn btn-default btn-lg btn-block" type="button"> 
							<i class="fa fa-rocket"></i> 상품 수정하기</button>
							</div>
                            
							</form>
							
									
							</div>
							
							
							</div>
							
							
					

           
			


					<script type="text/javascript" src="/hooligan/js/jquery-1.10.2.min.js"></script>
					<script src="/hooligan/js/bootstrap.min.js"></script>
					<script src="/hooligan/js/jquery.easing.1.3.js"></script>
					<script src="/hooligan/js/retina-1.1.0.min.js"></script>
					<script type="text/javascript" src="/hooligan/js/jquery.cookie.js"></script>
					<!-- jQuery cookie -->
					<script type="text/javascript" src="/hooligan/js/styleswitch.js"></script>
					<!-- Style Colors Switcher -->
					<script type="text/javascript" src="/hooligan/js/jquery.smartmenus.min.js"></script>
					<script type="text/javascript"
						src="/hooligan/js/jquery.smartmenus.bootstrap.min.js"></script>
					<script type="text/javascript" src="/hooligan/js/jquery.jcarousel.js"></script>
					<script type="text/javascript" src="/hooligan/js/jflickrfeed.js"></script>
					<script type="text/javascript"
						src="/hooligan/js/jquery.magnific-popup.min.js"></script>
					<script type="text/javascript" src="/hooligan/js/jquery.isotope.min.js"></script>
					<script type="text/javascript" src="/hooligan/js/swipe.js"></script>
					<script type="text/javascript" src="/hooligan/js/jquery-scrolltofixed-min.js"></script>


					<script type="text/javascript">
						$(document)
								.ready(
										function() {
											$.fn.carousel = function(op) {
												var op, ui = {};
												op = $.extend({
													speed : 500,
													autoChange : false,
													interval : 5000
												}, op);
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
												ui.prev = $('<div />', {
													'class' : 'carousel-prev'
												});
												ui.next = $('<div />', {
													'class' : 'carousel-next'
												});
												ui.pagList = $(
														'<ul />',
														{
															'class' : 'carousel-pagination'
														});
												ui.pagItem = $('<li></li>');
												for (var i = 0; i < ui.itemsLen; i++) {
													ui.pagItem.clone()
															.appendTo(
																	ui.pagList);
												}
												ui.prev.appendTo(ui.ctrl);
												ui.next.appendTo(ui.ctrl);
												ui.pagList.appendTo(ui.ctrl);
												ui.ctrl.appendTo(ui.carousel);
												ui.carousel
														.find(
																'.carousel-pagination li')
														.eq(0).addClass(
																'active');
												ui.carousel.find(
														'.carousel-item').each(
														function() {
															$(this).hide();
														});
												ui.carousel.find(
														'.carousel-item').eq(0)
														.show().addClass(
																'active');

												// CHANGE ITEM
												var changeImage = function(
														direction, context) {
													var current = ui.carousel
															.find('.carousel-item.active');

													if (direction == 'index') {
														if (current.index() === context
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
														if (current.index() == 0) {
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
														if (current.index() == ui.itemsLen - 1) {
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
															.addClass('active')
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
												if (op.autoChange) {
													var changeInterval = setInterval(
															changeImage,
															op.interval);
													ui.carousel
															.on(
																	'mouseenter',
																	function() {
																		clearInterval(changeInterval);
																	})
															.on(
																	'mouseleave',
																	function() {
																		changeInterval = setInterval(
																				changeImage,
																				op.interval);
																	});
												}
												return this;
											};

											$('.porDetCarousel').each(
													function() {
														$(this).carousel({
															autoChange : true
														});
													});
										});
					</script>
					<script src="/hooligan/js/main.js"></script>
</body>
</html>
