package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;

public class MemberDao {
	/**
	 * 사용자 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		Member member = null;
		
//		String sql =
//				String.format("select id, name, adminyn, status, grade from member where id = '%s' and pw = '%s'"
//				, id, pw) ;
////		System.out.println("===== login() sql 구문: "+ sql +"===== ");
//		try (Connection conn = ConnectionUtil.getConnection();
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(sql)) {
//			
//			// 질의결과 결과집합을 member 객체에 담아준다.
//			if(rs.next()) {
//				
//				// id, pw는 매개변수에서 가져오기 때문에 또 get할 필요는 없음.
//				String name = rs.getString(2);
//				String adminYN = rs.getString(3);
//				String status = rs.getString(4);
//				String grade = rs.getString(5);
//				// pw은 노출 방지를 위해 ""처리 하였음.
//				member = new Member(id, "", name, adminYN, status, grade);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		String sql = "select id, name, adminyn, status, grade from member where id = '?' and pw = '?'";
		
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, member.getId());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return member;
	}

	/**
	 * 멤버 삽입
	 * @param member
	 * @return
	 */
	public int insert(Member member) {
		int res = 0;
		
		// 특정 컬럼의 값만 몇개 넣어서 insert하기
		String sql = String.format
				("insert into member (id, pw, name) values ('%s', '%s', '%s')"
				, member.getId(), member.getPw(), member.getName());
//		String sql = String.format	
//				("insert into member values ('%s', '%s', '%s', '%s', '%s', '%s')"
//						, member.getId(), member.getPw(), member.getName(), member.getAdminyn(), member.getStatus(), member.getGrade());
		
//		System.out.println(sql); --> 이렇게 sql문을 보면 오류 찾기에 유용하다.
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("멤버 등록 완료");
		return res;
	}
	

	/**
	 * id 중복 체크
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {
		String sql = "select * from member where id = '"+id+"'";
		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
					
			// id는 String이고, rs.next()는 boolean 타입이기 때문에 일단 비교 자체가 안된다.
			// boolean으로 flag를 만들지 않고 비교하고싶다면 ?
			if (rs.next()) {
				id = rs.getString(1);
				System.err.println("이미 사용중인 ID입니다.");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("사용 가능한 ID입니다");		
		 return true;

	}
	
	public boolean idCheck2(String id) {
		boolean res = false;
		String sql = "select * from member where id = '"+id+"'";
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			if(rs.next()) {
				System.out.println("이미 사용중인 ID입니다");		
				return !rs.next();
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("사용 가능한 ID입니다");		
		return res;
	}
	
	public boolean idCheck3(String id) {
		boolean res = false;
		
		String sql = String.format(
				"select * from member where id = '%s'",id);
		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			
			// rs.next = 결과집합이 있으면 true -> !rs.next를 반환
			return !rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return res;
	}
				
	
	/**
	 * 멤버 삭제
	 * @param id
	 * @return
	 */
	public int delete (String id) {
		int res = 0;
		String sql = "delete from member where id ='"+ id +"'";

		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("멤버 삭제 완료");
		return res;
	}
	
}














