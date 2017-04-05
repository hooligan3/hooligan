<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <!-- CSS FILES -->
    <link rel="stylesheet" href="/hooligan/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/hooligan/css/style.css">
    <link rel="stylesheet" type="text/css" href="/hooligan/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="/hooligan/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="/hooligan/css/switcher.css" media="screen" />
</head>
<body>
    <div id="wrap">
        <header id="header">
            <h1><a href="manager_index.html"><img class="main_logo_img" src="images/logo.png" alt="로고" /></a></h1>
            <p>Manager</p>
        </header>
<!--==============헤더와 본문 영역 구분===============-->
        <div id="header_blank"></div>
<!--==============헤더와 본문 영역 구분===============-->
        <div id="container">
            <nav class="main_gnb">
                <ul>
                     <li><a href="/hooligan/admin/employee/NoActiveList">승인대기중인 개인사업자</a></li>
                    <hr/>
                    <li><a href="/hooligan/admin/employee/list">개인사업자 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/customer/list">회원 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/brand/list">브랜드 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminPointSelect.jsp">매출 내역</a></li>
                    <hr />
                    <li><a href="/hooligan/admin/notice/list">공지사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>U&amp;Me 관리 프로그램</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th>승인대기중인 개인 사업자</th>
                                <th>개인사업자 조회</th>
                                <th>회원 조회</th>
                            </tr>
                        </thead>
                        <tr>
                            <td><a href="/hooligan/admin/employee/NoActiveList"><img src="/hooligan/images/제휴신청중.png" /></a></td>
                            <td><a href="/hooligan/admin/employee/list"><img src="/hooligan/images/개인사업자.png" /></a></td>
                            <td><a href="/hooligan/admin/customer/list"><img src="/hooligan/images/회원관리.png" /></a></td>
                        </tr>
                        <thead>
                            <tr>
                                <th>브랜드 조회</th>
                                <th>매출 내역</th>
                                <th>공지 사항</th>
                            </tr>
                        </thead>
                        <tr>
                            <td><a href="/hooligan/admin/brand/list"><img src="/hooligan/images/브랜드.png" /></a></td>
                            <td><a href="/hooligan/AdminPointSelect.jsp"><img src="/hooligan/images/매출내역.png" /></a></td>
                            <td><a href="/hooligan/admin/notice/list"><img src="/hooligan/images/logo2.png" /></a></td>
                        </tr>
                    </table>
                </div>
            </section>
        </div>
    </div>
</body>
</html>