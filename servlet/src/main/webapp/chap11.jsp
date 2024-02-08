<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/8/24
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>chap11</title>
</head>
<body>
<h1 align="center">Filter</h1>
<h3>필터의 라이프 사이클</h3>
<ul>
    <li><a href="first/filter">Filter 사용하기</a></li>
</ul>
<hr>    <%--한줄 그어줌--%>
<h3>필터의 활용</h3>
<form action="member/regist" method="post">
    <label>아이디: </label>
    <input type="text" name="userId">
    <br>
    <label>비밀번호: </label>
    <input type="password" name="password">
    <br>
    <label>이름: </label>
    <input type="text" name="name">
    <br>
    <button type="submit">가입하기</button>
</form>

</body>
</html>
