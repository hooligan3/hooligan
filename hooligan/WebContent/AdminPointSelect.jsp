<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/sales_history.css" rel="stylesheet" />
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
                    <li><a href="sales_history.html">공지사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>매출내역</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th>일일매출</th>
                                <th>월 매출</th>
                                <th>전체 매출</th>
                            </tr>
                        </thead>
                        <tr>
                            <td><a href="day_sales.html"><img src="/hooligan/images/매출내역.png" /></a></td>
                            <td><a href="month_sales.html"><img src="/hooligan/images/매출내역.png" /></a></td>
                            <td><a href="total_sales.html"><img src="/hooligan/images/매출내역.png" /></a></td>
                        </tr>
                    </table>
                </div>
            </section>
        </div>
    </div>
</body>
</html>>