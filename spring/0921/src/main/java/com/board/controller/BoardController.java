package com.board.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.domain.BoardAttachVO;
import com.board.domain.BoardVO;
import com.board.domain.PageDTO;
import com.board.domain.Paging;
import com.board.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping(value = "/getAttachList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<BoardAttachVO>> getAttachList(Long bno) {
		return new ResponseEntity<>(boardService.getAttachList(bno), HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public void list(Model model, Paging paging) {
		// DB에서 Board테이블에 전체 레코드를 조회해서 보내줘야함
		log.info("전체 레코드 조회");
		// 전체 조회한 결과를 리턴
		List<BoardVO> list = boardService.getList(paging);
		
		int total = boardService.getTotal(paging);
		
		// 리턴받은걸 클라이언트에게 넘겨야함
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", new PageDTO(paging, 123));
		
	}
	
	@PostMapping("/add")
	@PreAuthorize("isAuthenticated()")
	public String add(BoardVO board, RedirectAttributes attr) {
		
		boardService.add(board);
		
		attr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify" })
	public void get(@RequestParam("bno")Long bno, Model model, @ModelAttribute("paging") Paging paging) {
		
//		BoardVO board = boardService.get(bno);
		
		model.addAttribute("board", boardService.get(bno));
		
	}
	
	@PostMapping("/modify")
	@PreAuthorize("principal.username == #board.writer")
	public String modify(BoardVO board, RedirectAttributes attr, Paging paging) {
		
		if(boardService.modify(board)) {
			attr.addFlashAttribute("result", "수정 완료");
		} else {
			attr.addFlashAttribute("result", "수정 실패");
		}
		
		attr.addFlashAttribute("paging", paging);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/remove")
	@PreAuthorize("principal.username == #writer")
	public String remove(Long bno, RedirectAttributes attr, Paging paging, String writer) {
		
		List<BoardAttachVO> attachList = boardService.getAttachList(bno);
		
		if(boardService.remove(bno)) {
			deleteFile(attachList);
			attr.addFlashAttribute("result", "삭제 성공");
		} else {
			attr.addFlashAttribute("result", "삭제 실패");
		}
		
		attr.addFlashAttribute("paging", paging);
		
		return "redirect:/board/list";
	}
	
	public void deleteFile(List<BoardAttachVO> attachList) {
		
		if(attachList == null || attachList.size() == 0) {
			return;
		}
		
		attachList.forEach(attach -> {
			
			try {
				Path file = Paths.get("d:\\upload\\" + attach.getUploadPath() + "\\" + attach.getUuid() + "_" + attach.getFileName());
				Files.delete(file);
				
				if(Files.probeContentType(file).startsWith("image")) {
					Path thumbnail = Paths.get("d:\\upload\\" + attach.getUploadPath() + "\\s_" + attach.getUuid() + "_" + attach.getFileName());
					
					Files.delete(thumbnail);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
		
	}
	
	@GetMapping("/add")
	@PreAuthorize("isAuthenticated()")
	public void addPage() {
		
	}
}
