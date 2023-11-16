package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmpDAO;
import vo.EmpVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "login.jsp";
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String lev = request.getParameter("lev");
		
		EmpDAO dao = EmpDAO.getInstance();
		int result = dao.empCheck(id, pass, lev);
		
		if(result == 1) {
			// 로그인 성공 처리
			EmpVO vo = dao.getEmp(id);
			
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", vo);
			
			url = "main.jsp";
		} else if(result == 2) {
			// 아이디가 없는 경우
			request.setAttribute("message", "아이디가 없음");
		} else if(result == 3) {
			// 비번이 틀린 경우
			request.setAttribute("message", "비밀번호가 틀림");
		} else if(result == 4) {
			// 레벨이 틀린 경우
			request.setAttribute("message", "레벨이 틀림");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
