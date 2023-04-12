package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.dao.conn.DBUtill;

public class Ex4 {
	public static void main(String[] args) {
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("select sysdate from dual");) {
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("현재 날짜: "+rs.getString(1));
			}
		} catch (SQLException e) {
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
}
