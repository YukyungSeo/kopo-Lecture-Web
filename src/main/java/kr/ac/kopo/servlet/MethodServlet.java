package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MethodServlet extends HttpServlet {

	// http://localhost:9999/Lecture-Web/method?id=hong
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method = request.getMethod(); // 어떤 method 방식으로 넘어왔는가? get or post
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL(); // ip + protocol + port + uri(경로), 내부에서 계속 string을 더하기 때문에 StringBuffer를 사용한다.
		String id = request.getParameter("id");

		System.out.println("요청 Method : " + method);
		System.out.println("요청 uri : " + uri);
		System.out.println("요청 url : " + url.toString());
		System.out.println("id : " + id);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		==========================================<br>");
		out.println("		&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("		==========================================<br>");
		out.println("		파라미터(id) : " + id + "<br>");
		out.println("		요청방식 : " + method + "<br>");
		out.println("		uri : " + uri + "<br>");
		out.println("		==========================================<br>");
		out.println("	</body>");
		out.println("</html>");
	}
	
	// http://localhost:9999/Lecture-Web/method
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); // post 방식일 땐 꼭(반드시!) char인코딩을 설정해야한다.
		
		String method = request.getMethod(); // 어떤 method 방식으로 넘어왔는가? get or post
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL(); // ip + protocol + port + uri(경로), 내부에서 계속 string을 더하기 때문에 StringBuffer를 사용한다.
		String id = request.getParameter("id");
		
		System.out.println("요청 Method : " + method);
		System.out.println("요청 uri : " + uri);
		System.out.println("요청 url : " + url.toString());
		System.out.println("id : " + id);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>메소드 요청방식</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		==========================================<br>");
		out.println("		&nbsp;&nbsp;&nbsp;&nbsp;출력결과<br>");
		out.println("		==========================================<br>");
		out.println("		파라미터(id) : " + id + "<br>");
		out.println("		요청방식 : " + method + "<br>");
		out.println("		uri : " + uri + "<br>");
		out.println("		==========================================<br>");
		out.println("	</body>");
		out.println("</html>");
	}
	
	

}
