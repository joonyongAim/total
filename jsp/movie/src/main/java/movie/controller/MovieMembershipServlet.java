package movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.dao.MovieUserDAO;
import movie.vo.MovieUserVO;

/**
 * Servlet implementation class MovieMembershipServlet
 */
@WebServlet("/movieMembership")
public class MovieMembershipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieMembershipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("movie/movieMembership.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieUserVO vo = new MovieUserVO();
		
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setName(request.getParameter("name"));
		
		MovieUserDAO dao = MovieUserDAO.getInstance();
		int result = dao.insertmovieUser(vo);
		
		if(result != 1) {
			request.setAttribute("message", "회원가입 성공");
		} else {
			request.setAttribute("message", "회원가입 실패");
		}
		
		HttpSession session = request.getSession();
		
		session.setAttribute("loginUser", vo);
		
		response.sendRedirect("movieList.do");
	}

}
