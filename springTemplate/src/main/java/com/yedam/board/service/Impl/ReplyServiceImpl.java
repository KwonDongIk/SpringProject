package com.yedam.board.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.CriteriaVO;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ReplyServiceImpl implements ReplyService{
	
	private ReplyMapper replyMapper;

	@Override
	public int register(ReplyVO vo) {
		// TODO Auto-generated method stub
		return replyMapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modify(ReplyVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Long rno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReplyVO> getList(CriteriaVO cri, Long bno) {
		// TODO Auto-generated method stub
		return replyMapper.getList(cri, bno);
	}

}
