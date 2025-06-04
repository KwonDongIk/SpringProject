package com.company.book.mapper;

import java.util.List;

import com.company.book.service.BookVO;

public interface BookMapper {
	
	public List<BookVO> getList(BookVO book);
	
	public int insertbook(BookVO book);

}
