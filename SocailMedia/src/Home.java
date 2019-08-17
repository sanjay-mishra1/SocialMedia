

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import widget.Post;
/**
 * Servlet implementation class Home
 */
@WebServlet("/HomePage")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();	
		//dis=request.getRequestDispatcher("NewRequest.jsp");
			//	dis.include(request, response);
		RequestDispatcher dis=request.getRequestDispatcher("HomeHeader.jsp");
		dis.include(request, response);
		
//		dis=request.getRequestDispatcher("NewRequest.jsp");
//				dis.include(request, response);
		//dis=request.getRequestDispatcher("NewRequest.jsp");
		//dis.include(request, response);
		
	//	dis=request.getRequestDispatcher("FriendList.jsp");
		//dis.include(request, response);
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
