package com.yedam.board.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;
import com.yedam.board.service.CriteriaVO;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList(CriteriaVO cri){
		return boardMapper.getList(cri);
	}

	@Override
	public int insertboard(BoardVO board) {
		return boardMapper.insertboard(board);
	}

	@Override
	public int updateboard(BoardVO board) {
		return boardMapper.updateboard(board);
	}

	@Override
	public int deleteboard(Long bno) {
		return boardMapper.deleteboard(bno);
	}

	@Override
	public int insertSelectKey(BoardVO board) {
		return 0;
	}

	@Override
	public BoardVO findById(Long bno) {
		return boardMapper.findById(bno);
	}

	@Override
	public Long getTotal(CriteriaVO cri) {
		return boardMapper.getTotal(cri);
	}

}
