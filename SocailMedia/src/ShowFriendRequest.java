

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import widget.FriendRequest;

/**
 * Servlet implementation class ShowFriendRequest
 */
@WebServlet("/ShowFriendRequest")
public class ShowFriendRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	Dao dao=new Dao();
	FriendRequest fr=new FriendRequest(out);
	dao.setFriendRequest("121212",out,fr);
	}

}
