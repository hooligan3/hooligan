<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>회원가입</title>
    <style>
        body{
            width:100%;
            text-align:center;
        }
        a{
         -webkit-box-shadow: 0 -1px 15px 10px #696969;
         box-shadow: 0 -1px 15px 10px #696969;
         border-radius:10px;
         display:inline-block;
         margin:20px;   
         margin-top:50px;
        }
        h1{
            height:100px;
            line-height:100px;
        }
    </style>
</head>
<body>
    <header>
        <h1>U&amp;Me 회원가입</h1>
        <hr />
    </header>
    <section>
        <a href="/hooligan/customer/register"><img src="/hooligan/images/signup_personal.png" alt="개인 회원가입" /></a>
        <a href="/hooligan/employee/register"><img src="/hooligan/images/signup_company.png" alt="기업 회원가입" /></a>
    </section>
</body>
</html>