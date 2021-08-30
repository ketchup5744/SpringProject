package com.rilla.dao;

import com.rilla.vo.MemberVO;

public interface MemberDAO {

	// 회원가입
	public void register(MemberVO vo) throws Exception;
}