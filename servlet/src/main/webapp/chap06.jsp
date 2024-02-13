<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/11/24
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Exception Handler" %>
</h1>

<h2>Exception 핸들링 해보기</h2>
<ul>
    1. web.xml을 통해 에러 상태 코드 발생 시 어떤 서블릿으로 요청할 지 url 경로 설정해보기<br>
    <a href="show404error">404 error check</a></li><br>
    2. 모든 에러에 대해 페이지를 동적으로 처리 할 페이지를 request의 attribute에 담긴 값을 활용하여 동적 페이지로 응답해보기<br>
    <a href="show500error">500 error check</a></li><br>
</ul>
<%--ul>(li>a)*2--%>
</body>
</html>
