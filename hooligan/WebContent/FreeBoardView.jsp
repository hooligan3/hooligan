<%@page import="com.icia.vo.FreeReple"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%Customer customer=(Customer)session.getAttribute("customer");%>
<%-- <%ArrayList<FreeReple> list01 = (ArrayList<FreeReple>)request.getAttribute("result2");%> --%>
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
.name {
	text-align: center;
	padding-left: 200px;
	padding-right: 200px;
}

.well {
	min-height: 290px;
	padding: 0;
	padding-left: 50px;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>

	var result = <%=request.getAttribute("result")%>
	var result2 =<%=request.getAttribute("result2")%>
	var pageNo = <%=request.getParameter("pageNo")%>
	
	
	
	$(function(){

		var articleNo = result.articleNo;
		var free_reple_no = result.freeRepleNo;
		$("#rrr").append("<input type='hidden' name='article_no' value='"+articleNo+"'>");
		
// 		private int freeRepleNo;
// 		private int articleNo;
// 		private String writeId;
// 		private String content;
// 		private Date repleDate;
		
		var rn = 0;
		$.each(result2.list, function(index, value){
			rn++;
			var freeReple = value.freeRepleNo;
			var articleNo = value.articleNo;
			var id = value.writeId;
			var content = value.content;
			var repleDate = value.repleDate;
			//var btnModify = "onClick='location.href=\"/hooligan/free/repleUpdate?free_reple_no="+freeReple+"&article_no="+articleNo+"&page_no="+pageNo+"'";
			var btnModify = "onClick='location.href=\"/hooligan/free/repleUpdate?free_reple_no="+freeReple+"&content="+content+"&article_no="+articleNo+"&page_no="+pageNo+"\"'";
			var btnModify2 ="onClick='location.href=\"/hooligan/free/repleDelete?free_reple_no="+freeReple+"&article_no="+articleNo+"&page_no="+pageNo+"\"'";
			var str="<tr><th>"+id+"</th>";
				str = str+ "<th style='text-align: right;' colspan='2'>"+repleDate+"</th></tr>";
				str = str+"<tr><td colspan='2' style='text-align:left; padding-left:60px;'>"+content;
				str = str+ "<input type='hidden' name='article_no' value='"+articleNo+"'><input type='hidden' name='page_no' value='"+pageNo+"'>";
				str = str+"<input type='hidden' name='free_reple_no' value='"+freeReple+"'>";
				str = str+"<input type='hidden' name='free_reple_no' value='"+freeReple+"'><input type='hidden' name='article_no' value='"+articleNo+"'><input type='hidden' name='page_no' value='"+pageNo+"'></td><td style='text-align:right;'><input type='button' value='수정' "+btnModify+" style='color : white; width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'>&nbsp;&nbsp;<input type='submit' value='삭제' style='width : 40px; height:20px; padding:0px;' data-loading-text='Loading...' class='btn btn-default btn-lg'></td></tr>";
				$("#reple").append(str);
				
				
		})
		
		
			
			

		var str = "<tr><th style='text-align: left;'>"+result.customerId+"</th>";
		str = str + "<th style='text-align: center;'></th>";
		str = str + "<th style='text-align: right;'>"+result.articleDate+"</th></tr>";
		
		var str5 = "조회수("+result.hits+")";
		
		$("#abc").append(str5);
		$("#title2").append("<i class='fa fa-comment-o'></i>&nbsp;&nbsp;"+result.title);
		$("#title").append(str);
		
		var str2 = result.content;
		$("#content").append(str2);
	
		$("#back").on("click","#list",function(){
			location.href='list?pageNo='+pageNo;
		});
		
		$("#back3").on("click","#update", function() {
			location.href='update?article_no=' + result.articleNo;
		});	
		
		var back = $("#back");
		var back3 = $("#back3");
		var back4 = $("#back4 form");
		back.append("<input type='submit' value='이전으로'data-loading-text='Loading...' class='btn btn-default btn-lg' id='list' style='height:40px; width:74.39px; margin :0;'>")
		back3.append("<input type='submit' value='수정'data-loading-text='Loading...' class='btn btn-default btn-lg' id='update'>")
		back4.append("<input type='hidden' name='articleNo' id='articleNo' value='"+articleNo+"'>")
		back4.append("<input type='submit' value='삭제'data-loading-text='Loading...' class='btn btn-default btn-lg' id='delete'>")
	
	})
</script>
</head>
<body>
	<!--Start Header-->
	<header id="header">
		<%@ include file="header/MainHeader.jsp"%>
		<!--end Header-->
		<div id="menu-bar">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-3">
						<div id="logo">
							<h1>
								<a href="/hooligan/main/index"><img
									src="/hooligan/images/logo.png" /></a>
							</h1>
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
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
		<!--End Header-->
		<!--start wrapper-->
		<section class="page_head">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">

						<div class="page_title">
							<h2>자유 게시판</h2>
						</div>
					</div>
				</div>
			</div>
		</section>



		<div class="col-lg-12 col-md-12 col-sm-12">
			<br>
			<br>


			<div class="well well-lg"
				style="padding-right: 50px; padding-left: 50px; margin-left: 50px; margin-right: 50px;">
				<h3 id="title2">
					
				</h3>
				<table class="table table-striped table-hover"
					style="text-align: center;">
					<thead id="title">

					</thead>


				</table>

				<div class="col-lg-1 col-md-1 col-sm-1"></div>

				<div class="col-lg-10 col-md-10 col-sm-10">
					<br>
					<p id="content" style="max-height: 700px; min-height: 250px;">


					</p>


				</div>

				<div class="col-lg-1 col-md-1 col-sm-1"></div>

				<div class="col-lg-9 col-md-9 col-sm-9" id="back"></div>
				<div class="col-lg-2 col-md-2 col-sm-2" style="text-align: right;">

					<div id="back3" style="height: 40px;"></div>

				</div>
				<div class="col-lg-1 col-md-1 col-sm-1" style="text-align: right;">

					<div id="back4" style="height: 40px;">
						<form action='/hooligan/free/delete' method='post'></form>
					</div>

				</div>

				<table class="table table-striped table-hover"
					style="text-align: center;">
					<thead>
						<tr>
							<th></th>	
						</tr>
					</thead>


				</table>

				<div style="display: inline-block;" id="abc"></div>
				<!-- 댓글 -->
					
					
					<form action="/hooligan/free/repleDelete" method="post" id="delete">
					<br><table class="table table-striped table-hover" style="text-align: center;" id="reple">
					
					</table>
					</form>
						
					
				
					

				<form action="/hooligan/free/view" method="post">
					<!-- 댓글 -->
					<p id="rrr">댓글 작성		
							
							<input type="hidden" name="write_id" value="<%=customer.getCustomerId()%>">
							<input type="hidden" name="page_no" value="<%=request.getParameter("pageNo")%>">
							
					</p>
					<div class="col-lg-11 col-md-11 col-sm-11">
						<textarea rows="3" cols="" name="content"></textarea>
						
					</div>
					&nbsp;&nbsp;<input type="submit" data-loading-text="Loading..."
						class="btn btn-default btn-lg" value="등록" style="margin-top: 10px;">
					<br>
					<br> <br>
					<br>
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
		<script type="text/javascript"
			src="/hooligan/js/jquery.smartmenus.min.js"></script>
		<script type="text/javascript"
			src="/hooligan/js/jquery.smartmenus.bootstrap.min.js"></script>
		<script type="text/javascript" src="/hooligan/js/jquery.jcarousel.js"></script>
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