<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();

StringBuilder sb = new StringBuilder();
for (Cookie c : cookies) {
	
	String cName = c.getName();
	String cValue = c.getValue();

	// decoding
	cName = URLDecoder.decode(cName, "utf-8");
	cValue = URLDecoder.decode(cValue, "utf-8");
	
	sb.append("쿠키이름 : " + cName + ", ");	
	sb.append("쿠키값 : " + cValue + "<br>");	
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>설정된 쿠키 확인</h2>
	<%= sb.toString() %>
	<a href="makeForm.jsp">쿠키 설정 화면으로 이동</a>
</body>
</html>