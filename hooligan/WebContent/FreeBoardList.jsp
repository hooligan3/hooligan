<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판</title>
</head>
<body>


<!-- 리스트 -->
<div>

	<table width="670" border="0" cellpadding="0" cellspacing="0" class="list_hd2">
	  <tr>
	  <td width="75" class="pd_t3">번호</td>
		<td width="220" class="pd_t3">제목</td>
			<td width="155" class="pd_t3">글쓴이</td>
			<td width="85" class="pd_t3">등록일</td>
		<td width="50" class="pd_t3">조회수</td>
	  </tr>
	</table>

<!-- list start -->
<style>
	#cnts_list_new .thumb{width:60px;height:40px;border-right:1px solid #ddd;}
	#cnts_list_new .thumb_big{width:100px;height:75px;border-right:1px solid #ddd;}
	#cnts_list_new .thumb_square{width:75px;height:75px;border-right:1px solid #ddd;}
	#cnts_list_new .list_sbj2{overflow:display;}
</style>







 <!--검색/글쓰기-->
      <div id="wrap_li_sch">
	<div id="write_btn"><a href="#"><img src="" alt="" /></a></div>
        <div id="sch">
		<form name="search" method="get" action="list.html">
		<input type="hidden" name="table" value="pds" />
		<select name="st" style="width:90px; height:20px">
			<option value="subject">제목 검색</option>
			<option value="name">아이디 검색</option>
			<option value="contents">내용 검색</option>
					</select>
					
	        <input name="sk" type="text" class="t" value="" size="24"  maxlength="125" style="height:18px" />
		
		&nbsp;<input type="image" src="#" alt="검색" />
		</form>
	</div>

	</div>

	<div class="paging">
		<span class="link">
			<img src="/images/pg_prv.gif" alt="이전" style="vertical-align:middle" />&nbsp; <span class="o_bd">1</span> <a href="list.html?table=pds&pg=1" class="def">2</a> <a href="list.html?table=pds&pg=2" class="def">3</a> <a href="list.html?table=pds&pg=3" class="def">4</a> <a href="list.html?table=pds&pg=4" class="def">5</a> <a href="list.html?table=pds&pg=5" class="def">6</a> <a href="list.html?table=pds&pg=6" class="def">7</a> <a href="list.html?table=pds&pg=7" class="def">8</a> <a href="list.html?table=pds&pg=8" class="def">9</a> <a href="list.html?table=pds&pg=9" class="def">10</a>  &nbsp;<a href="list.html?table=pds&pg=10"><img src="/images/pg_nxt.gif" alt="다음" style="vertical-align:middle" /></a>
		</span>
	</div>

</div>


</body>
</html>