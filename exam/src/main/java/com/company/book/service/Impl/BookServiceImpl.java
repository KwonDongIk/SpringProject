package com.company.book.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.book.mapper.BookMapper;
import com.company.book.service.BookService;
import com.company.book.service.BookVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
	
	final BookMapper bookMapper;

	@Override
	public List<BookVO> getList(BookVO book) {
		
		return bookMapper.getList(book);
	}

	@Override
	public int insertbook(BookVO book) {
		
		return bookMapper.insertbook(book);
	}
	
	

}
