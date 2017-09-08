package com.cgi.training.java.bookmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import sun.nio.cs.ext.ISCII91;

public class OldBookmarkService {

	/**
	 * Fetch all the bookmarks for a given user
	 * @param UserId int The user from whom to fetch the bookmarks
	 * @return a list containing the user's Bookmarks. If the user has no bookmarks, return an empty list
	 * @throws Exception if the userId does not correspond to an existing user
	 */

	public List<OldBookmark> findAllBookmarks(int userId) throws Exception {
	// Vérifier si userId existe
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/bookmarks";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps);
		
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user WHERE user.id = ?");
		stmt.setInt(1, userId);
		ResultSet result = stmt.executeQuery();
		
		// => Si non jeter une RuntimeException
		if(! result.next()) {
			throw new RuntimeException("User doesn't exist");
		}

		// Dans le cas ou l'utilisateur existe, récupérer et retourner les bookmarks par user
//		stmt = conn.prepareStatement("SELECT * FROM bookmark WHERE bookmark.user_id = ?");
		
		stmt = conn.prepareStatement("SELECT "
				+ "B.description as description, "
				+ "B.created_at as created_at, "
				+ "U.id as userId, "
				+ "U.username as username, "
				+ "S.id as siteId, "
				+ "S.url as url, "
				+ " FROM bookmark AS B"
				+ "INNER JOIN bookmarks.user AS U"
				+ "ON B.user_id = U.id"
				+ "INNER JOIN bookmarks.site AS S"
				+ "ON B.site_id = S.id"
				+ "WHERE bookmark.user_id = ?");
		stmt.setInt(1, userId);
		result = stmt.executeQuery();
		
		List<OldBookmark> bookmarks = new ArrayList<>();
		while (result.next()) {	
			OldBookmark bookmark = new OldBookmark();
			bookmark.setId(result.getInt("id"));

			
			User user = new User();
			user.setId(result.getInt("userId"));
			user.setUsername(result.getString("username"));
	
			bookmark.setUserId(result.getInt("bookmark.User_id"));
			
			//bookmark.setSite(?);			
			bookmark.setSiteId(result.getInt("bookmark.site_id"));
			
			bookmark.setDescription(result.getString("bookmark.description"));
			bookmark.setTimeStamp(result.getTimestamp("bookmark.description").toLocalDateTime());

			bookmarks.add(bookmark);
			

			
//			String bookmarkDescription = result.getString("bookmark.description");
//			String siteUrl = result.getString("site.url");
//			Bookmark.add(bookmarks);
//			System.out.println(bookmarkDescription + ": " + siteUrl);			
		}
			
		conn.close();
		return bookmarks;		
	}

}
