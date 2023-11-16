package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;

/**
 * Servlet implementation class BoardDeleteServlet
 */
@WebServlet("/boardDelete.do")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		String id = request.getParameter("id");
		String loginId = request.getParameter("loginId");
		
		if(id.equals(loginId)) {
			// 삭제처리 구현
			BoardDAO dao = BoardDAO.getInstance();
			
			dao.deleteBoard(no);
			
			response.sendRedirect("boardlist.do");
		} else {
			request.setAttribute("message", "작성자만 삭제 가능합니다.");
			RequestDispatcher rd = request.getRequestDispatcher("boardDetail.do?no=" + no);
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
