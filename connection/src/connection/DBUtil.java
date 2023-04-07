package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// 커넥션을 반환하는 메소드
	
	/**
	 * DB 커넥션은 생성하여 반환합니다.
	 * @return
	 */
	public static Connection getConnection() {
		// 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn = null; // 메소드 리턴으로 conn을 쓰기 위해 try문 밖에서 선언해주었음.
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);

			// 롤백하지않고 커넥션이 종료되면 커밋된다. -> 커넥션이 종료될 때 커밋.
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeConnention(Connection conn, Statement stmt, ResultSet rs) {
		try { // null이 아니고, 닫지히도 않았다면 .close() 해달라고 하는 것.
//			if(conn != null && !conn.isClosed()) conn.commit();
			if(rs !=null && !rs.isClosed()) rs.close();
			if(stmt !=null && !stmt.isClosed()) stmt.close();
			if(conn !=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) conn.commit();
			if(stmt !=null && !stmt.isClosed()) stmt.close();
			if(conn !=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

















