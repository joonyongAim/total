package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.BoardVO;

/**
 * Servlet implementation class UpdateBoardServlet
 */
@WebServlet("/updateBoard.do")
public class UpdateBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBoardServlet() {
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
		String url = "updateBoard.jsp";
		
		if(id.equals(loginId)) {
			BoardDAO dao = BoardDAO.getInstance();
			BoardVO vo = dao.boardDetail(no);
	
			request.setAttribute("boardDetail", vo);
		
		} else {
			request.setAttribute("message", "작성자만 수정 가능");
			url="boardDetail.do?no=" + no;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		
		vo.setNo(no);
		vo.setTitle(title);
		vo.setContent(content);
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateBoard(vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("boardDetail.do?no="+no);
		rd.forward(request, response);
	}

}
