package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	// 접근제한자를 default로 해서 해당 패키지내에서만 쓸 수 있게끔 설정하려했으나
	// Application이 다른 패키지에 있어서 public으로 수정함
	
	/**
	 * 도서 목록 조회
	 * @return
	 */
	public List<Book> getList() {
		List<Book> list = new ArrayList<Book>();
		
//		String sql = "select * from book order by no";
		String sql = "SELECT NO, TITLE, NVL(대여여부, 'N'), AUTHOR FROM BOOK, 대여 WHERE NO = 도서번호(+) AND 대여여부(+) = 'Y'";
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery의 반환타입: ResultSet -> 결과집합
				ResultSet rs = stmt.executeQuery(sql)) {
				
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
				
//				for(Book b : list) {
//					--> List<> 타입을 Book으로 명시해야 for구문에서 Book 타입으로 리스트를 생성해올 수 있다.
//				}
			}
				
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return list;
	}

	/**
	 * 도서 삽입
	 * @param book
	 * @return
	 */
	public int insert(Book book){
		int res = 0;
		
		// String.format : printf와 비슷하게 형식에 맞춰 값을 담을 수 있게함
		String sql = String.format
				("insert into book values (SEQ_BOOK_NO.NEXTVAL, '%s', '%s', '%s')"
				, book.getTitle(), book.getRentyn(), book.getAuthor());
//		, book.getTitle(), book.getAuthor(), book.getRentyn());
		
//		System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			
			// stmt.executeUpdate의 반환타입 : int -> 몇 건이 처리되었는지 산정
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 도서 삭제
	 * @return
	 */
	public int delete(int no) {
		int res =0;
//		String sql  = String.format("delete book where no = ('%d')", no); -> 이렇게 했는데도 되네요..?
		String sql  = String.format("delete book where no = %d", no);
	 	try (Connection conn = ConnectionUtil.getConnection();
	 			Statement stmt = conn.createStatement();	) {
			res = stmt.executeUpdate(sql);
	 		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int update(int no, String rentYN) {
		int res =0;
		String sql  = String.format("update book set rentYN = '%s' where no = %d", rentYN, no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();	) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public int rent(int no) {
		int res =0;
		String sql  = String.format("update book set rentYN = 'Y' where no = %d", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();	) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public int returBook(int no) {
		int res =0;
		String sql  = String.format("update book set rentYN = 'N' where no = %d", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();	) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public String getRentYN(int no) {
		String rentYN = "";
		String sql = String.format("select rentyn from book where no = %s", no);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if(rs.next()) {
				// DB에서 조회된 대여 여부('Y','N') 값을 rentYN 변수에 저장
				rentYN = rs.getString(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rentYN;
	}
	

}











