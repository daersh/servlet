<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/11/24
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 align="center">forward</h1>

<form action="chap07/forward" method="post">       <%--/forward page, post형태로 전송--%>
    <table align="center">
        <tr>
            <td>아이디: </td>
            <td><input type="text" name="userId"></td>
            <td rowspan="2"><button type="submit" style="height:50px">로그인</button></td>
        </tr>
        <tr>
            <td>비밀번호: </td>
            <td><input type="password" name="password"></td>
        </tr>
    </table>
</form>
</body>
</html>