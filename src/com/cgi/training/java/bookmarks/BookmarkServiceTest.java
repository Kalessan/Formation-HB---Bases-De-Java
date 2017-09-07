package com.cgi.training.java.bookmarks;

import java.sql.SQLException;
import java.util.List;

public class BookmarkServiceTest {

	public static void main(String[] args) throws SQLException {

		BookmarkService bs = new BookmarkService();
		
		int userId = 1;
		List<Bookmark> bookmark = bs.findAllBookmarks(userId);
	}


}
