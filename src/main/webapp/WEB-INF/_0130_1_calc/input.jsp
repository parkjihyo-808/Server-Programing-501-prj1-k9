<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 29.
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input</title>
</head>
<body>
<h1>get 방식 입력 조회 연습</h1>
<%--웹브라우저에서, 서버로 전달하는 방법을 : post 로 변경,--%>
<%--데이터를 공개하지 않고, 데이터의 길이도 상관없음.--%>
    <form action="calcResult.jsp" method="post">
        <input type="number" name="num1">
        <input type="number" name="num2">
        <button type="submit">전송</button>
    </form>
</body>
</html>
