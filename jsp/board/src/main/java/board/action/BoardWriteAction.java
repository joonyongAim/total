package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.vo.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setName(name);
		vo.setPass(pass);
		vo.setEmail(email);
		vo.setTitle(title);
		vo.setContent(content);
		
		// DAO에서 vo에 저장된 값을 insert해야함
		BoardDAO dao = BoardDAO.getInstance();
		dao.insert(vo);
		
		response.sendRedirect("board?command=listAll");
	}
	
}
