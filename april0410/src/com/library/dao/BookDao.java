package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtill;
import com.library.vo.BookVo;

public class BookDao {
	public List<BookVo> bookListPrint(){
		List<BookVo> list = new ArrayList<>();
		String sql = "select * from book order by bookNo";
		try (Connection conn = DBUtill.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				int bookNo = rs.getInt("bookNo");
				String title = rs.getString("bookTitle");
				String author = rs.getString("bookAuthor");
				String rentYN = rs.getString("bookRentYN");
				BookVo bookVo = new BookVo(bookNo, title, author, rentYN);
				list.add(bookVo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int insertB(BookVo bookVo) {
		String sql = "insert into book values (?,?,?,?)";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getAuthor());
			pstmt.setString(4, bookVo.getRentYN());
			int rs = pstmt.executeUpdate();
			return rs;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteB(int bookNo) {
		String sql = "delete from book where bookNo=?";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setInt(1, bookNo);
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		}

	public int updateB(int bookNo, String string) {
		String sql = "update book set bookRentYN=? where bookNo=?";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, string);
			pstmt.setInt(2, bookNo);
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public boolean status(int bookNo, String string) {
		String sql = "select * from book where bookNO=? and bookRentYN=?";
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, bookNo);
			pstmt.setString(2, string);
			ResultSet res = pstmt.executeQuery();
			return res.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


}
