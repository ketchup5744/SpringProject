package com.rilla.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rilla.dao.MemberDAO;
import com.rilla.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO dao;

	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}

}