package com.rilla.dao;

import java.util.List;

import com.rilla.vo.ReplyVO;

public interface ReplyDAO {
	
	// 댓글조회
	public List<ReplyVO> readReply(int bno) throws Exception;

}
