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
    min-height: 290px;
    padding : 0;
    padding-left: 50px;
    }
    
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>


$(function(){
	var st = $(":input:radio[name=search_type]:checked").val();
	alert("선택된 값 : "+st);
})


</script>
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
							<h1>
								<a href="/Java/project/html_semi/WebContent/UandMe/index.html"><img
									src="images/logo.png" alt="" /></a>
							</h1>
						</div>
					</div>
				 <!-- =====================메인 메뉴(우측상단) 시작============================= -->
                     <%@include file="menu/MenuSelect.jsp" %>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->

		</header>
		<!--End Header-->
		<!--start wrapper-->
		<section class="page_head">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">

                        <div class="page_title">
                           <h2>포인트 충전하기</h2>
                        </div>
                    </div>
                </div>
            </div>
             </section>
            
 
           
            <div class="col-lg-12 col-md-12 col-sm-12">
            <br><br>
					<div class="col-lg-1 col-md-1 col-sm-1">


					</div>
							
							<div class="col-lg-10 col-md-10 col-sm-10">
							
							<div class="well well-lg" style="padding-left: 50px; padding-right: 50px;padding-top: 20px;"><h3><i class="fa fa-money"></i>    &nbsp;충전금액 선택</h3>
							
							
										<table class="table table-striped table-hover">
                    <thead>
                    <tr>
										<th style="text-align: center;">선택</th>
										<th style="text-align: center;">충전 금액</th>
										<th style="text-align: center;">실 충전 포인트</th>
										<th style="text-align: center;">적립 혜택</th>
									</tr>
                    </thead>
                    <tbody style="text-align: center;">
                    
                    <tr>
										<td><input type="radio" value="4500" checked="checked" name="search_type"></td>
										<td>5000</td>
										<td>4500</td>
										<td>5% 추가 적립 +250P</td>
								       
									</tr>
									
									<tr>
										<td><input type="radio"  value="9000"  name="search_type"></td>
										<td>10000</td>
										<td>9000</td>
										<td>5% 추가 적립 +500P</td>
								       
									</tr>
									<tr>
										<td><input type="radio" value="18000" name="search_type"></td>
										<td>20000</td>
										<td>18000</td>
										<td>5% 추가 적립 +1000P</td>
								       
									</tr>
									<tr>
										<td><input type="radio" value="27000" name="search_type"></td>
										<td>30000</td>
										<td>27000</td>
										<td>5% 추가 적립 +1500P</td>
								       
									</tr>
									<tr>
										<td><input type="radio" value="45000" name="search_type"></td>
										<td>50000</td>
										<td>45000</td>
										<td>5% 추가 적립 +2500P</td>
								       
									</tr>
                    <tr>
                      
                    
                    
                    
                    
                    
                    
                    
                </table>
									
									 
									
									
									</div>
									
									
									<div class="col-lg-1 col-md-1 col-sm-1">


									</div>
							
								
								 <div class="col-lg-12 col-md-12 col-sm-12">
            <br><br>
							
							
							<div class="well well-lg" style="padding-left: 50px; padding-right: 50px; padding-top: 7px; height: 280px; margin-right: 20px; margin-left: 20px;"><h3><i class="fa fa-credit-card"></i>   &nbsp; 포인트 충전방식 선택</h3>
									<br>
									<div style="text-align: center;">
										<a href="#"><img src="images/가상계좌.png"></a>&nbsp;								
										
										<a href="#"><img src="images/도서상품권.png"></a>&nbsp;
										<a href="#"><img src="images/모바일티머니.png"></a>&nbsp;
										<a href="#"><img src="images/핸드폰.png"></a>&nbsp;
										<a href="#"><img src="images/해피머니.png"></a><br><br><br>
									</div>
									<div style="text-align: center;">
										<a href="#"><img src="images/컬쳐랜드.png"></a>&nbsp;
										
										<a href="#"><img src="images/비자.png"></a>&nbsp;
										<a href="#"><img src="images/OK캐시백.png"></a>&nbsp;
										<a href="#"><img src="images/캐시선물.png"></a>&nbsp;
										<a href="#"><img src="images/신용카드.png"></a>
									</div>
										
									
									
									
						
                            
							
									
							</div>
							
							
							</div>
							
							<div class="col-lg-2 col-md-2 col-sm-2"></div>
							
							<div class="col-lg-8 col-md-8 col-sm-8" style="text-align: center;"><br>
							
								<input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value=메인으로>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="충전하기">
							</div>
							
							<div class="col-lg-2 col-md-2 col-sm-2"><br><br><br><br><br><br><br><br></div>
							
							
					

           
			


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
