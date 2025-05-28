package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	
//	List<BoardVO> findAll(SearchVO search);
//	List<Map<String,Object>> findAlltoMap();
//	List<BoardVO> getCount();
	
	public List<BoardVO> getList();
	
	public int insertboard(BoardVO board);
	public int insertSelectKey(BoardVO board);
	
	public BoardVO findById(Long bno);
	
	public int updateboard(BoardVO board);
	public int deleteboard(Long bno);
}
