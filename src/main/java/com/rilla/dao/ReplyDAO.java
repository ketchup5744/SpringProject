package com.rilla.dao;

import java.util.List;

import com.rilla.vo.ReplyVO;

public interface ReplyDAO {
	
	// 댓글 조회
	public List<ReplyVO> readReply(int bno) throws Exception;
	
	// 댓글 작성
	public void writeReply(ReplyVO vo) throws Exception;

}
