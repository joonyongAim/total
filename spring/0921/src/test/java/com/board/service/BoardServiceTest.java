package com.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTest {

	@Autowired
	private BoardService boardService;
	
	@Test
	public void removeTest() {
		log.info(boardService.remove((long) 9));
	}
	
//	@Test
//	public void modifyTest() {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setBno((long) 1);
//		vo.setTitle("서비스수정");
//		vo.setContent("서비스테스트");
//		vo.setWriter("서비스");
//		
//		log.info(boardService.modify(vo));
//	}
	
//	@Test
//	public void readTest() {
//		log.info(boardService.get((long) 2));
//	}
	
//	@Test
//	public void getListTest() {
//		boardService.getList().forEach(b -> log.info(b));
//	}
	
//	@Test
//	public void addTest() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("add테스트");
//		vo.setContent("서비스add테스트");
//		vo.setWriter("add");
//		
//		boardService.add(vo);
//		
//		log.info("추가된 레코드 bno : " + vo.getBno());
//	}
	
}
