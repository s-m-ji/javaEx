package com.library.service;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao mDao = new MemberDao(); 
	
	public Member login(String id, String pw) {
		Member member = null;
		member = mDao.login(id, pw);
		
		if(member == null) {
			System.err.println("id/pw를 확인해주세요.");
		} else {
			return member;
		}
		return member;
	}
	
	public List<Member> getList() {
		List<Member> list = mDao.getList();
		for(Member m : list) {
			System.out.println(m);
		}
		return list; 
	}
	
	
	public void insertM(String id, String pw, String name
					, String adminyn) {
		
		boolean idC = mDao.idCheck3(id);
		if(idC) {
			Member member = new Member(id, pw, name, adminyn, null, null);
			int res = mDao.insert(member);
			if(res>0) {
				System.out.println(res + "건 입력되었습니다.");
				System.out.println("***** 사용자 등록 완료 *****");
				getList();
			} else {
				System.err.println("!!!!! 사용자 등록 실패 !!!!!");
				System.err.println("관리자에게 문의해주세요.");
			}
		} else {
			System.err.println("이미 사용중인 id입니다. 다른 id를 입력해주세요.");
		}
	}

	
	public void deleteM(String idX) {
		int res = mDao.delete(idX);
		if(res>0) {
			System.out.println(res + "건 삭제되었습니다.");
			System.out.println("***** 사용자 삭제 완료 *****");
			getList();
		} else {
			System.err.println("!!!!! 사용자 삭제 실패 !!!!!");
			System.err.println("관리자에게 문의해주세요.");
		}
	}

	
	public boolean idCheck(String id) {
		boolean res = mDao.idCheck3(id);
		if(!res) {
			System.out.println("아이디가 중복되었군뇽..얘 미뇽앙..");
		}
		return res;
	}


}
