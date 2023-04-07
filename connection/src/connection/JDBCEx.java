package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEx {
	
	public static void main(String[] args) {
		JDBCEx ex = new JDBCEx();
		ex.getList();
//		ex.insert(); // TODO 왜 안 나올까나 ?
		// --> Developer에서 커밋이 안되었기 때문에 가져올 정보를 기다리는 중이었음.
		// --> 커밋 했으나 무결성 웅앵 오류 뜸 : 이미 디벨로퍼에서 명령문을 실행하여 테이블에 값이 들어간 상태였음
		// --> 쿼리문 작성 시 디벨로퍼에서 실행하여 문제없음을 확인하고나면 롤백하고 이클립스에서 실행하면 중복된 값 없이 들어가게 된다.
//		ex.delete();
//		ex.update();
	}

	public void getList() {
		
		// 드라이버(클래스) 로딩
		// 커넥션 얻어오기
		// 쿼리 실행 객체 생성하기
		// 쿼리 실행 후 결과집합 받아오기
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 얻기 완료 -> "+conn);
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from book order by no desc");
			
//			for(int i=0; i<rs.getFetchSize(); i++) {
//				rs.next();
//			}
			
//			System.out.println("size: "+rs.getFetchSize());
			
//			rs.next();
			
//			System.out.println("조회 결과는 -> "+rs.getString(2));
			
//			while(rs.next()) {
//				System.out.print(rs.getInt(1));
//				System.out.print(rs.getString(2));
//				System.out.print(rs.getString(3));
//				System.out.print(rs.getString(4));
//				System.out.print(rs.getDate(5));
//				System.out.print(rs.getDate(6));
//				System.out.println(); // 개행
//			}
			
			List<Book> list = new ArrayList<>();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editDate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editDate);
				list.add(book);
			}
			
			// List<> 출력하면 기본 형식 [리스트1, 리스트2, 리스트3..] 이렇게 나옴 
//			System.out.println(list);
			
			// 익숙한 방법대로 for문으로 배열을 돌아 리스트를 가져오면 알아서 개행된 형태로 나옴.
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			rs.close();
			st.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	public void Test() {
		// 데이터 베이스 접근 시 필요한 정보
				// ip, port, sid, 계정정보, 비밀번호
				
				String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
				String id = "orauser";
				String pw = "1234";
				
				Connection conn;
				
				
				try {
					// 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					// 커넥션 얻어오기
					conn = DriverManager.getConnection(url, id, pw);
					System.out.println("커넥션 얻기 성공 ~~~ "+conn);
					
					// 쿼리를 실행하기 위한 객체 생성
					Statement stmt = conn.createStatement();
					
					// 데이터 조회
					// executeQuery("쿼리문장 입력")
					// ResultSet : 결과집합
					ResultSet rs = stmt.executeQuery("select count(*) from book");
					// 컬럼 탭 다음 행인 실제 데이터가 담긴 한 줄로 이동
					rs.next();
					// 결과집합의 첫번째를 데려옴 (1)
//					System.out.println("조회 결과: "+rs.getString(1));
					System.out.println("조회 결과: "+rs.getInt("count(*)"));
					
					
					// 자원 반납 : 마지막부터 차례대로 닫아줌
					rs.close();
					stmt.close();
					conn.close();
					
					// 데이터 생성, 수정, 삭제
					// stmt.executeUpdate("");
					
				} catch (ClassNotFoundException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
	}

	public void insert() {
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234";
	
	Connection conn;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("커넥션 얻기 완료 --->>> "+conn);
		
		Statement st = conn.createStatement();
		
		System.out.println("test");
		// 몇 건이 처리되었는지 int 타입으로 반환해준다.
		int rs = st.executeUpdate("insert into book values (5,'아몬드2','손원평2','y',sysdate,null)");
		
		System.out.println(rs + "건 처리되었습니다.");
		
		st.close();
		conn.close();
		
	} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	
}

	public void delete() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 자동 커밋 해제
			con.setAutoCommit(false);
			
			Statement state = con.createStatement();
			
			int result = state.executeUpdate("delete from book");
			System.out.println(result + "건 처리되었습니다.");
			
			con.rollback();
			System.out.println("다시 rollback 합니다.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cont = DriverManager.getConnection(url, id, pw);
			
			Statement sm = cont.createStatement();
			
			int rs = sm.executeUpdate("update book set book.title = '앙몽등' where no ='5'");
			
			System.out.println(rs + "건이 처리되었고요를레이후");
			
			sm.close();
			cont.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요");
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}









