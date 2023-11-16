package board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.vo.BoardVO;

public class BoardDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardVO vo = dao.boardDetail(num);
		
		request.setAttribute("board", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("boardDetail.jsp");
		rd.forward(request, response);
	}
	
}