package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.util.ConnectionUtil;
import com.library.vo.BookVo;

public class BookDao {
	
	public List<BookVo> getList(){
		
		List<BookVo> list = new ArrayList<>();
		
		try (Connection conn = ConnectionUtil.getConnection();
			 Statement stmt = conn.createStatement();){
		
			ResultSet rs = stmt.executeQuery("select no, title, author, isrent from book");
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				 
				BookVo book = new BookVo(no, title, author, isRent);
				list.add(book);
			}
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	
	public int insert(BookVo book) {
		
		int res = 0;
		try (	Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();	){
			
			String sql = String.format("insert into book (no, title, author, isrent) values (%d,'%s','%s','%s')", book.getNo(), book.getTitle(), book.getAuthor(), book.getRentYN());
			System.out.println(sql);
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			res = -1;
		}
		return res;
		
	}
	
	public int update(int no, String rentYN) {
		int res = 0;
		String sql = "update book set isRent=? where no = ?";
		
		try (	Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);	){
			
			// ?를 값으로 치환하는 역할
			pstmt.setString(1,rentYN);
			pstmt.setInt(2, no);
			// 쿼리 실행			
			res = pstmt.executeUpdate();


		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();

			res = -1;
		}
		return res;
	}

	public int delete(int no) {
		int res = 0;
		String sql = String.format("delete from book where no = ?");
		
		try (	Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);	){
			
			// ?를 값으로 치환하는 역할
			pstmt.setInt(1,no);
			// 쿼리 실행
			res = pstmt.executeUpdate();
			

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			res = -1;
		}
		return res;
		
	}

	/**
	 * 대여/반납 가능한 책인지 조회 합니다
	 * @param no
	 * @param isRent
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		boolean res = false;
		String sql = "select * from book where no = ? and isRent= ?";
		try(	Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);	){
			
			// ?를 매개값으로 치환
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			ResultSet rs = pstmt.executeQuery();
			res = rs.next() ? true : false;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		
		return res;
	}

}
