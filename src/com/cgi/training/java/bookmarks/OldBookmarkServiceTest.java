package com.cgi.training.java.bookmarks;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class OldBookmarkServiceTest {

	public static void main(String[] args) throws Exception {

		OldBookmarkService bs = new OldBookmarkService();

		int userId = 4;
		List<OldBookmark> bookmarks = bs.findAllBookmarks(userId);
		
		System.out.println(bookmarks);
//		for(int i = 0; i < bookmarks.size(); i++) {
//			System.out.println(bookmarks.get(i));
//		}
	}
}
