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
    <script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
    $(function(){
		var a =  /^[a-zA-Z0-9]{5,15}$/;	//아이디
		var b =  /^[a-zA-Z0-9]{10,20}$/;// 비밀번호
		
		$("#id").on("blur",function(){

			if(a.test($("#id").val())==false){
				$("#idchecked").html("아이디는 대소문자 및 숫자 5~15의 길이 입니다")
				$("#idchecked").css("color","red")
			}
			else{
				$("#idchecked").html("")
			}
			
		
			
		})
		$("#pwd").on("blur",function(){
				
				if(b.test($("#pwd").val())==false){
					$("#pwdcheck").html("비밀번호는 대소문자 및 숫자 10~20의 길이 입니다")
					$("#pwdcheck").css("color","red")
				}
				else {
					
					$("#pwdcheck").html("")
				}
				
				if($("#pwd").val()==$("#pwd2").val()){
					$("#pwdcheck2").html("")

				}
			
			})
			
		$("#pwd2").on("blur",function(){
				
				if($("#pwd").val()!==$("#pwd2").val()){
					$("#pwdcheck2").html("비밀번호를 확인해 주십시오")
					$("#pwdcheck2").css("color","red")
				}
				else {
					
					$("#pwdcheck2").html("")
				}
			})
		
	})
    </script>
  </head>
  <body>
      <article class="container">
          <div class="page-header">
              <h1>U&Me 개인 사업자 회원가입</h1>
          </div>
          <div class="col-md-6 col-md-offset-3">
              <form action="/hooligan/employee/register" method="POST">
                   <div class="form-group">
                      <label for="InputEmail">아이디</label>
                      <input type="text" class="form-control" name="employee_id" placeholder="아이디" id="id">
                  </div>
                  <p id="idchecked"></p>
                  <div class="form-group">
                      <label for="InputPassword1">비밀번호</label>
                      <input type="password" class="form-control" name="employee_pwd" placeholder="비밀번호" name="password" id="pwd">
                  </div>
                  <p id="pwdcheck"></p>
                  <div class="form-group">
                      <label for="InputPassword2">비밀번호 확인</label>
                      <input type="password" class="form-control" placeholder="비밀번호 확인"name="password2" id="pwd2">
                  </div>
                  <p id="pwdcheck2"></p>
                  <div class="form-group">
                      <label for="username">이름</label>
                      <input type="text" class="form-control" id="username" placeholder="이름을 입력해 주세요" name="ename">
                  </div>
                  
                  <div class="form-group">
                  	 <label for="ssn">주민번호</label><br>
                  	 <div class="col-lg-6 col-md-6 col-sm-6" style="padding:0;">
                  	 	<input type="text" class="form-control" id="ssn1" name="ssn1" placeholder="앞자리" >
                  	 </div>
                  	 <div class="col-lg-6 col-md-6 col-sm-6" style="padding:0;"> 
                  	 	
                  	 	<input type="text" class="form-control" id="ssn2" name="ssn2" placeholder="뒷자리" >
                  	 </div>
                     
                      
                      
                      
                  </div>
                  <div class="form-group">
                      <label for="phone_number">전화번호</label>
                      <input type="text" class="form-control" id="phone_number" name="tell" placeholder="전화번호를 입력해주세요">
                  </div>
                  <div class="form-group">
                      <label for="address">주소</label>
                      <input type="text" class="form-control" id="address" name="address" placeholder="주소를 입력해주세요">
                  </div>
                  <div class="form-group">
                      <label for="email">이메일</label>
                      <input type="text" class="form-control" id="email"name="email" placeholder="이메일을 입력해주세요">
                  </div>
                  <hr />
                 
                  
                  <div class="form-group">
                      <label>약관 동의</label>
                      <div data-toggle="buttons">
                          <label class="btn btn-primary active">
                              <span class="fa fa-check"></span>
                              <input id="agree" type="checkbox" autocomplete="off" checked>
                          </label>
                          <a href="#">이용약관</a>에 동의합니다.
                      </div>
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
