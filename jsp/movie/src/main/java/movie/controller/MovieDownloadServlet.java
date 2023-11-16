package movie.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MovieDownloadServlet
 */
@WebServlet("/download")
public class MovieDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieDownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("images");
		String title = request.getParameter("title");
		String poster = request.getParameter("poster"); // 서버에 저장된 파일명
		
		title += ".jpg";
		
		try {
			File file = new File(path, poster);
			InputStream is = new FileInputStream(file);
			
			String client = request.getHeader("User-Agent");
			
			if(client.indexOf("WOW64") == -1) {
				title = new String(title.getBytes("utf-8"), "iso-8859-1");
			} else {
				title = new String(title.getBytes("ksc5601"), "iso-8859-1");
			}
			
			response.reset();
			
			response.setContentType("application.octet-stream");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + title + "\"");
			response.setHeader("Content-length", "" + file.length());
			
			OutputStream os = response.getOutputStream();
			
			byte[] b = new byte[(int)file.length()];
			int readBuffer = 0;
			
			while((readBuffer = is.read(b)) > 0) {
				os.write(b, 0, readBuffer);
			}
			
			os.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
