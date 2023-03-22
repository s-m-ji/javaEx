package board;

public class Board {
	// 제목, 내용, 작성자, 작성일, 조회수
	// ↑ 필드 정리
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	// 생성자의 특징 : 클래스명과 동일, 리턴타입이 없음
	public Board(String title, String content) {
		// 생성자 : 필드 초기화
		this(title, content, "User", "00:00", 0);
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터의 날짜";
//		this.hitcount = 0;
	}
	
	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

	/*
	public Board() {
		// TODO Auto-generated constructor stub
	}
	*/
}
