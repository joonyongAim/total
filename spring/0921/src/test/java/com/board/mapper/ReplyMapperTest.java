package com.board.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.Paging;
import com.board.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTest {
	
	@Autowired
	private ReplyMapper replyMapper;
	
	private Long[] bnoArr = { 137L, 136L, 135L, 134L, 133L };
	
	@Test
	public void list() {
		
		List<ReplyVO> list = replyMapper.getListWithPaging(new Paging(), bnoArr[0]);
		
		list.forEach(re -> log.info(re));
	}
	
//	@Test
//	public void update() {
//		ReplyVO vo = new ReplyVO();
//		
//		vo.setRno(3L);
//		vo.setReply("변경확인테스트");
//		
//		replyMapper.update(vo);
//	}
	
//	@Test
//	public void delete() {
//		replyMapper.delete(5L);
//	}
	
//	@Test
//	public void read() {
//		ReplyVO vo = replyMapper.read(5L);
//		
//		log.info(vo);
//	}
	
//	@Test
//	public void insert() {
//		for(int i=0; i<10; i++) {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 내용 테스트 " + i);
//			vo.setReplyer("댓글작성자" + i);
//			
//			replyMapper.insert(vo);
//		}
//	}
}
