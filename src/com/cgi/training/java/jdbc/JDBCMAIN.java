package com.cgi.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCMAIN {

	public static void main(String[] args) throws SQLException {
	// "relier" � votre programme Java un driver correspondant � la base de donn�es cible
			// => propri�t� sur projet => java build path => library => add external JARs
		
	// 1) Obtenir une connexion � une base de donn�es
		Connection conn = null;
		
		// Gestion manuelle via la classe DriverManager
		// localhost = 127.0.0.1
		// par d�faut, sous MySQL est sur le port 3306
		String url = "jdbc:mysql://localhost:3306";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");	// Dans un vrai projet, utiliser les cr�dentials de votre application
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps); 
		
	// 2) Obtenir un objet "stmt" repr�sentant une instruction (statement) SQL
		Statement stmt = conn.createStatement();
				
	// 3) Obtenir un objet "result" repr�sentant le r�sultat de l'ex�cution du statement
		ResultSet result = stmt.executeQuery("SELECT * FROM sakila.film");
		
	// 4) Exploiter le r�sultat
		while(result.next()) {
			int filmId = result.getInt(1);	// ou result.getInt("film_id")
			String filmTitle = result.getString("title");	// ou result.getString(2)
			System.out.println(filmId + " " + filmTitle);
			
		}
		
	// 5) Fermer la connexion
		conn.close();
	}

}
