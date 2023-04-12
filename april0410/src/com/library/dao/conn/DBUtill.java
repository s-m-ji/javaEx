package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtill {
	
	public static void main(String[] args) {
//		String sql = "select sysdate from dual";
//		
//		try(Connection conn = DBUtill.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);) {
//			ResultSet rs = pstmt.executeQuery();
//			if(rs.next()) {
//				System.out.println("현재 날짜: " + rs.getString(1));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("select sysdate from dual");) {
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("현 시각 알림: "+rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
//	public static Connection getConnection2() {
//		Connection conn = null;
//		
//		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//		String id = "orauser";
//		String pw = "1234";
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(url,id,pw);
//			conn.setAutoCommit(false);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return conn;
//	}

	public static void commit(Connection conn) {
		try {
			if(conn != null && conn.isClosed()) conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	public static void close(Connection conn, Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(rs != null && !rs.isClosed()) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
