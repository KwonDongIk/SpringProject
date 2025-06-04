package com.company.book.service;

import java.util.List;

public interface BookService {
	
	public List<BookVO> getList(BookVO book);
	
	public int insertbook(BookVO book);

}
