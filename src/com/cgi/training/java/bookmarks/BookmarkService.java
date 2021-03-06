package com.cgi.training.java.bookmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cgi.training.java.bookmarks.Site;
import com.cgi.training.java.bookmarks.User;

public class BookmarkService {
	
	public static final Logger LOGGER = Logger.getLogger(BookmarkService.class.getName());
	
	public Connection getConnection () throws SQLException {
		//TODO plutot utiliser un pool de connection (https://github.com/brettwooldridge/HikariCP)
		
		// Verifier si un user associe a userId existe
		Connection conn = null;
		String url = "jdbc:mysql://localhost:8889";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root"); // dans un vrai projet, utiliser les credentials de votre application
		connectionProps.put("password", "root");

		try {
			conn = DriverManager.getConnection(url, connectionProps);
		} catch(SQLException ex) {
			// TODO en garder une trace
			LOGGER.log(Level.SEVERE, "Impossible to establish a database connection", ex);
			throw ex;
		}
		return conn;
	}
	
	public User mapResultSetToUser(ResultSet result) throws SQLException {
		User user = new User();
		user.setId(result.getInt("id"));
		user.setUsername(result.getString("username"));
		
		return user;
	}
	
	public Bookmark mapResultSetToBookmark(ResultSet result) throws SQLException {
		Bookmark bookmark = new Bookmark();
		bookmark.setId(result.getInt("id"));
		
		User user = new User();
		user.setId(result.getInt("userId"));
		user.setUsername(result.getString("username"));
		bookmark.setUser(user);
		
		// Site site = bookmarkService.findSiteById(result.getInt("site_id"))
		Site site = new Site();
		site.setId(result.getInt("siteId"));
		site.setUrl(result.getString("url"));
		bookmark.setSite(site);
		
		bookmark.setDescription(result.getString("description"));
		bookmark.setTimeStamp(result.getTimestamp("created_at").toLocalDateTime());
		
		return bookmark;
	}
	
	
	/**
	 * Fetch a User for a given id
	 * @param userId
	 * @return the user associated to the id
	 * @throws SQLException 
	 * @throws UserDoesNotExistException if a user does not exist
	 */
	public User findUserById(int userId) throws SQLException {
		Connection conn = getConnection();
				
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bookmarks.user WHERE id = ?");	
		stmt.setInt(1, userId);
		
		ResultSet result = stmt.executeQuery();
		if(! result.next()) {
			// throw new RuntimeException("User not found: " + userId);
			LOGGER.log(Level.WARNING, "findUserById: " + userId);
			throw new UserDoesNotExistException(" " + userId);
		}
		
		User user = mapResultSetToUser(result);
		
		conn.close();
		
		return user;
	}
	
	
	/**
	 * Fetch all the bookmarks for a given user
	 * @param userId int The user from whom to fetch the bookmarks
	 * @return a list containing the user's bookmarks. If the user has no bookmarks, return an empty list
	 * @throws SQLException 
	 * @throws RuntimeException if the userId does not correspond to an existing user
	 */
	public List<Bookmark> findAllBookmarks(int userId) throws SQLException {		
		User u = findUserById(userId);

		Connection conn = getConnection();

		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT B.id as id, B.description as description, B.created_at as created_at , U.id as userId, U.username as username, S.id as siteId, S.url as url FROM bookmarks.bookmark AS B INNER JOIN bookmarks.user as U ON B.user_id = U.id INNER JOIN bookmarks.site as S ON B.site_id = S.id WHERE user_id = ?");
			stmt.setInt(1, userId);
			
			ResultSet result = stmt.executeQuery();
	
			List<Bookmark> bookmarks = new ArrayList<>();
			
			while(result.next()) {
				Bookmark bookmark = mapResultSetToBookmark(result);
				bookmarks.add(bookmark);
			}
			
			return bookmarks;
		} catch (SQLException ex) {
			LOGGER.log(Level.SEVERE, "Problem while calling findAllBookmarks", ex);
			throw ex;
		} finally {
			conn.close();	
		}
		
		
		
	}

}
