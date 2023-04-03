package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class BookDatabaseDao implements Dao {

	@Override
	public List<Book> getBookList() {
		Connection conn = DBConnection.getConnection();
		Statement statement = null;
		ResultSet rs = null;	
		List<Book> bookList = null;
		
		try {
			statement = conn.createStatement();
			
			String sql = String.format("select * from book");
					
			rs = statement.executeQuery(sql);
			
			bookList = new ArrayList<>();
			while(rs.next()) {
				
				Book book = new Book(
								rs.getInt("no")
								,rs.getString("title")
								, rs.getString("author")
								, rs.getString("isrent")
							);
				
				bookList.add(book);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
		return bookList;
	}

	@Override
	public boolean insertBook(Book book) {
		boolean res = false;
		Connection conn = DBConnection.getConnection();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			
			String sql = String.format("insert into book values('%s', '%s', '%s', (select max(no)+1 from book))"
					, book.getTitle()
					, book.getAuthor()
					, book.isRent());
			
			res = statement.execute(sql);
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
		return res;
	}

	@Override
	public boolean deleteBook(Book book) {
		boolean res = false;
		Connection conn = DBConnection.getConnection();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			
			String sql = String.format("delete book where no=%d",book.getNo());
			
			res = statement.execute(sql);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		return res;
	}

	@Override
	public boolean updateBook(Book book) {
		boolean res = false;
		Connection conn = DBConnection.getConnection();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			
			String sql = String.format("update book set isrent='%s' where no=%d"
					, book.isRent()
					, book.getNo());
			
			res = statement.execute(sql);
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
		return res;
	}

}
