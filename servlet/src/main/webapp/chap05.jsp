<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/11/24
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--참고. charset=UTF-8 은 톰캣 10 버전부터 안적어도 자동으로 적용되도록 변경되어뺴도 됨-->
<!DOCTYPE html>
<html>
<head>
    <title>Chapter 06. Response</title>
</head>
<body>
<h1 align="center">Response</h1>
<!-- 참고. ul>(li>a)*3하면 자동으로 아래와 같이 만들어줌-->
<ul>
    <li><a href="chap05/response">응답 확인</a></li>
    <li><a href="chap05/responseHeader">응답 헤더 확인</a></li>
    <li><a href="chap05/status">응답 상태 확인</a></li>
</ul>

<h1>Servlet 기능 및 목적</h1>
<ul>
    <li>1. 요청받기: http, method, Get/Post 요청에 따른 파라미터로 전달 받은 데이터를 꺼낼 수 있다.</li>
    <li>2. 비즈니스로직 처리: DB접속, CRUD에 대한 로직 처리 시작부분 -> 서비스 계층 호출(MVC2 구조 기반)</li>
    <li>3. 응답하기: 문자열을 통한 동적 웹(HTML)페이지를 만들어 스트림으로 내보낼 수 있다.(SSR 기술이다. (반대는 CSR))</li>
</ul>
<h2>SSR(Server Side Rendering)</h2>
<ul>
    서버에서 사용자에게 보여줄 페이지를 모두 구성하여 사용자에게 페이지를 보여주는 방식이다.<br>
    이를 통해 모든 데이터가 매핑된 서비스 페이지를 클라이언트에 바로 보여 줄 수 있다.
</ul>
</body>
</html>