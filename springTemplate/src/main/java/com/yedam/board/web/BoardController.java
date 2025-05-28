package com.yedam.board.web;

import org.springframework.stereotype.Controller;
/**
 * 작성일자 작성자 수정내용
 * 250525  홍길동 최초작성
 * 250526  홍김동 페이징 
 */
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
	
	final BoardService boardService;
	
	/*
	 * 게시글 목록
	 * @param model : 검색
	 * @return
	 */
	@GetMapping("/list")
	public String getMethodName(Model model) {
		
		model.addAttribute("list", boardService.getList());
		return "board/list";
	
	}
	
	// 등록 페이지
	@GetMapping("/register")
	public void register() {
		
	}
	
	// 등록 처리 후 목록 이동
	@PostMapping("/register")
	public String register(BoardVO vo){
		boardService.insertboard(vo);
		return "redirect:list";
		
	}
	
	// 단건조회
	@GetMapping("get")
	public void get (@RequestParam("bno")  Long bno, Model model) {
		model.addAttribute("board", boardService.findById(bno));
	}
	
	// 수정 페이지 이동
	@GetMapping("modify")
	public void modify (@RequestParam("bno")  Long bno, Model model) {
		model.addAttribute("board", boardService.findById(bno));
	}
	
	// 수정처리
	@PostMapping("modify")
	public String modify (BoardVO board, RedirectAttributes rttr) {
		boardService.updateboard(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:get";
	}
	
	// 삭제처리
	@GetMapping("remove")
	public String remove(@RequestParam("bno") Long bno) {
		boardService.deleteboard(bno);
		return "redirect:list"; // 상대경로 표시
	}

}
