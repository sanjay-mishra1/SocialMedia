

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import widget.Post;

/**
 * Servlet implementation class ShowPost
 */
@WebServlet("/ShowPost")
public class ShowPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Dao dao=new Dao();
		 PrintWriter out=response.getWriter();
		 Post post=new Post(out);
		 dao.setPost("121212",out,post);
	}

}
