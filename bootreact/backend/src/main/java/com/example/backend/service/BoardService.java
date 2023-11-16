package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.domain.Board;
import com.example.backend.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}
	
	public List<Board> getBoardList() {
		return boardRepository.findAllByOrderByIdDesc();
	}
	
	public Board getBoard(int id) {
		return boardRepository.findById(id).get();
	}
	
	public void deleteBoard(int id) {
		boardRepository.deleteById(id);
	}
	
}
