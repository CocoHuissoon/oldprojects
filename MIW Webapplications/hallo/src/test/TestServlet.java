package test;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import control.User;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static ArrayList<User>list=new ArrayList<User>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		PrintWriter pw = response.getWriter();
		String naam=request.getParameter("name");
		String password=request.getParameter("password");
		
		User temp = new User (naam, password);
		list.add(temp);
//		pw.append("<html><head><title>Users</title></head><body>");
//		for(User user:list) {
//			pw.append("<p>").append(user.toString()).append(" login tijd was: "+java.time.LocalDateTime.now().toString()).append("</p>");
//		}
//		pw.append("</body></html>");
//	
		request.setAttribute("list", list);
		request.getRequestDispatcher("datum.jsp").forward(request, response);;
	}

}
