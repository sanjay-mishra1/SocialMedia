

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import widget.FriendBox;
import widget.FriendRequest;

/**
 * Servlet implementation class ShowFriendList
 */
@WebServlet("/ShowFriendList")
public class ShowFriendList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Dao dao=new Dao();
		FriendBox fr=new FriendBox(out);
		dao.setFriendList("121212",out,fr);
	}

}
