package shopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import shopping.dao.ProductDAO;
import shopping.vo.ProductVO;

/**
 * Servlet implementation class ProductUpdateServlet
 */
@WebServlet("/productUpdate.do")
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int code = Integer.parseInt(request.getParameter("code"));
		
		ProductDAO dao = ProductDAO.getInstance();
		
		ProductVO vo = dao.product(code);
		
		request.setAttribute("product", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("product/productUpdate.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		
		MultipartRequest multi = new MultipartRequest(
					request, 
					path,
					10 * 1024 * 1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
		
		int code = Integer.parseInt(multi.getParameter("code"));
		String name = multi.getParameter("name");
		int price = Integer.parseInt(multi.getParameter("price"));
		String description = multi.getParameter("description");
		String pictureUrl = multi.getFilesystemName("pictureUrl");
		if(pictureUrl == null) {
			pictureUrl = multi.getParameter("noupdateImg");
		}
		
		ProductVO vo = new ProductVO();
		vo.setCode(code);
		vo.setName(name);
		vo.setPrice(price);
		vo.setPictureUrl(pictureUrl);
		vo.setDescription(description);
		
		ProductDAO dao = ProductDAO.getInstance();
		dao.updateProduct(vo);
		
		response.sendRedirect("productList.do");
		
	}

}
