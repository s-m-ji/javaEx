package com.library.service;

import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	
	public void memberListPrint() {
		List<MemberVo> list = memberDao.memberListPint();
		System.out.println("--- 유저목록조회 ---");
		for(MemberVo m : list) {
			System.out.println(m.toString());
		}
	}
	
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo != null) {
			System.out.println("***"+ memberVo.getName() +"***");
			return memberVo;
		} else {
			System.err.println("로그인 정보가 틀렸거나, 없는 계정임");
			return null;
		}
	}

	public int insertM(MemberVo memberVo) {
		int res = memberDao.insertM(memberVo);
		if(res>0) {
			System.out.println("유저 등록 완료");
		} else {
			System.out.println("등록 오류");
		}
		return 0;
	}

	public void deleteM(String id) {
		int res = memberDao.deleteM(id);
		if(res>0) {
			System.out.println("유저 삭제 완료");
		} else {
			System.out.println("삭제 오류");
		}
	}
}
