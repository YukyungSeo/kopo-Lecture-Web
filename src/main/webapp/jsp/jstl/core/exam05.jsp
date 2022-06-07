<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String[] names = {"홍길동", "강길동", "윤길동", "박길동"};
	pageContext.setAttribute("names", names);
	pageContext.setAttribute("length", names.length-1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름배열의 개수 : ${ fn:length(names) }<br>
	<c:forEach begin="0" end="${ fn:length(names) - 1 }" var="i">
		<c:if test="${ i ne 0 }">,</c:if>
		${ names[i] }
	</c:forEach>
	
	<hr>
	<c:forEach items="${ names }" var="name" varStatus="status">
		<%-- <c:if test="${ not status.first }">,</c:if> --%>
		${ name } 
		<c:if test="${ ! status.last }">,</c:if>
	</c:forEach>
	
	<hr>
	<c:forEach items="${ names }" var="name" varStatus="loop">
		${ loop.first } : ${ loop.last } : ${ loop.index } : ${ loop.count }<br> 
	</c:forEach>
	
	<hr>
	<c:set var="cnt" value="1" />
	<c:forEach items="${ names }" var="name">
		<c:if test="${ cnt ne 1 }">,</c:if>
		${ name }
		<c:set var="cnt" value="${ cnt + 1 }"></c:set>
	</c:forEach>
	<c:remove var="cnt" scope="page"/>
	
	<hr>
	<c:forEach begin="0" end="${ length }" var="i">
		<c:if test="${ i ne 0 }">,</c:if>
		${ names[i] }
	</c:forEach>
	
	<hr>
	<c:forEach items="${ names }" var="name">
		${ name }
	</c:forEach>
	
	<hr>	
	<h2>1 ~ 10 사이의 정수 출력</h2>
	<c:forEach var="i" begin="1" end="10"> <!-- var는 공유영역에 들어감 -->
		${ i } 
	</c:forEach>
	
	<hr>
	년도선택 : 
	<select>
		<c:forEach begin="1970" end="2022" step="10" var="year">
			<option>${ year }</option>
		</c:forEach>
	</select>
</body>
</html>