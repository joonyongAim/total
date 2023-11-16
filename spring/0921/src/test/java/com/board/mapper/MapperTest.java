package com.board.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.BoardVO;
import com.board.domain.Paging;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTest {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void searchTest() {
		Paging paging = new Paging();
		
		paging.setKeyword("a");
		paging.setType("TCW");
		
		log.info(mapper.getTotal(paging));
		
//		List<BoardVO> list = mapper.getListWithPaging(paging);
//		
//		list.forEach(b -> log.info(b));
	}
	
//	@Test
//	public void testPaging() {
//		Paging paging = new Paging(3, 5);
//		
//		List<BoardVO> list = mapper.getListWithPaging(paging);
//		
//		list.forEach(b -> log.info(b));
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("수정테스트 제목");
//		vo.setContent("수정테스트 내용");
//		vo.setWriter("수정테스트");
//		vo.setBno((long) 7);
//		
//		mapper.update(vo);
//		
//		log.info(vo);
//	}
	
//	@Test 
//	public void testDelete() {
//		Long a = (long)8;
//		int vo = mapper.delete(a);
//		
//		log.info(vo);
//	}
	
//	@Test 
//	public void testRead() {
//		Long a = (long)5;
//		BoardVO vo = mapper.read(a);
//		
//		log.info(vo);
//	}
	
//	@Test
//	public void testInsert() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("mapper테스트 제목");
//		vo.setContent("mapper테스트 내용");
//		vo.setWriter("mapper테스트");
//		
//		mapper.insertSelectKey(vo);
//		
//		log.info(vo);
//		
//	}
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(b -> log.info(b));
//	}
	
}
