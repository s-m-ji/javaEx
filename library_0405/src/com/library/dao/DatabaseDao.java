package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getList() {
		
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet res = stmt.executeQuery("select * from book order by no desc");
			while(res.next()) {
				int no = res.getInt("no");
				String title = res.getString("title");
				String author = res.getString("author");
				
				// Y,N (조건)? 참일때 반환값 : 거짓일때 반환갓
				String irs = res.getString("isRent");
				boolean isRent = ("Y".equals(irs))?true:false;
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
		
			DBUtil.closeConnention(conn, stmt, res);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		int rs =0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			rs = stmt.executeUpdate("update book set no = 1 where book.no="+no); // TODO 모든 책을 수정할 수 있는 쿼리문이어야한다면 ?
			System.out.println(rs + "건 수정 처리되었음db");
			DBUtil.closeConnection(conn, stmt);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
