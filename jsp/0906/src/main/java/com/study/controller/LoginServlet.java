package com.study.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.dao.MemberDAO;
import com.study.dto.MemberVO;

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
		
		RequestDispatcher rd = request.getRequestDispatcher("member/login.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "member/login.jsp";
		
		// 로그인페이지에서 사용자가 입력한 아이디, 비번
		String id = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int result = dao.userCheck(id, pwd);
		
		// result 결과에 따라서 로그인 성공, 실패
		// result가 1이면 로그인 성공처리
		// 세션에 로그인한 사람의 정보를 남김
		// 로그인 성공페이지로 이동
		if(result == 1) {
			MemberVO vo = dao.getMember(id);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", vo);
			request.setAttribute("message", "로그인 성공");
			
			// url을 로그인 성공페이지로 이동
			url = "main.jsp";
		} else if(result == 0) {
			request.setAttribute("message", "비밀번호가 다름");
			
			// 로그인 페이지로 이동
		} else {
			request.setAttribute("message", "아이디가 없음");
			
			// 로그인 페이지로 이동
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		
		rd.forward(request, response);
		// 0, -1 로그인 실패 -> 다시 로그인 페이지로 이동
		// 0 : 비밀번호가 틀림 message담아서 넘김
		// -1 : 아이디가 없음 message담아서 넘김
	}

}
