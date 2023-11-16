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
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("member/join.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberVO vo = new MemberVO();
		
		vo.setName(request.getParameter("name"));
		vo.setUserid(request.getParameter("userid"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setEmail(request.getParameter("email"));
		vo.setPhone(request.getParameter("phone"));
		if(request.getParameter("admin") != null)
			vo.setAdmin(Integer.parseInt(request.getParameter("admin")));
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int result = dao.insertMember(vo);
		
		HttpSession session = request.getSession();
		
		if(result == 1) {
			request.setAttribute("message", "회원가입 성공");
			session.setAttribute("userid", vo.getUserid());
			// 회원가입 성공
		} else {
			request.setAttribute("message", "회원가입 실패");
			// 회원가입 실패
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("member/login.jsp");
		rd.forward(request, response);
		
	}

}
