package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.domain.BoardAttachVO;
import com.board.domain.BoardVO;
import com.board.domain.Paging;
import com.board.mapper.BoardAttachMapper;
import com.board.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper boardMapper;
	private BoardAttachMapper boardAttachMapper;

	@Override
	public BoardVO get(Long bno) {
		return boardMapper.read(bno);
	}

	@Override
	public List<BoardVO> getList(Paging paging) {
		return boardMapper.getListWithPaging(paging);
	}
	
	@Transactional
	@Override
	public void add(BoardVO vo) {
		log.info("추가할 데이터 : " + vo);
		
		System.out.println("insert 전 : " + vo.getBno()); // 비어있음
		boardMapper.insertSelectKey(vo);
		System.out.println("insert 후 : " + vo.getBno()); // 생성된 시퀀스로 채워짐
		
		if(vo.getAttachList() == null || vo.getAttachList().size() <= 0) {
			return;
		}
		
		vo.getAttachList().forEach(attach -> {
			attach.setBno(vo.getBno());
			boardAttachMapper.insert(attach);
		});
		
		
	}
	
	@Transactional
	@Override
	public boolean remove(Long bno) {
		
		boardAttachMapper.deleteAll(bno);
		
		return boardMapper.delete(bno) == 1;
	}

	@Override
	public boolean modify(BoardVO vo) {
		
		boolean result = boardMapper.update(vo) == 1;
		
		if(result && vo.getAttachList() != null && vo.getAttachList().size() > 0) {
			boardAttachMapper.deleteAll(vo.getBno());
			
			vo.getAttachList().forEach(attach -> {
				attach.setBno(vo.getBno());
				boardAttachMapper.insert(attach);
			});
		}
		 
		return boardMapper.update(vo) == 1;
	}

	@Override
	public int getTotal(Paging paging) {
		
		return boardMapper.getTotal(paging);
	}

	@Override
	public List<BoardAttachVO> getAttachList(Long bno) {
		return boardAttachMapper.findByBno(bno);
	}
	
	
	

}
