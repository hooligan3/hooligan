<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/confirm_waiting_company.css" rel="stylesheet" />
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
                     <li><a href="sales_history.html">공지 사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>공지 사항</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th style="text-align: center;">번호</th>
                                <th style="text-align: center;">제목</th>
                                <th style="text-align: center;">등록일</th>
                                <th style="text-align: center;"></th>
                            </tr>
                        </thead>
                        <tr>
                            <td><a href="#"><a href="#">1</a></a></td>
                            <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                            <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">2</a></td>
                            <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">3</a></td>
                           <td>깨끗한 사이트를 만듭시다
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                           <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">4</a></td>
                           <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                           <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">5</a></td>
                           <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">6</a></td>
                            <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">7</a></td>
                           <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">8</a></td>
                             <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">9</a></td>
                           <td>깨끗한 사이트를 만듭시다</td>
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                        <tr>
                            <td><a href="#">10</a></td>
                           <td>깨끗한 사이트를 만듭시다
                            <td>2014/11/11</td>
                             <td><button>수정</button>
                            <button>삭제</button></td>
                        </tr>
                    </table>
                   <!--페이징 시작 -->
                    <ul class="pagination" style="margin:0; margin-">
                        <br><br><li><a href="#">&laquo;</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>  
                    </ul>
                    <br><br>&nbsp;&nbsp;&nbsp;
                    <label for="search" class="search-label" >
                     <button class="search-button"><i class="fa fa-search"></i></button>
                      <input type="text" id="search" class="search-input" />
                     </label>
                    
            </div> <!--페이징 끝 -->
            </section>
        </div>
    </div>
</body>
</html>