package com.cgi.training.java.bookmarks;

import java.sql.SQLException;
import java.util.List;

public class BookmarkServiceTest {
	public static void main(String[] args) throws SQLException {
		try {
			BookmarkService bs = new BookmarkService();
		
			int userId = 2;

			try {
				List<Bookmark> bookmarks = bs.findAllBookmarks(userId);
				System.out.println(bookmarks);
			} catch (UserDoesNotExistException ex) {
				System.out.println("L'utilisateur n'existe pas " + ex.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println("Une erreur est survenue en essayant "
					+ "de récupérer les bookmarks, "
					+ "veuillez réssayer dans 5 minutes. "
					+ "En cas de problème appeler le support...");
		}
		
		
	}
}