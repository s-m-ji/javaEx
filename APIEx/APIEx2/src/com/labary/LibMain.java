package com.labary;

public class LibMain {
	public static void main(String[] args) {
		Libary lib = new Libary();
		lib.addBook();
		System.out.println(lib.toString());
	}
}
