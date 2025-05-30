package com.yedam.board.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.service.CriteriaVO;
import com.yedam.board.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration({"file:src/main/resources/spring/*-context.xml"})
public class ReplyMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper replyMapper;
	
	//@Test
	public void testCreate2() {
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(11L);
		vo.setReply("댓글 테스트");
		vo.setReplyer("댓글 테스트 작성자");
		
		replyMapper.insert(vo);
		
	}
	
	//@Test
	public void testRead() {
		Long targetRno = 5L;
		ReplyVO vo = replyMapper.read(targetRno);
		log.info(vo);
	}
	
	@Test
	public void testList() {
		CriteriaVO cri = new CriteriaVO();
		List<ReplyVO> replies = replyMapper.getList(null, 11L);
		replies.forEach(reply -> log.info(reply));
	}

}
