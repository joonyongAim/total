package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBConnection;
import vo.BoardUserVO;

public class BoardUserDAO {
	private BoardUserDAO() {
		
	}
	
	private static BoardUserDAO instance = new BoardUserDAO();
	
	public static BoardUserDAO getInstance() {
		return instance;
	}
	
	public int BoardCheck(String id, String pw) {
		int result = 0;
		String sql = "select * from boarduser where id=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(!rs.next()) 
				result = 2;
			else {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	public BoardUserVO getBoardUser(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from boarduser where id=?";
		
		BoardUserVO vo = new BoardUserVO();
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {		
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setRegidate(rs.getDate("regidate"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt, rs);
		}
		
		return vo;
	}
}
