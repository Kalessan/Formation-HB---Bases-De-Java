package com.cgi.training.java.bookmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class BookmarkService {
	
	/**
	 * Fetch all the bookmarks for a given user
	 * @param UserId int The user from whom to fetch the bookmarks
	 * @return a list containing the user's Bookmarks. If the user has no bookmarks, return an empty list
	 * @throws SQLException 
	 * @throws Exception if the userId does not correspond to an existing user
	 */
	
	public List<Bookmark> findAllBookmarks(int userId) throws SQLException {
		// 0) Importer le script bookmarks-schema.sql (cf. DropBox)
		// 0') Créer 1 user et 3-4 bookmarks
		// 1) Récupérer et retourner les bookmarks par user (cf. ce matin pour les actors par id)
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/bookmarks";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps);
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user INNER JOIN bookmark ON user.id = bookmark.user_id INNER JOIN site ON bookmark.site_id = site.id WHERE user.id = ?");
		
		System.out.println("Veuillez indiquer l'id de l'utilisateur");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int userIdVerified = Integer.parseInt(input);
		stmt.setInt(1, userIdVerified);
		
		ResultSet result = stmt.executeQuery();
		// 2) Vérifier si userId existe (adapter ce que l'on a vu ce matin) et si non jeter une RuntimeException		
		while (result.next()) {
			userId = result.getInt("user.id");
			//System.out.println("=== Bookmarks de " + username + " ===");
			if(userId == NULL) {
				
			}
			
			String bookmarkDescription = result.getString("bookmark.description");
			String siteUrl = result.getString("site.url");
			System.out.println(bookmarkDescription + ": " + siteUrl);
		}

		conn.close();
		
		return null;
	}

}
