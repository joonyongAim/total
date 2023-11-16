package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.board.domain.BoardVO;
import com.board.domain.Paging;

public interface BoardMapper {
	
	// board테이블에 전체 레코드를 조회하는 메서드
    // @Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Paging paging);
	
	public int getTotal(Paging paging);
	
	// board테이블에 레코드를 추가하는 메서드
	public void insert(BoardVO vo);
	
	public void insertSelectKey(BoardVO vo);
	
	// board테이블에 특정 레코드를 조회하는 메서드
	public BoardVO read(Long bno);
	
	// board테이블에 특정 레코드를 삭제하는 메서드
	public int delete(Long bno);
	
	// board테이블에 특정 레토드를 수정하는 메서드
	// title, content, writer, updatedate
	public int update(BoardVO vo);
	
}
