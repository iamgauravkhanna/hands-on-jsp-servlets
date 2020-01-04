package in.hands.on;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int a = Integer.parseInt(req.getParameter("number1"));
		int b = Integer.parseInt(req.getParameter("number2"));

		int c = a + b;

		System.out.println("Sum is : " + c);

		res.getWriter().println("Sum is : " + c);

	}

}