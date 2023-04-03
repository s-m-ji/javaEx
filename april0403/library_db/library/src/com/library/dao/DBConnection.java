package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn = null;
	/**  DB 접속 정보 */
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "omi";
	private static final String pwd = "1234";
	
	/** DB에 연결및 connection을 생성 */
	private static void DBConnection() {
		try {
			// OracleDriver 클래스 호출 -> odbc 라이브러리가 없다면 오류가 발생
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
//			statement = conn.createStatement();
//			System.out.println("Statement 생성 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void commitConnection() {
		try {
			System.out.println("커밋");
			conn.commit();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void rollbackConnection() {
		try {
			System.out.println("롤백");
			conn.rollback();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if(conn == null) {
			DBConnection();
		}
		
		System.out.println("connection 요청");
		return conn;
	}
	
//	public static void main(String[] args) {
//		Book book = new Book("자바의정석", "남궁성", "false",1);
//		Connection conn = DBConnection.getConnection();
//		try {
//			String sql = String.format("insert into book values('%s', '%s', '%s', (select max(no) from book))"
//											, book.getTitle()
//											, book.getAuthor()
//											, book.isRent());
//					
//			Statement statement = conn.prepareStatement(sql);
//			boolean res = statement.execute(sql);
//			System.out.println(res);
//			
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
}