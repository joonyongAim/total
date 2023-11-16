package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;
import util.Paging;
import vo.BoardVO;

public class BoardDAO {
	private BoardDAO() {
		
	}
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public List<BoardVO> getBoardList(String searchWord, Paging paging) {
		List<BoardVO> BoardList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from (" + "select tb.*, rownum rn from (" + "select * from board ";
		
		if(searchWord != null) {
			sql += "where title like '%" + searchWord + "%' ";
		}
		
		sql += "order by no desc) tb" + ") where rn between ? and ?";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, paging.getStart());
			pstmt.setInt(2, paging.getEnd());
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setId(rs.getString("id"));
				vo.setPostdate(rs.getDate("postdate"));
				vo.setVisitcount(rs.getInt("visitcount"));
				
				BoardList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt, rs);
		}
		
		return BoardList;
	}
	
	public int insertBoard(BoardVO vo) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String sql = "insert into board(no, title, content, id) values(BOARD_SEQ.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
				DBConnection.close(conn, pstmt);
		}
			
		return result;
	}
	
	public BoardVO boardDetail(int no) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BoardVO vo = null;
		
		String sql = "select * from board where no=?";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new BoardVO();
				
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setId(rs.getString("id"));
				vo.setPostdate(rs.getDate("postdate"));
				vo.setVisitcount(rs.getInt("visitcount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt);
		}
		
		return vo;
	}
	
	public void updateCount(int no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update board set visitcount=visitcount+1 where no=?";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt);
		}
	}
	
	public void deleteBoard(int no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String sql = "delete from board where no=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt);
		}

	}
	
	public void updateBoard(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String sql = "update board set title=?, content=? where no=?";
			pstmt = conn.prepareStatement(sql);
	
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getNo());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt);
		}
		
	}
	
	public int countAll(String searchWord) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select count(*) from board ";
		
		if(searchWord != null)
			sql += "where title like '%" + searchWord + "%'";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(conn, pstmt, rs);
		}
		
		return result;
	}

}
