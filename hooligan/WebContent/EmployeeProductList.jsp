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
	<!-- End Header -->
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
									<a href="/hooligan/employee/update." class="btn btn-block btn-default">내 정보 수정</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/employee/productRegister" class="btn btn-block btn-default">상품 판매등록</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/employee/productList" class="btn btn-block btn-default">내 상품조회</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/employeeRefund" class="btn btn-block btn-default">포인트 환급하기</a>
								</div>
								
								<div class="pricingTable-sign-up"><!-- BUTTON BOX-->
									<a href="/hooligan/employee/delete" class="btn btn-block btn-default">회원 탈퇴</a>
								</div>

							</div>
							
							<div class="col-lg-9 col-md-9 col-sm-9">
							<div class="well well-lg" style="padding-right: 50px; padding-left: 50px; height: 625px;"><h3><i class="fa fa-leaf"></i>    내 등록상품 조회</h3>
						
							<form action="update" method="get">
							
							<div class="col-lg-12 col-md-12 col-sm-12">
							
							
							
							<table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th>등록일</th>
						<th>상품명</th>
						<th>주문 상태</th>
						<th>마감 종료일</th>
						<th></th>
                    </tr>
                    </thead>
                    <tbody id=productList>

                    </tbody>
                </table>
                 <!--페이징 시작 -->
                <div class="col-sm-12 text-center"  id="pagination" >
                   
                </div>
            </div> <!--페이징 끝 -->
							
							
							
							
							
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

$(document).ready(function() {
	var result= <%= request.getAttribute("result") %>
	var list=result.list;
	var pagination=result.pagination;
	$.each(list, function(index, p) {
		if(p.orderState==0)	p.orderState="주문중";
		if(p.orderState==1)   p.orderState="주문성공";
		if(p.orderState==2)   p.orderState="주문완료"
		if(p.orderState==3)   p.orderState="주문실패"
		var a=$('<tr></tr>');
		var productName1=$('<td></td>');
		var productName2=$("<a href='/hooligan/product/productMain?product_no="+p.productNo+"'>"+p.productName+"</a>")
		productName1.append(productName2);
		var date1=p.closingDate;
		var date=$('<td></td>');
		date.append(date1);
		var regidate=p.registrationDate;
		var regidate1=$('<td></td>');
		regidate1.append(regidate);
		var order1=p.orderState;
		var orderState=$('<td></td>');
		orderState.append(order1);
		var orderFirst=$('<td></td>');
		var orderList=$("<a href='/hooligan/employee/productOrderList?productNo="+p.productNo+"'>주문회원리스트</a>");
		orderFirst.append(orderList);
		a.append(regidate1).append(productName1).append(orderState).append(date);
		$("#productList").append(a);
	});
	$("#pagination").append("<ul class='pagination'></ul>");
	var p = $("#pagination ul");
	if (pagination.prev > -1)
		p.append("<li><a href='productList?pageNo=" + pagination.prev + "'>이전으로</a></li>");
	for (var i = pagination.startPage; i <= pagination.endPage; i++)
		p.append("<li><a href='productList?pageNo=" + i + "'>" + i + "</a></li>");
	if (pagination.next > -1)
		p.append("<li><a href='productList?pageNo=" + pagination.next + "'>다음으로</a></li>");
	
});
</script>
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
