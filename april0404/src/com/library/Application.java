package com.library;

public class Application {

	public static void main(String[] args) {

		Library lib = new Library();
		System.out.println(lib.toString());
		lib.insertBook(4, "제목", "작가", true);
		System.out.println("수정 후");
		System.out.println(lib.toString());
	}

}
