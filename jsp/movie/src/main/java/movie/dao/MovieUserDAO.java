package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import movie.util.DBMovie;
import movie.vo.MovieUserVO;

public class MovieUserDAO {
	private MovieUserDAO() {
		
	}
	
	private static MovieUserDAO instance = new MovieUserDAO();
	
	public static MovieUserDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		
		return conn;
	}
	
	public int MovieCheck(String id, String pw) {
		int result = 0;
		String sql = "select * from movieUser where id=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(!rs.next()) 
				result = 2; // 아이디 없음
			else {
				if(!rs.getString("pw").equals(pw))
					result = 3; // 비번 틀림
				else
					result = 1; // 모두 일치
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public MovieUserVO getMovie(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from movieUser where id=?";
		
		MovieUserVO vo = new MovieUserVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {		
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return vo;
	}
	
	public int insertmovieUser(MovieUserVO vo) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			String sql = "insert into movieUser values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public void updatemovieUser(MovieUserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update movieUser set pw=?, name=? where id=?";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getId());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}
	}
}