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
                </ul>
            </nav>
            <section class="main_section">
                <h2>제휴 신청중인 사업자</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th>직원이름</th>
                                <th>아이디</th>
                                <th>이메일</th>
                                <th>연락처</th>
                                <th>브랜드명</th>
                                <th>상품명</th>
                                <th>승인</th>
                            </tr>
                        </thead>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">나이키</a></td>
                            <td><a href="product_description.html">운동화</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">브레이틀링</a></td>
                            <td><a href="product_description.html">시계</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">불가리</a></td>
                            <td><a href="product_description.html">향수</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">루이비통</a></td>
                            <td><a href="product_description.html">가방</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">아디다스</a></td>
                            <td><a href="product_description.html">트레이닝복</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                        <tr>
                            <td>홍길동</td>
                            <td>hong-gil-dong</td>
                            <td>hong-gil-dong@gamil.com</td>
                            <td>010-1234-5769</td>
                            <td><a href="brand_description.html">구찌</a></td>
                            <td><a href="product_description.html">지갑</a></td>
                            <td><button>승인</button><button>거절</button></td>
                        </tr>
                    </table>
                </div>
            </section>
        </div>
    </div>
</body>
</html>