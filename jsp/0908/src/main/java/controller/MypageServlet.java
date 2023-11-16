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
 * Servlet implementation class MypageServlet
 */
@WebServlet("/mypage.do")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MypageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("mypage.jsp");
		
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
		dao.updateEmp(vo);
		
		request.setAttribute("message", "회원 정보가 수정되었습니다.");
		HttpSession session = request.getSession();
		vo.setEnter(((EmpVO) session.getAttribute("loginUser")).getEnter());
		// 여기 전까지는 vo에 날짜가 없음
		vo = dao.getEmp(vo.getId());
		// 이게 vo에 날짜 생김
		session.setAttribute("loginUser", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("correction.jsp");
		
		rd.forward(request, response);
		
	}

}
