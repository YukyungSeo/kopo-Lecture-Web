<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	1값을 가지는 변수 cnt 선언(page 공유영역)<br>
	<c:set var="cnt" value="1"/>
	공유영역에 설정된 cnt변수 : ${ cnt }<br>

	<hr>
	cnt에 1 증가<br>
	<c:set var="cnt" value="${ cnt + 1 }" scope="request" />
	cont : ${ cnt }<br>
	request cnt : ${ requestScope.cnt }<br>
	
	<hr>
	cnt 변수 삭제<br>
	<c:remove var="cnt" scope="page"/>
	cnt : ${ pageScope.cnt }<br>
	request cnt : ${ requestScope.cnt }<br>
</body>
</html>
<%--
		JSP				EL					JSTL
	-------------------------------------------------------
		pageContext		pageScope			page
		request			requestScope		request
		session			sessionScope	 	session
		application		applicationScope	application
--%>