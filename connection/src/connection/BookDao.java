package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import com.library.dao.DBUtil;

public class BookDao {
	
	
	public static void main(String[] args) {
		BookDao bd = new BookDao();
//		bd.insert();
//		bd.insert(15,"도비","집요정","n");
		bd.delete(3);
//		bd.update();
		
//		List<Book> list = bd.getList();
//		System.out.println("====== 책 목록 조회 ======");
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
	}
	
	
	// 데이터 등록
	public void insert(int no, String title, String author, String isRent) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
		
//			String sql = "insert into book values (6, '고양이', '베르나르', 'y', sysdate, null)";
			
			// 매개변수로 받아온 값을 쿼리문에 넣을 경우!
			String sql = "insert into book values ("+no+", '"+title+"','"+author+"','"+isRent+"', sysdate, null)";
			
			// 삽입/수정/삭제
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 등록 처리되엇슈");
			
			// 자원 반납
			DBUtil.closeConnection(conn, stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 삭제
	public void delete(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
//			String sql = "delete from book where book.no = 3";
//			int rs = stmt.executeUpdate(sql);
			
			int rs2 = stmt.executeUpdate("delete from book where no="+no);
			
			System.out.println(rs2+"건 삭제 처리되었슈");
			
			DBUtil.closeConnection(conn, stmt);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 수정
	public void update() {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();

			int resulte = stmt.executeUpdate("update book set no = 1 where book.no =3");
			System.out.println(resulte+"건 수정 처리되었슈");
			
			Thread.sleep(10000); // 시간끌기용 10초
			
			DBUtil.closeConnection(conn, stmt);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 조회
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try {
			Connection connection = DBUtil.getConnection();
			Statement stmt = connection.createStatement();
			
			// 질의결과를 결과집합으로 받아오기
			ResultSet res = stmt.executeQuery("select * from book order by no");
			
			while(res.next()) {
				int no = res.getInt(1);
				String title = res.getString(2);
				String author = res.getString(3);
				String isRent = res.getString(4);
				Date regdate = res.getDate("regdate");
				Date editdate = res.getDate("editdate");
//				Date regdate = res.getDate(5);
//				Date editdate = res.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editdate);
				
				list.add(book);
			}
			
			DBUtil.closeConnention(connection, stmt, res); 
			// TODO 매개변수를 3개 다 불러오지 못하는 이유눈? --> 처음에 메소드를 불러올 때부터 매개변수가 2개인 걸로 선택해서 그랬음... 다시 해보니 괜찮다이
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}













