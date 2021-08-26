package com.rilla.service;

import java.util.List;

import com.rilla.vo.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> readReply(int bno) throws Exception;

}
