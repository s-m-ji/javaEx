package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;


/**
 * DB 입,출력 : 데이터베이스에서 정보를 조회한다.
 * @author user
 *
 */
public class BookDao {
	public List<BookVo> getList(){
		List<BookVo> list = new ArrayList<>();
		
		String sql = "select * from book order by bookNO";
		
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery(sql);){
			while(res.next()) {
				int bookNO = res.getInt("bookNo");
				String bookTitle = res.getString("bookTitle");
				String bookAuthor = res.getString("bookAuthor");
				String bookRentYN = res.getString("bookRentYN");
				
				BookVo bookvo = new BookVo(bookNO, bookTitle, bookAuthor, bookRentYN);
				list.add(bookvo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public int insertBook(BookVo bookVo) {
		String sql ="insert into book values(?, ?, ?, ?)";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo.getBookTitle());
			pstmt.setString(3, bookVo.getBookAutuor());
			pstmt.setString(4, bookVo.getBookRentYN());
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteBook(int bookNo) {
		String sql = "delete from book where bookNo = "+bookNo;
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			int res = stmt.executeUpdate(sql);
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	
	/**
	 * 대여/반납이 가능한 상태라면 true, 아니면 false
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		String sql = "select * from book where bookNo =? and bookRentYN =?";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public int updateBook(int bookNo, String rentYN) {
		String sql = "update book set bookRentYN = ? where bookNo = ?";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, bookNo);
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}










