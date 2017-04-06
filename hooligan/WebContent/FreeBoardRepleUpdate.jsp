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
   .well {
    min-height: 250px;
    padding : 0;
    padding-left: 50px;
    }

   </style>
  <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	$(function(){
		var result = <%=request.getAttribute("result")%>
		
		var freeReple = result.freeReple;
		var content = freeReple.content;
		var freeRepleNo = freeReple.freeRepleNo;
		var articleNo = freeReple.articleNo;
		var pageNo = <%=request.getParameter("page_no")%>
		
		$("#content").append("<tr><td>댓글 내용 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><br><textarea rows='4' cols='3' name='content' style='width:575px;'>"+content+"</textarea><input type='hidden'name='free_reple_no' value='"+freeRepleNo+"' ><input type='hidden'name='page_no' value='"+pageNo+"' ><input type='hidden'name='article_no' value='"+articleNo+"' ></td></tr>")
		
		$("#return").on("click","#list",function(){
			location.href='view?pageNo='+pageNo+'&article_no='+articleNo;
		});
		
		$("#return").append("<input type='button' data-loading-text='Loading...' class='btn btn-default btn-lg' value='이전으로' id='list' style='width:84px; height:40px; margin : 0px; display:inline-block; color : white;'>");
		
		
		
		
	})
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
                    <div class="col-md-3 col-sm-3">
                        <div id="logo">
                            <h1><a href="/hooligan/main/index"><img src="/hooligan/images/logo.png"/></a></h1>
                        </div>
                    </div>
               <!-- =====================메인 메뉴(우측상단) 시작============================= -->
                        <%@include file="menu/MenuSelect.jsp" %>
        <!-- =====================메인 메뉴(우측상단) 끝============================= -->
<!--End Header-->
	<section class="wrapper">
    <section class="page_head">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <nav id="breadcrumbs">
                        <ul>

                            <li><a href="index.html">Home</a></li>
                            <li>상품등록</li>
                        </ul>
                    </nav>

                    <div class="page_title">
                        <h2>상품 평가</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <br>
<div class="col-lg-2 col-md-2 col-sm-2"></div>
<div class="col-lg-8 col-md-8 col-sm-8">
		<div class="well well-lg" style="padding-left: 50px; padding-top: 10px;"><h3><i class="fa fa-leaf"></i>    댓글 수정하기</h3>
		
		<form action="/hooligan/main/free/repleUpdate" method="post">
						<table>
							<tbody id="content">
								
								
		
							</tbody>
						</table>
									<div class="col-lg-2 col-md-2 col-sm-2"></div>
									
									<div class="col-lg-2 col-md-2 col-sm-2"></div>
									<div class="col-lg-8 col-md-8 col-sm-8">
									<br><br><br>
									<div id="return" style="display: inline-block;"></div>
										&nbsp;
                						<input type="submit" data-loading-text="Loading..." class="btn btn-default btn-lg" value="수정하기">
									</div>
									</form>
									<div class="col-lg-2 col-md-2 col-sm-2"></div>
									
									
									
									
						
						
				
	
	
	
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
