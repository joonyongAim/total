package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import movie.util.DBMovie;
import movie.vo.MovieVO;

public class MovieDAO {
	private MovieDAO() {
		
	}
	
	private static MovieDAO instance = new MovieDAO();
	
	public static MovieDAO getInstance() {
		return instance;
	}
	
	public List<MovieVO> selectAll() {
		List<MovieVO> list = new ArrayList<>();
		MovieVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from movie order by code desc";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new MovieVO();
				
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setDirector(rs.getString("director"));
				vo.setActor(rs.getString("actor"));
				vo.setPoster(rs.getString("poster"));
				vo.setSynopsis(rs.getString("synopsis"));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBMovie.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	public void insertMovie(MovieVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into movie values(movie_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getDirector());
			pstmt.setString(4, vo.getActor());
			pstmt.setString(5, vo.getPoster());
			pstmt.setString(6, vo.getSynopsis());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBMovie.close(conn, pstmt);
		}
		
	}
	
	public MovieVO movie(Integer code) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MovieVO vo = null;
		
		String sql = "select * from movie where code=?";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new MovieVO();
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setDirector(rs.getString("director"));
				vo.setActor(rs.getString("actor"));
				vo.setPoster(rs.getString("poster"));
				vo.setSynopsis(rs.getString("synopsis"));
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBMovie.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	public void updateMovie(MovieVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update movie set title=?, price=?, director=?, actor=?, poster=?, synopsis=? where code=?";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getDirector());
			pstmt.setString(4, vo.getActor());
			pstmt.setString(5, vo.getPoster());
			pstmt.setString(6, vo.getSynopsis());
			pstmt.setInt(7, vo.getCode());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBMovie.close(conn, pstmt);
		}
		
	}
	
	public void deleteMovie(int code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from movie where code=?";
		
		try {
			conn = DBMovie.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, code);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBMovie.close(conn, pstmt);
		}
	}
}
