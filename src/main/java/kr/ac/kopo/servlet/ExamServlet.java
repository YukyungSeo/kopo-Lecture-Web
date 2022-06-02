package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet/exam")
public class ExamServlet extends HttpServlet {

	/*
	 * http://localhost:9999/Lecture-Web/servlet/exam?name=hong&hobby=reading&hobby=
	 * movie&hobby=music 입력 시
	 * 
	 * 웹브라우저에 아래와 같이 출력 이름 : hong
	 */

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String[] hobbys = request.getParameterValues("hobby");

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>서블렛 연습</title></head>");
		out.println("	<body>");
		out.println("		이름 : " + name + "<br>");
		out.print("			취미 : ");
		for (String hobby : hobbys) {
			out.print(hobby + "&nbsp;&nbsp;");
		}
		out.println("<br>");
		out.println("	</body>");
		out.println("</html>");
		out.close();
	}
}
