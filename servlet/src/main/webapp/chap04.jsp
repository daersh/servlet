<%--
  Created by IntelliJ IDEA.
  User: hyunwoolee
  Date: 2/11/24
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Request Header</h1>
<h2>Header 종류</h2>
1. General Header: 요청 및 응답 모두에 적용되지만 최정적으로 바디에 전송 되는 것과는 관련이 없는 헤더이다.<br>
2. Request Header: 패치될 리소스나 클라이언트에 대한 상세 정보를 가지고 있는 헤더이다.<br>
3. Response Header: 요청 위치나 서버 응답에 대한 부가적인 정보를 가지고 있는 헤더이다. <br>
4. Entity Header: 컨텐츠 길이, MIME 타입과 같은 엔티티 바디에 대한 상세 정보를 가지고 있는 헤더이다. <br>
(요청 및 응답 모두에서 사용되며, 메시지 바디의 컨텐츠를 나타내기에 GET 요청은 해당되지 않는다.)
(Content_length, Content-Type, Content-Language, Content-Encoding)
<br>
<a href="headers">요청 헤더 값 출력 해보기</a><br>    - 요청 시 전달되는 헤더가 어떤 정보들을 가지고 있는지 확인하기 위한 메서드<br>
<h2>결과</h2>
host, connection, sec-ch-ua, sec-ch-ua-mobile, sec-ch-ua-platform, upgrade-insecure-requests, user-agent, accept, sec-fetch-site, sec-fetch-mode, sec-fetch-user, sec-fetch-dest, referer, accept-encoding, accept-language, cookie,

</body>
</html>
