package com.library;
import java.sql.SQLException;

import com.library.controller.LibraryController;

public class Application {
	public static void main(String[] args) throws SQLException {
		
		LibraryController libraryController = new LibraryController();
		libraryController.start();
	}
}

