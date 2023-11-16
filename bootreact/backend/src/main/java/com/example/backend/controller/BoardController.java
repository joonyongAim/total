package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.Board;
import com.example.backend.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@PostMapping("/board")
	public ResponseEntity<?> newBoard(@RequestBody Board board) {
		
		boardService.insertBoard(board);
		
		return new ResponseEntity<>("글작성 완료", HttpStatus.OK);
	}
	
	@GetMapping("/board")
	public ResponseEntity<?> getBoardList() {
		List<Board> boardList = boardService.getBoardList();
		
		return new ResponseEntity<>(boardList, HttpStatus.OK);
	}
	
	@GetMapping("/board/{id}")
	public ResponseEntity<?> getBoard(@PathVariable int id) {
		
		Board board = boardService.getBoard(id);
		
		return new ResponseEntity<>(board, HttpStatus.OK);
	}
	
	@DeleteMapping("/board")
	public ResponseEntity<?> deleteBoard(@RequestParam int id) {
		
		boardService.deleteBoard(id);
		
		return new ResponseEntity<>(id + "번째 글삭제 완료", HttpStatus.OK);
	}
}
