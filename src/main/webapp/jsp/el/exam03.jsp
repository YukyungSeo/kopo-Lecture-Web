<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
/*
	객체등록 : 공유영역.setAttribute("이름", 값);
	객체조회 : 공유영역.getAttribute("이름");
	jsp 공유영역 4가지 : pageContext, request, session, application
*/
pageContext.setAttribute("msg", "pageContext 영역에 등록 완료");

// id라는 이름으로 홍길동 값을 가진 객체 등록(pageContext)
pageContext.setAttribute("id", "홍길동");

request.setAttribute("msg", "request 영역에 등록 완료");
pageContext.setAttribute("length", "request 영역에 등록 완료".length());
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- EL 공유영역 4가지 : pageScope, requestScope, sessionScope, applicationScope --%>
	empty msg : ${ empty msg }<br>
	msg : <%= pageContext.getAttribute("msg") %><br>
	el msg : ${ msg }<br> <!-- 4가지 영역 중 pageScope에서 제일 먼저 찾으므로 생략이 가능하다 -->
	el id : ${ id }<br>
	
	request msg : ${ requestScope.msg }<br>
	request msg length : <%= ((String)request.getAttribute("msg")).length() %><br>
	request msg length : ${ length }<br>
</body>
</html>