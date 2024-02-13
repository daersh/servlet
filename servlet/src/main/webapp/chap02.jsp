<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/8/24
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>d</title>
</head>
<!--
    서블릿 배울 때 요청은 크게 get과 post로 나뉨
    1. GET: 조회를 할 때 요청하는 형식으로 URL 경로에 노출된는 방식으로 서버에 값을 넘기며 조회된다.(쿼리스트링, PATHVARIABLE)
    2 POST: 조회를 제외한 나머지 (DML) 진행 시 사용. 경우에 따라 조회할 때 URL 경로를 노출시키지 않고 서버에 값을 넘기거나
            조회를 위해 서버로 넘기는 값의 크기가 클 때(255byte 초과 ) POST 요청 진행

    Rest API 방식으로 요청 시 더 세분화 된 Http Method(7가지) 사용하게 되겠지만 현재는 이 두가지 방식에 집중
-->
<body>
<h1 align="center">Service method</h1>
서블릿 배울 때 요청은 크게 get과 post로 나뉨<br>
1. GET: 조회를 할 때 요청하는 형식으로 URL 경로에 노출된는 방식으로 서버에 값을 넘기며 조회된다.(쿼리스트링, PATHVARIABLE)<br>
2 POST: 조회를 제외한 나머지 (DML) 진행 시 사용. 경우에 따라 조회할 때 URL 경로를 노출시키지 않고 서버에 값을 넘기거나 <br>
조회를 위해 서버로 넘기는 값의 크기가 클 때(255byte 초과 ) POST 요청 진행 <br>
<br>
Rest API 방식으로 요청 시 더 세분화 된 Http Method(7가지) 사용하게 되겠지만 현재는 이 두가지 방식에 집중 <br>

<h3>Get 방식 요청</h3>
<h4>a태그의 href 속성값 변경</h4>
<a href="request-service">서비스 메소드 요청</a>
<h3>POST 방식의 요청</h3>
<h4>form 테그의 methode 속성을 post로 설정</h4>
<form action="request-service" method="post">
    <input type="submit" value="POST 방식 요청 전송">
</form>
</body>
</html>