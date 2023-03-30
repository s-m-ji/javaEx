package com.object;

public class Library {

	public static void main(String[] args) {
		
		Library lib = new Library();
		lib.addBook();
		System.out.println(lib.toString());
		
		// Object가 가진 주소값만 출력됨
		//		String[] strArr = new String[5];
		// 책을 생성
//		Book bk1 = new Book("해리포터1", "조앤1");
//		Book bk2 = new Book("해리포터2", "조앤2");
		// 배열에 추가
//		lib.addBook(0, bk2);
//		lib.addBook(1, bk2);
//		lib.addBook(2, bk1);
//		lib.addBook(3, bk1);
//		lib.addBook(4, bk1);
		
		
	}
		// ===== 책 리스트 ======
		private Book[] bkArr = new Book[5];
		
		/**
		 * 책 리스트를 추가
		 */
		public void addBook() {
			bkArr[0] = new Book("해리포터0", "조앤0");
			bkArr[1] = new Book("해리포터1", "조앤1");
			bkArr[2] = new Book("해리포터2", "조앤2");
			bkArr[3] = new Book("해리포터3", "조앤3");
			bkArr[4] = new Book("해리포터4", "조앤4");
		}
		
		
		@Override
		public String toString() {
			String str = "";
			for(Book b : bkArr) {
				// str += b.getTitle() +" "+ b.getWriter() + "\n";
				str += b.toString() + "\n";
			}
			return str;
		}
		
		
		
//		public void addBook(int index, Book book) {
//			bkArr[index] = book;
//		}
		
	
}
