<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/8/24
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 align="center">Session Handling</h1>

<form action="session" method="post">
    <table style="margin:auto">
        <tr>
            <td>firstName: </td>
            <td><input type="text" name="firstName"></td>
        </tr>
        <tr>
            <td>lastName: </td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">전송</button>
            </td>
        </tr>
    </table>
</form>
<br>
<a href="delete">세션 데이터 지우기</a>
</body>
</html>
