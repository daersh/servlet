<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/11/24
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chapter 9. Cookie</title>
</head>
<body>
<h1 align="center">Cookie handling</h1>

<form action="chap09/cookie" method="post">
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
</body>
</html>
