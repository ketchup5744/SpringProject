package com.rilla.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rilla.dao.BoardDAO;
import com.rilla.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

}