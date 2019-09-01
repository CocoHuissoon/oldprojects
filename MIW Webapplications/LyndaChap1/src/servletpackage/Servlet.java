package servletpackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@SuppressWarnings("deprecation")
@WebServlet(description = "This is a sample servlet", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet implements SingleThreadModel {
	private static final long serialVersionUID = 1L;
	private int count=0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		increment();
//		int number1 = Integer.parseInt(request.getParameter("number1"));
//		int number2 = Integer.parseInt(request.getParameter("number2"));
//		int sum=number1+number2;
//		response.getWriter().append("The sum of "+number1+" plus "+number2+" is "+sum );
//		decrement();
//	}
	protected synchronized void increment() {
		count++;
	}
	protected synchronized void decrement() {
		count--;
	}
	protected synchronized int getCount() {
		return count;
	}

}
