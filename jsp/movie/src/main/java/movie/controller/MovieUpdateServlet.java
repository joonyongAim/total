package movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import movie.dao.MovieDAO;
import movie.vo.MovieVO;

/**
 * Servlet implementation class MovieUpdateServlet
 */
@WebServlet("/movieUpdate.do")
public class MovieUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		
		MovieDAO dao = MovieDAO.getInstance();
		
		MovieVO vo = dao.movie(code);
		
		request.setAttribute("movie", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("movie/movieUpdate.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String path = context.getRealPath("images");
		
		MultipartRequest multi = new MultipartRequest(
					request, 
					path,
					10 * 1024 * 1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
		
		int code = Integer.parseInt(multi.getParameter("code"));
		String title = multi.getParameter("title");
		int price = Integer.parseInt(multi.getParameter("price"));
		String director = multi.getParameter("director");
		String actor = multi.getParameter("actor");
		String poster = multi.getFilesystemName("poster");
		String synopsis = multi.getParameter("synopsis");
		if(poster == null) {
			poster = multi.getParameter("noupdateImg");
		}
		
		
		MovieVO vo = new MovieVO();
		
		vo.setCode(code);
		vo.setTitle(title);
		vo.setPrice(price);
		vo.setDirector(director);
		vo.setActor(actor);
		vo.setPoster(poster);
		vo.setSynopsis(synopsis);
		
		
		MovieDAO dao = MovieDAO.getInstance();
		dao.updateMovie(vo);
		
		response.sendRedirect("movieList.do");
	}

}
