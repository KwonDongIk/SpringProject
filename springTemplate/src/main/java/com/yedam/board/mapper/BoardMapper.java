package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;

public interface BoardMapper {
	
	
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
