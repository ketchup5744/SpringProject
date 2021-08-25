package com.rilla.service;

import java.util.List;

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
	
	// 게시물 목록 조회
		@Override
		public List<BoardVO> list() throws Exception {

			return dao.list();
		}

}