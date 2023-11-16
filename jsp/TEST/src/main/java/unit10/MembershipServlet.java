package unit10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MembershipServlet
 */
@WebServlet("/MembershipServlet")
public class MembershipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MembershipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("이름");
		String resident1 = request.getParameter("주민등록번호1");
		String resident2 = request.getParameter("주민등록번호2");
		String id = request.getParameter("아이디");
		String pw = request.getParameter("비밀번호");
		String email1 = request.getParameter("이메일1") + "@";
		String zip = request.getParameter("우편번호");
		String host1 = request.getParameter("주소1");
		String host2 = request.getParameter("주소2");
		String phone = request.getParameter("핸드폰번호");
		String job = request.getParameter("직업");
		String[] favorite = request.getParameterValues("item");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("이름 : " + name + "<br>");
		out.print("주민등록번호 : " + resident1 + "-" + resident2 + "<br>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		if(request.getParameter("이메일2") == "") {
			email1 += request.getParameter("이메일3");
		} else {
			email1 += request.getParameter("이메일2");
		}
		out.print("이메일 : " + email1 + "<br>");
		out.print("우편번호 : " + zip + "<br>");
		out.print("주소 : " + host1 + " " + host2 + "<br>");
		out.print("핸드폰번호 : " + phone + "<br>");
		out.print("직업 : " + job + "<br>");
		if(favorite == null) {
			out.print("관심분야가 없습니다.");
		} else {
			out.print("관심분야 : ");
			for(String f : favorite) {
				out.print(f + " ");
			}
		}
		out.print("</body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
