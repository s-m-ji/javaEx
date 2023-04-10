package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static void main(String[] args) {
		System.out.println(DBUtil.getConnection());
	}
	
	public static Connection getConnection() {

		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url,id,pw);
			
			conn.setAutoCommit(false); // 일괄적으로 커밋,롤백 가능하도록.
			
		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리를 확인해주세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("SQL 정보를 확인해주세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return conn;
	}

	public static void commit(Connection conn) {
		try {
			// conn이 널이 아니고, 닫힌것도 아니라면 -> 커밋해줘
			if(conn != null && !conn.isClosed()) conn.commit(); // if문 실행이 한 문장이라면 {} 생략하여 기입 가능
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
