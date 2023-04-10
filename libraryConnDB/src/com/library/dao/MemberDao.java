package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtil;

public class MemberDao {
	
	public MemberVo login(String id, String pw) {
		
		// 매개변수를 ?로 입력
		String sql = "select * from member where memberId = ? and memberPw = ?";
		
		// 매개변수 정보가 정상적으로 넘어왔는지 확인
		System.out.println("ID: "+id);
		System.out.println("PW: "+pw);
		
		
		try (Connection conn = DBUtil.getConnection();
				// prepareStatement : 준비된 정보를 가져온다
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
				// n번째 ?에 어떤 값이 들어가는지 설정
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				
				ResultSet res = pstmt.executeQuery();
				
				if(res.next()) {
					String name = res.getString("memberName");
					String adminYN = res.getString("memberAdminYN");
					
					// pw는 공백으로 넣어주었음..!
					MemberVo memberVo = new MemberVo(id, "", name, adminYN);
					return memberVo;
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// id,pw가 일치하는 사용자를 찾을 수 없음
		System.err.println("계정 정보를 다시 확인해주세요.");
		return null;
	}

	public List<MemberVo> getList() {
		List<MemberVo> list = new ArrayList<>();
		String sql = "select * from member";
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();) {
				ResultSet res = stmt.executeQuery(sql);
				while(res.next()) {
					String id = res.getString("memberId");
					String pw = res.getString("memberPw");
					String name = res.getString("memberName");
					String adminYN = res.getString("memberAdminYN");
					
					MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
					list.add(memberVo);
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 사용자의 정보를 DB에 등록합니다.
	 * @param memberVo
	 * @return
	 */
	public int insertMember(MemberVo memberVo) {
		String sql ="insert into member values (?, ?, ?, ?)";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			getList();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	

	/**
	 * DB에 등록된 사용자 정보를 삭제합니다.
	 * @param memberId
	 * @return
	 */
	
	/* createStatement 
	 * - 쿼리 자체를 String 문자열로 넣어주기 때문에
	 *  문자가 값으로 들어가는 경우 ''처리를 해줘야 한다.
	 * 
		prepareStatement : Statement 클래스보다 기능이 향상된 클래스
		- 코드의 안정성과 가독성이 높다
		- 인자 값으로 전달이 가능함
		- 매개변수를 ?로 설정 (?에 ''처리를 하지 않는다.)
		setString(index, 값); 
		setInt(index, 값);
		
		=> 둘 중 적합한 것으로 선택하여 사용하면 된다.
	*/

	public int deleteMember(String memberId, String memberPw) {
		String sql = "delete from member where memberId = '"+memberId+"' and memberPw = '"+memberPw+"'";
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			int res = stmt.executeUpdate(sql);
			getList();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}	

}










