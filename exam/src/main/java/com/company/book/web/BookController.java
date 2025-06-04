package com.company.book.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.book.service.BookService;
import com.company.book.service.BookVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/book/*")
@RequiredArgsConstructor
public class BookController {
	
	final BookService bookservice;
	
	// 기본 홈
    @RequestMapping(value = "/mainhome", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "mainhome";
    }
	
	@GetMapping("/list")
	public String getbooklist(BookVO book, Model model) {
		
		model.addAttribute("list", bookservice.getList(book));
				
		return "book/list";
	
	}
	
	// 등록 페이지
	@GetMapping("/register")
	public void register() {
		
	}
	
	// 등록 처리 후 목록 이동
	@PostMapping("/register")
	public String register(BookVO book, RedirectAttributes rttr){
		bookservice.insertbook(book);
		rttr.addFlashAttribute("result", book.getBook_no());
		return "redirect:list";
		
	}

}
