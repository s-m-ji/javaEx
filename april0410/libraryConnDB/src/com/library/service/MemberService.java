package com.library.service;

import java.sql.SQLException;

import com.library.dao.MemberDao;
import com.library.vo.MemberVo;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	/**
	 * 로그인
	 * id, pw를 입력받아 사용자 이름을 조회 합니다.
	 * 
	 * @param id
	 * @param pw
	 * @return
	 * @throws SQLException
	 */
	public MemberVo login(String id, String pw) throws SQLException {
		
		MemberVo member = dao.login(id, pw);
		if( member != null ){
			System.out.println(member.getName() + "님 환영합니다.");
			return member;
		} else {
			return null;
		}
		
	}

	public int insertMember(String id, String pw, String name, String adminYN) {
		MemberVo member = new MemberVo(id, pw, name, adminYN);
		int res=0;
		try {
			res = dao.insertMember(member);
		
			if(res>0) {
				System.out.println("등록 되었습니다.");
			} else {
				System.out.println("등록중 오류가 발생 했습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int deleteMember(String id) {
		
		int res=0;
		try {
			res = dao.deleteMember(id);
			
			if(res>0) {
				System.out.println("등록 되었습니다.");
			} else {
				System.out.println("등록중 오류가 발생 했습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	
}
