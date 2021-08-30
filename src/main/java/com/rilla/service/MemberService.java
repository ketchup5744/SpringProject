package com.rilla.service;

import com.rilla.vo.MemberVO;

public interface MemberService {

	public void register(MemberVO vo) throws Exception;

	public MemberVO login(MemberVO vo) throws Exception;

	public void memberUpdate(MemberVO vo) throws Exception;

}