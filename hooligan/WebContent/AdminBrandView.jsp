<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/brand_description.css" rel="stylesheet" />
    
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
            <h1><a href="manager_index.html"><img class="main_logo_img" src="/hooligan/images/logo.png" alt="로고" /></a></h1>
            <p>Manager</p>
        </header>
        <!--==============헤더와 본문 영역 구분===============-->
        <div id="header_blank"></div>
        <!--==============헤더와 본문 영역 구분===============-->
        <div id="container">
            <nav class="main_gnb">
                <ul>
                    <li><a href="confirm_waiting_company.html">승인대기중인 개인사업자</a></li>
                    <hr />
                    <li><a href="company_list.html">개인사업자 조회</a></li>
                    <hr />
                    <li><a href="customer_list.html">회원 조회</a></li>
                    <hr />
                    <li><a href="brand_list.html">브랜드 조회</a></li>
                    <hr />
                    <li><a href="sales_history.html">매출 내역</a></li>
                    <hr />
                    <li><a href="sales_history.html">공지사항 등록</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>브랜드 상세정보</h2>
                <table height="250" width="800">
                    <tr>
                        <td rowspan="4"><img src="http://placehold.it/250x250" alt="제품 이미지" width="250" height="250" /></td>
                        <td class="title">브랜드명</td>
                    </tr>
                    <tr>
                        <td>나이키</td>
                    </tr>
                    <tr>
                        <td class="title">브랜드 소개</td>
                    </tr>
                    <tr>
                        <td>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</td>
                    </tr>
                </table>
            </section>
        </div>
    </div>
</body>
</html>