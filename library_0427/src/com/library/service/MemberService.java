package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao(); 
	
	public Member login(String id, String pw) {
		Member meb = null;
		meb = dao.login(id, pw);
		return meb;
	}
}
