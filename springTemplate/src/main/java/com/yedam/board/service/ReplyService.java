package com.yedam.board.service;

import java.util.List;

public interface ReplyService {
	public int register(ReplyVO vo);
	public ReplyVO get(Long rno);
	public int modify(ReplyVO vo);
	public int remove(Long rno);
	public List<ReplyVO> getList(CriteriaVO cri, Long bno);
	//public ReplyVO getListPage(CriteriaVO cri, Long bno);
}
