package com.yedam.board;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration({"file:src/main/resources/spring/*-context.xml"})
public class BoardMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	
	//@Test
	public void testGetTime() {
		boardMapper.getList(null).forEach(board->
									log.info(board));
	}
	
	@Test
	public void insertboard() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로운 작성글");
		board.setContent("새로 작성한 내용");
		board.setWriter("newbie");
		
		boardMapper.insertboard(board);
		
		log.info(board);
	}

//	//@Test
//	public void insertboard() {
//		BoardVO board = BoardVO.builder()
//				.bno((long) 3)
//				.title("몽골 여행")
//				.content("7월이 좋아요")
//				.writer("user03")
//				.regdate(new Date())
//				.updateDate(new Date())
//				.build();
//		int result = boardMapper.insertboard(board);
//		System.out.println(result);
//	}
//	
//	//@Test
//	public void updateboard() {
//		BoardVO board = new BoardVO();
//		board.setBno((long) 3);
//		board.setContent("아무때나 좋아요.");
//		int result = boardMapper.updateboard(board);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void delete() {
//		int result = boardMapper.deleteboard((long) 1);
//		System.out.println(result);
//	}
}
