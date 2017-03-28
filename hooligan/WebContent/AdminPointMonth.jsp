<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/customer_list.css" rel="stylesheet" />
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
                    <li><a href="/hooligan/AdminWaitEmployee.jsp">승인대기중인 개인사업자</a></li>
                    <hr/>
                    <li><a href="/hooligan/AdminEmployeeList.jsp">개인사업자 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminCustomerList.jsp">회원 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminBrandList.jsp">브랜드 조회</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminPointSelect.jsp">매출 내역</a></li>
                    <hr />
                    <li><a href="/hooligan/AdminNoticeList.jsp">공지사항</a></li>
                    <hr />
                </ul>
            </nav>
            <section class="main_section">
                <h2>한 달 총 매출 조회</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th style="text-align: center;">결제 시간</th>
                                <th style="text-align: center;">결제 금액</th>
                                <th style="text-align: center;">순 이익</th>
                                <th style="text-align: center;">총 매출</th>
                                <th style="text-align: center;">비고</th>
                            </tr>
                        </thead>
                        <tr>
                            <td>2021/12/12</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>환급</td>
                        </tr>
                        <tr>
                            <td>2014/11/11</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>충전</td>
                        </tr>
                        <tr>
                            <td>2021/12/12</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                             <td>xx원</td>
                            <td>환급</td>
                        </tr>
                        <tr>
                            <td>2014/11/11</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>충전</td>
                        </tr>
                       <tr>
                            <td>2021/12/12</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>환급</td>
                        </tr>
                        <tr>
                            <td>2014/11/11</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>충전</td>
                        </tr>
                        <tr>
                            <td>2021/12/12</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                             <td>xx원</td>
                            <td>환급</td>
                        </tr>
                        <tr>
                            <td>2014/11/11</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                             <td>xx원</td>
                            <td>충전</td>
                        </tr>
                        <tr>
                            <td>2021/12/12</td>
                            <td>30.000원</td>
                            <td>3000원</td>
                            <td>xx원</td>
                            <td>환급</td>
                        </tr>
                       
                    </table>
                    <div style="margin-left: 89px;">
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
            </div>
                </div>
                </div>
            </section>
        </div>
    </div>
</body>
</html>