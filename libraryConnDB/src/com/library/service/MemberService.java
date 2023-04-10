package com.library.service;

import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	
	public void getList() {
		List<MemberVo> list = memberDao.getList();
		System.out.println("===== 사용자 목록 조회 =====");
		for(MemberVo member : list) {
			System.out.println(member.toString());
		}
		System.out.println(); // 개행용
	}
	
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회합니다.
	 * @param id
	 * @param pw
	 * @return
	 */
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo != null) {
			System.out.println(); // 개행용
			System.out.println("***** "+memberVo.getName()+"님 환영합니다. *****");
			System.out.println(); // 개행용
			return memberVo;
			
		} else {
			System.err.println("ID/PW가 일치하지 않거나, 없는 계정입니다.");
			return null;
		}
		
	}

	/**
	 * 사용자 등록
	 * @param memberVo
	 */
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0){
			System.out.println("사용자 등록되었습니다.");
		} else {
			System.err.println("사용자 등록 중 요류가 발생했습니다.");
		}
	}

		
	public void deleteMember(String id, String pw) {
		// 사용자 조회 먼저 해서 일치하지 않는 정보라면 해당 메세지를 출력할 수도 있음.
		
		int res = memberDao.deleteMember(id,pw);
			if(res>0) {
				System.out.println("사용자 삭제되었습니다.");
			} else {
				System.err.println("사용자 삭제 중 오류가 발생했습니다.");
			}
		}
	
}







