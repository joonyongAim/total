package com.example.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.board.domain.Post;
import com.example.board.service.PostService;

@Controller
public class BoardController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/")
	public String getPostList(Model model, @PageableDefault(size = 3, sort = "id", direction = Direction.DESC) Pageable pageable) {
//		Page<Post> page = postService.getPostList(pageable);
//		
//		System.out.println(page.getContent());
//		System.out.println("전체 페이지 수 : " + page.getTotalPages());
//		System.out.println("전체 항목 수 : " + page.getTotalElements());
//		System.out.println("현재 페이지 번호 : " + page.getNumber());
//		System.out.println("페이지당 항목 수 : " + page.getSize());
//		System.out.println("이전 페이지 존재 여부 : " + page.hasPrevious());
//		System.out.println("다음 페이지 존재 여부 : " + page.hasNext());
//		System.out.println("첫 페이지인지 ? : " + page.isFirst());
//		System.out.println("마지막 페이지인지 ? : " + page.isLast());
		
		model.addAttribute("postList", postService.getPostList(pageable));
		
		return "index";
	}
}
