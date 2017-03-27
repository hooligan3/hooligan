<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="/hooligan/css/manager_reset.css" rel="stylesheet" />
    <link href="/hooligan/css/manager.css" rel="stylesheet" />
    <link href="/hooligan/css/brand_list.css" rel="stylesheet" />
    
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
                <h2>브랜드조회</h2>
                <div class="article">
                    <table>
                        <thead>
                            <tr>
                                <th>브랜드명</th>
                                <th>회사 연락처</th>
                                <th></th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tr>
                            <td>나이키</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>불가리</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>브라이틀링</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>뉴발란스</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
                        </tr>
                        <tr>
                            <td>구찌</td>
                            <td>02-123-4567</td>
                            <td><button>브랜드 상세</button></td>
                            <td><button>상품 상세</button></td>
                            <td><button>삭제하기</button></td>
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
                </div>
            </section>
        </div>
    </div>
</body>
</html>