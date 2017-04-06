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
<link rel="stylesheet" href="/hooligan/css/layout/wide.css"
	data-name="layout">

<link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css"
	media="screen" />

<link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css"
	media="screen" />
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


<style>
.panel-body, .panel-heading {
	text-align: center;
}

.panel-body, .panel-heading {
	text-align: center;
}

.name li {
	list-style: none;
	float: left;
	margin: 15px 10px;
}

.name {
	text-align: center;
	padding-left: 200px;
	padding-right: 200px;
}

.post_img {
	display: inline-block;
}

.container {
	text-align: center;
}

#jobs {
	text-align: center;
	display: inline-block;
}

</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<script>
$(document).ready(function(){

	 var result = <%=request.getAttribute("result")%>
	 var list = result.list;
	var pagination = result.pagination;
	var pageNo = pagination.pageNo;
	
	var typeNo = <%=request.getParameter("type_no")%>
	
	 $.each(list, function(index,p){
	  var image = p.mainImagePath;
	  var price = p.price;
	  var name= p.productName;
	  
	  $("#sumin").append("<li class='list_item col-lg-4 col-md-6 col-sm-6'><figure class='touching effect-bubba'><img src='/hooligan/employees/productImg/"+image+"' alt='' style='width:500px; height:300px; ' class='img-responsive'/><div class='option'><a href='/hooligan/product/productMain?product_no="+p.productNo+"' class='fa fa-search mfp-image'></a></div><figcaption><h5>"+name+"</h5><p>"+price+"</p></figcaption></figure></li>").trigger("create");
	  
	 })
	 $("#pagination").append("<ul class='pagination' style='height: 20px;' ></ul>");
		var p = $("#pagination ul");
		if (pagination.prev > -1)
			p.append("<li><a href='productList?type_no="+typeNo+"&pageNo=" + pagination.prev + "'>이전으로</a></li>");
		for (var i = pagination.startPage; i <= pagination.endPage; i++)
			p.append("<li><a href='productList?type_no="+typeNo+ "&pageNo="+ i + "'>" + i + "</a></li>");
		if (pagination.next > -1)
			p.append("<li><a href='productList?type_no="+typeNo+"&pageNo=" + pagination.next + "'>다음으로</a></li>");

	 });   
</script>

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
				    <%@include file="menu/MenuSelect.jsp" %>
	<!-- =====================메인 메뉴(우측상단) 끝============================= -->
	<!--End Header-->
	<!--start wrapper-->
	<section class="wrapper">
		<section class="page_head">
			<div class="container"></div>
			</div>
		</section>

		<section class="content portfolio_single">
			<div class="container">
				<div class="row sub_content">





					<div class="col-lg-1 col-sm-1"></div>



					<div class="col-lg-10 col-sm-10">

						<div class="col-lg-12 isotope">
							<!--begin portfolio filter -->

							<!--end portfolio filter -->

							<!--begin portfolio_list -->

						<div  id="sumin">
						
							
							
							
							
							
							</div>
							
							<!--end isotope -->
						</div>
					
					</div>
	<div class="col-lg-1 col-sm-1"></div>
				</div>
			</div>
			</div>





		<div class="col-sm-12 text-right" style="height: 20px;">
							
						  
                    <br><br>
	                    <div id="pagination" style="text-align: center;"></div>
	                  
                    <br><br> <br><br>
                </div>
			</div>
			<!--./div-->
		</section>
	</section>


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
	<script type="text/javascript" src="/hooligan/js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="/hooligan/js/swipe.js"></script>
	<script type="text/javascript"
		src="/hooligan/js/jquery-scrolltofixed-min.js"></script>


	<script type="text/javascript">
                        $(document).ready(function () {
                            $.fn.carousel = function (op) {
                                var op, ui = {};
                                op = $.extend({
                                    speed: 500,
                                    autoChange: false,
                                    interval: 5000
                                }, op);
                                ui.carousel = this;
                                ui.items = ui.carousel.find('.carousel-item');
                                ui.itemsLen = ui.items.length;

                                // CREATE CONTROLS
                                ui.ctrl = $('<div />', { 'class': 'carousel-control' });
                                ui.prev = $('<div />', { 'class': 'carousel-prev' });
                                ui.next = $('<div />', { 'class': 'carousel-next' });
                                ui.pagList = $('<ul />', { 'class': 'carousel-pagination' });
                                ui.pagItem = $('<li></li>');
                                for (var i = 0; i < ui.itemsLen; i++) {
                                    ui.pagItem.clone().appendTo(ui.pagList);
                                }
                                ui.prev.appendTo(ui.ctrl);
                                ui.next.appendTo(ui.ctrl);
                                ui.pagList.appendTo(ui.ctrl);
                                ui.ctrl.appendTo(ui.carousel);
                                ui.carousel.find('.carousel-pagination li').eq(0).addClass('active');
                                ui.carousel.find('.carousel-item').each(function () {
                                    $(this).hide();
                                });
                                ui.carousel.find('.carousel-item').eq(0).show().addClass('active');


                                // CHANGE ITEM
                                var changeImage = function (direction, context) {
                                    var current = ui.carousel.find('.carousel-item.active');

                                    if (direction == 'index') {
                                        if (current.index() === context.index())
                                            return false;

                                        context.addClass('active').siblings().removeClass('active');

                                        ui.items.eq(context.index()).addClass('current').fadeIn(op.speed, function () {
                                            current.removeClass('active').hide();
                                            $(this).addClass('active').removeClass('current');
                                        });
                                    }

                                    if (direction == 'prev') {
                                        if (current.index() == 0) {
                                            ui.carousel.find('.carousel-item:last').addClass('current').fadeIn(op.speed, function () {
                                                current.removeClass('active').hide();
                                                $(this).addClass('active').removeClass('current');
                                            });
                                        }
                                        else {
                                            current.prev().addClass('current').fadeIn(op.speed, function () {
                                                current.removeClass('active').hide();
                                                $(this).addClass('active').removeClass('current');
                                            });
                                        }
                                    }

                                    if (direction == undefined) {
                                        if (current.index() == ui.itemsLen - 1) {
                                            ui.carousel.find('.carousel-item:first').addClass('current').fadeIn(300, function () {
                                                current.removeClass('active').hide();
                                                $(this).addClass('active').removeClass('current');
                                            });
                                        }
                                        else {
                                            current.next().addClass('current').fadeIn(300, function () {
                                                current.removeClass('active').hide();
                                                $(this).addClass('active').removeClass('current');
                                            });
                                        }
                                    }
                                    ui.carousel.find('.carousel-pagination li').eq(ui.carousel.find('.carousel-item.current').index()).addClass('active').siblings().removeClass('active');
                                };

                                ui.carousel
                                    .on('click', 'li', function () {
                                        changeImage('index', $(this));
                                    })
                                    .on('click', '.carousel-prev', function () {
                                        changeImage('prev');
                                    })
                                    .on('click', '.carousel-next', function () {
                                        changeImage();
                                    });

                                // AUTO CHANGE
                                if (op.autoChange) {
                                    var changeInterval = setInterval(changeImage, op.interval);
                                    ui.carousel
                                        .on('mouseenter', function () {
                                            clearInterval(changeInterval);
                                        })
                                        .on('mouseleave', function () {
                                            changeInterval = setInterval(changeImage, op.interval);
                                        });
                                }
                                return this;
                            };

                            $('.porDetCarousel').each(function () {
                                $(this).carousel({
                                    autoChange: true
                                });
                            });
                        });
                    </script>
		<script type="text/javascript">


</script>

	<script src="/hooligan/js/main.js"></script>
</body>
</html>
