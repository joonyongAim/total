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
 * Servlet implementation class CustomServlet
 */
@WebServlet("/custom.do")
public class CustomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("custom.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpVO vo = new EmpVO();
		
		vo.setId(request.getParameter("id"));
		vo.setPass(request.getParameter("pass"));
		vo.setName(request.getParameter("name"));
		vo.setLev(request.getParameter("lev"));
		vo.setGender(request.getParameter("gender"));
		vo.setPhone(request.getParameter("phone"));
		
		EmpDAO dao = EmpDAO.getInstance();
		int result = dao.insertEmp(vo);
		
		if(result != 1) {
			request.setAttribute("message", "회원 등록에 실패했습니다.");
		} else {
			request.setAttribute("message", "회원 등록에 성공했습니다.");
		}
		
		HttpSession session = request.getSession();
		
		session.setAttribute("loginUser", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("regist.jsp");
		
		rd.forward(request, response);
	}

}
