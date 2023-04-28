package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;

/**
 * DB에 연결해서 데이터 입/출력을 처리
 * @author user
 *
 */

public class RentDao {
	// 도서 대여 상태 조회 select 
	// -> 도서 번호를 매개변수 / 대여여부 String 반환
	// 대여 insert
	// -> id, 도서번호, 대여일은 오늘 / int 반환
	// 반납 update
	// -> 도서번호, 반납일은 오늘 / int 반환
	
	
	public static void main(String[] args) {
		RentDao rDao = new RentDao();
		// 대여여부 테스트
		System.out.println(rDao.getRentYN(1));
		
		// 입력테스트
		System.out.println(rDao.insert("test", 3));
		
		// 반납테스트
		System.out.println(rDao.update(3));		
	}
	
	/**
	 * 도서의 대출 여부를 확인
	 * @param no
	 * @return 대출중 : Y
	 * 			대출가능 : N
	 */
	public String getRentYN(int no) {
		// 대여여부가 반납이면 기본 N으로 기록되도록
		String rentYN = "N";
		// 각각 책 번호를 조회하여 대여중인 것만 조회 -> 대여가능한건 N임
		
		// 문자열을 + 로 이어오는 과정에서 메모리가 계속 소진되기때문에 효율을 위해서 StringBuffer를 써서 연결하기도 한다. 
		// -> 선생님 코드 참고 append()에서 연결해올때는 꼭 문자열 앞/뒤 어디든 공백을 하나 이상 만들어주라고하심..  
		String sql = "SELECT 대여여부 FROM 대여 WHERE 도서번호 = ? AND 대여여부 = 'Y'";
		
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			// 파라미터 셋팅 : ? 순서대로 입력
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				rentYN = rs.getString("대여여부"); TODO 이렇게 해도 될까??
				rentYN = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rentYN;
	}
	
	
	/**
	 * 도서 대여
	 * @param id
	 * @param no
	 * @return
	 */
	public int insert(String id, int no) {
		int res = 0;
		
		String sql = "INSERT INTO 대여 VALUES "
									+ "(SEQ_대여.NEXTVAL, ?, ?, DEFAULT, SYSDATE, NULL, SYSDATE+7, NULL)";
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, id);
			pstmt.setInt(2, no);
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	
	public int update(int no) {
		int res = 0;
		String sql = "UPDATE 대여 SET 반납일 = SYSDATE, 대여여부='N' WHERE 도서번호=?";
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
}
