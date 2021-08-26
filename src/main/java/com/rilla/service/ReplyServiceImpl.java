package com.rilla.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rilla.dao.ReplyDAO;
import com.rilla.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Inject
	private ReplyDAO dao;
	
	// 댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return dao.readReply(bno);
	}

	// 댓글 작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);
	}

}
