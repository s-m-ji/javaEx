package board;

public class BoardMain {

	public static void main(String[] args) {
		
		// 타입[] 이름 = new 타입[갯수];
		int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		int[] intArray = {1,2,3,4,5};
		
		String[] strArr = new String[5];
		
		Board[] boardArr = new Board[5];
		boardArr[0] = new Board("게시글1", "내용", "작성자", "날짜", 1);
		boardArr[1] = new Board("게시글2", "내용", "작성자", "날짜", 2);
		boardArr[2] = new Board("게시글3", "내용");
		boardArr[3] = new Board("게시글4", "내용");
		boardArr[4] = new Board("게시글5", "내용");
		
		System.out.println("===== 게시글을 출력합니다 =====");
		for(Board board : boardArr) {
			System.out.printf("%s, %s, %s, %s, %d\n", board.title, board.writer, board.content, board.date, board.hitcount);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// 게시글을 생성
		Board board1 = new Board("제목1", "내용", "작성자", "날짜", 0);
		Board board2 = new Board("제목2", "내용", "작성자", "날짜", 0);
		Board board3 = new Board("제목3", "내용", "작성자", "날짜", 0);
		Board board4 = new Board("제목4", "내용", "작성자", "날짜", 0);
		Board board5 = new Board("제목5", "내용", "작성자", "날짜", 0);
		Board board6 = new Board("제목6", "내용", "작성자", "날짜", 0);
		Board board7 = new Board("제목7", "내용", "작성자", "날짜", 0);
		Board board8 = new Board("제목8", "내용", "작성자", "날짜", 0);
		Board board9 = new Board("제목9", "내용", "작성자", "날짜", 0);
		Board board10 = new Board("제목10", "내용", "작성자", "날짜", 0);
		
		// 배열 생성
		Board[] boardList = new Board[10];		
		boardList[0] = board1;
		boardList[1] = board2;
		boardList[2] = board3;
		boardList[3] = board4;
		boardList[4] = board5;
		boardList[5] = board6;
		boardList[6] = board7;
		boardList[7] = board8;
		boardList[8] = board9;
		boardList[9] = board10;
		
		// 게시글 리스트 생성
		BoardList List = new BoardList(boardList);
		*/
	}

}
