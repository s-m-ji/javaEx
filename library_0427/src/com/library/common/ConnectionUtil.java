package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 생성하여 반환합니다.
 * @author sm.ji (보통 내가 만든 클래스는 이렇게 본인의 이니셜을 기입해둔다구..)
 *
 */
public class ConnectionUtil {
	
	/**
	 * DB Connection을 반환합니다.
	 * @return Connection
	 */
	public static Connection getConnection() {
		// 접속정보 (ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = " LIBRARY"; 
		String pw = "1234";
		
		Connection conn = null;
		try { 
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성 
			conn = DriverManager.getConnection(url,id,pw);
			// System.out.println(conn); 		-> 연결 확인 용도
			// System.out.println("프로그램 종료"); -> 실행 확인 용도
			
			// 커넥션이 안 닫혔으면 닫아줘잉 : 자원 반납
			// if(!conn.isClosed()) conn.close(); 
			// -> getConnection 메소드에서 conn을 리턴값으로 두기 위해 주석처리	
			
			// 트랜잭션 처리를 위해 자동 커밋을 false로 설정
			// 작업이 완료되지 않았을 때 commit되지말라고 하는 것
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 다시 확인해줘잉");
			System.err.println(e.getMessage());
			e.printStackTrace(); 
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 롤백
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("conn.close() 실패");
			e.printStackTrace();
		}; 
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if (stmt != null && !stmt.isClosed()) stmt.close();
			if (conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close() && conn.close() 실패");
			e.printStackTrace();
		}; 
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed()) rs.close();
			if (stmt != null && !stmt.isClosed()) stmt.close();
			if (conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close() && stmt.close() && conn.close() 실패");
			e.printStackTrace();
		}; 
	}
	
		
	public static void main(String[] args) {
		
	}
}











