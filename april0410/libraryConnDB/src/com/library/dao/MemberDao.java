package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.util.ConnectionUtil;
import com.library.vo.MemberVo;

public class MemberDao {
	public MemberVo login(String id, String pw) throws SQLException {
		
		// close가 없으면 연결을 끊지 않고 계속 유지하고 있음
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select id, name, adminYN from member where id=? and pw=?");
		
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString(2);
			String adminYN = rs.getString(3);
			MemberVo member = new MemberVo(id, "", name, adminYN);
			
			ConnectionUtil.closeConnection(conn, pstmt, rs);
			return member;
		} else {
			return null;
		}
		
	
	}

	public int insertMember(MemberVo member) throws SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into member values (?, ?, ?, ?)");
		pstmt.setString(1, member.getId());
		pstmt.setString(2, member.getPw());
		pstmt.setString(3, member.getName());
		pstmt.setString(4, member.getAdminYN());
		int res = pstmt.executeUpdate();
		
		ConnectionUtil.closeConnection(conn, pstmt);
		
		return res;
	}
	
	public int deleteMember(String id) throws SQLException {
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("delete from member where id=?");
		pstmt.setString(1, id);
		int res = pstmt.executeUpdate();
		
		ConnectionUtil.closeConnection(conn, pstmt);
		
		return res;
	}
}
