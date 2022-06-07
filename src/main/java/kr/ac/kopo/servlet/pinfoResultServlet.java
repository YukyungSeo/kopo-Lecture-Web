package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class pinfoResultServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		String sex = request.getParameter("sex");
		ArrayList<String> receiveMail = new ArrayList<String>(Arrays.asList(request.getParameterValues("receiveMail")));
		String job = request.getParameter("job");

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>개인 정보 출력</title></head>");
		out.println("	<body>");
		out.println("	<h2>개인 정보 출력</h2>");
		out.println("		이름 : " + name + "<br>");
		out.println("		아이디 : " + id + "<br>");
		out.println("		암호 : " + password + "<br>");
		out.println("		성별 : " + sex + "<br>");

		String[] receiveMailStd = {"공지 메일", "광고 메일", "배송 확인 메일"};
		for (int i = 0; i < 3; i++) {
			String m = receiveMailStd[i];
			out.print("		" + m + " : ");
			if(receiveMail.contains(receiveMailStd[i])) {
				out.print("받음");
			} else {
				out.print("받지않음");
			}
			out.println("<br>");
		}
			
		out.println("		직업 : " + job + "<br>");
		out.println("	</body>");
		out.println("</html>");

		out.close();
	}

}
