<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Edge Responsive Multipurpose Template</title>
<meta name="description" content="">

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
</head>



<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<body>
	<!--헤더 시작-->
	<header id="header">
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="hidden-xs col-lg-7 col-sm-5 top-info">
						<span><a href="#" style="color: white">로그인</a></span> <span
							class="hidden-sm"><a href="/hooligan/main/selectRegister"
							style="color: white">회원가입</a></span>
					</div>
					<div class="col-lg-5 col-sm-7 top-info clearfix">
						<ul>
							<li>
								<form class="search-bar">
									<label for="search" class="search-label">
										<button class="search-button">
											<i class="fa fa-search"></i>
										</button> <!-- Fix the break-row-bug
                                        --> <input type="text"
										id="search" class="search-input" />
									</label>
								</form>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="menu-bar">
			<div class="container">
				<div class="row">
					<!-- Logo / Mobile Menu -->
					<div class="col-lg-3 col-sm-3 ">
						<div id="logo">
							<h1>
								<a href="/hooligan/main/index"><img
									src="/hooligan/images/logo.png" alt="" /></a>
							</h1>
						</div>
					</div>
					<!-- Navigation
                    ================================================== -->
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


								<li><a href="#"><span class="data-hover"
										data-hover="brand">브랜드</span></a></li>

								<li><a href="#"><span class="data-hover"
										data-hover="dress"> 의류</span></a>
									<ul class="dropdown-menu">
										<li><a href="#">점퍼</a></li>
										<li><a href="#">코트</a></li>

										<li class="active"><a href="#">니트</a></li>
										<li><a href="#">정장</a></li>
										<li><a href="#">티셔츠</a></li>
										<li><a href="#">팬츠</a></li>
									</ul></li>

								<li><a href="#"><span class="data-hover"
										data-hover="hand">수제품</span></a>
									<ul class="dropdown-menu">
										<li><a href="#">악세사리</a>
											<ul class="dropdown-menu">
												<li><a href="#">케이스</a></li>
												<li><a href="#">브로치</a></li>
											</ul></li>
										<li class="active"><a href="#">잡화</a></li>
										<li><a href="#">가방</a></li>
									</ul></li>

								<li><a href="#"> <span class="data-hover"
										data-hover="contact">식품</span></a>
									<ul class="dropdown-menu">
										<li><a href="#">과일</a></li>
										<li><a href="#">견과</a></li>
										<li><a href="#">음료</a></li>
										<li class="active"><a href="#">과자</a></li>
										<li><a href="#">유제품</a></li>
										<li><a href="#">냉동식품</a></li>
										<li><a href="#">통조림</a></li>

									</ul></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!--헤더 끝 -->
	<!--start wrapper-->
	<section class="wrapper">
		<section class="page_head">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<div class="page_title">
							<h2>비밀번호찾기</h2>
						</div>
					</div>
				</div>
			</div>
		</section>
		<div class="row sub_content">
			<div class="col-lg-4 col-md-4 col-sm-4"></div>

			<div class="col-lg-4 col-md-4 col-sm-4">
				<div class="dividerHeading">
					<h4>
						<span>비밀번호찾기</span>
					</h4>
				</div>

				<div class="row">
					<div class="form-group">
					 <div class="col-lg-12 col-md-12 col-sm-12">
                             <input type="text" id="customer_id" name="customer_id" class="form-control" maxlength="100" data-msg-required="회원 아이디" value="" placeholder="회원 아이디">
                            </div>
						<input type="text" id="ssn1" name="ssn1" class="form-control"
							maxlength="100" data-msg-required="아이디를 입력해주세요" value=""
							placeholder="주민번호앞자리"> <input type="password" id="ssn2"
							name="ssn2" class="form-control" maxlength="100"
							data-msg-required="비밀번호를 입력해주세요" value="" placeholder="주민번호뒷자리">
						<div class="col-lg-4 col-md-4 col-sm-4">

							<button id="btn" data-loading-text="Loading..."
								class="btn btn-default btn-lg" value="아이디찾기"
								style="text-align: left;">아이디찾기</button>
							<p id="target"></p>
						</div>
						<div class="col-lg-8 col-md-8 col-sm-8" style="text-align: right;">


						</div>

					</div>
				</div>

			</div>
			<div class="col-lg-4 col-md-4 col-sm-4"></div>
		</div>
	</section>
	<!--end wrapper-->

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
	<script type="text/javascript" src="/hooligan/js/jquery.validate.js"></script>
	<script type="text/javascript" src="/hooligan/js/view.contact.js"></script>


	<script src="/hooligan/js/main.js"></script>
	<script>
	$(function() {
		
		$("#btn").on("click", function() {
			
			$.ajax({
				type : "POST",
				url : "/hooligan/customer/searchPwd",
				data : {
					customer_id:$("#customer_id").val(),
					ssn1 : $("#ssn1").val(),
					ssn2 : $("#ssn2").val()
				},
				success:function(response) {
					if(response.result===undefined){
					alert("아이디와 주민번호가 일치하지 않습니다");
					}else alert("회원의 비밀번호는:"+response.result);
				}

			});
		});
	});
</script>
</body>
</html>

