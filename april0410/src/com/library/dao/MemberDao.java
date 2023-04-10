package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtill;

public class MemberDao {
	public MemberVo login(String id, String pw) {
		String sql = "select * from member where memberID=? and memberPw=?";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("memberName");
				String adminYN = rs.getString("memberAdminYN");
				MemberVo memberVo = new MemberVo(id, "", name, adminYN);
				return memberVo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.err.println("계정 정보 재확인");
		return null;
	}
	
	public List<MemberVo> memberListPint(){
		List<MemberVo> list = new ArrayList<>();
		String sql = "select * from member";
		try (Connection conn = DBUtill.getConnection();
				Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("memberId");
				String pw = rs.getString("memberPw");
				String name = rs.getString("memberName");
				String adminYN = rs.getString("memberAdminYN");
				
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				list.add(memberVo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int insertM(MemberVo memberVo) {
		String sql = "insert into member values(?,?,?,?)";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			memberListPint();
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteM(String id) {
		String sql = "delete from member where memberId=?";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, id);
			int res = pstmt.executeUpdate();
			memberListPint();
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
