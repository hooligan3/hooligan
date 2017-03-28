<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>기업회원가입</title>

    <!-- Bootstrap -->
    <link href="/hooligan/css/bootstrap.min.css" rel="stylesheet">
    <!-- font awesome -->
    <link rel="stylesheet" href="/hooligan/css/font-awesome.css" media="screen" title="no title" charset="utf-8">
    <!-- Custom style -->
    <link rel="stylesheet" href="/hooligan/css/style.css" media="screen" title="no title" charset="utf-8">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    	#ssn1, #ssn2{
    		display: inline-block;
    	}
    </style>
  </head>
  <body>
      <article class="container">
          <div class="page-header">
              <h1>U&Me 개인 사업자 회원가입</h1>
          </div>
          <div class="col-md-6 col-md-offset-3">
              <form role="form" action="/hooligan/employee/register2" method="POST">
                  
                  <div class="form-group">
                      <label for="brand_name">브랜드명</label>
                      <input type="text" class="form-control" id="brand_name" placeholder="이메일을 입력해주세요">
                  </div>
                  <div class="form-group">
                      <label for="company_phone_number">회사연락처</label>
                      <input type="text" class="form-control" id="company_phone_number" placeholder="이메일을 입력해주세요">
                  </div>
                  <div class="form-group">
                      <label for="logo">로고등록</label>
                      <input type="file" class="form-control" id="logo">
                  </div>
                  <div class="form-group">
                      <label for="description">브랜드 소개</label>
                      <textarea rows="4" cols="50"></textarea>
                  </div>
                 
                  <div class="form-group text-center">
                      <button type="submit" class="btn btn-info">다음 단계<i class="fa fa-check spaceLeft"></i></button>
                      <button type="submit" class="btn btn-warning">가입취소<i class="fa fa-times spaceLeft"></i></button>
                  </div>
              </form>
          </div>
      </article>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/hooligan/js/bootstrap.min.js"></script>
  </body>
</html>
