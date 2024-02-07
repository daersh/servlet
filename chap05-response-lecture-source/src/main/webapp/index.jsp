<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--참고. charset=UTF-8 은 톰캣 10 버전부터 안적어도 자동으로 적용되도록 변경되어뺴도 됨-->
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center">Response</h1>
    <!-- 참고. ul>(li>a)*3하면 자동으로 아래와 같이 만들어줌-->
    <ul>
        <li><a href="response">응답 확인</a></li>
        <li><a href="header">응답 헤더 확인</a></li>
        <li><a href="status">응답 상태 확인</a></li>
    </ul>
</body>
</html>