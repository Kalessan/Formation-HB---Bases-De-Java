package com.cgi.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCMAIN {

	public static void main(String[] args) throws SQLException {
	// "relier" à votre programme Java un driver correspondant à la base de données cible
			// => propriété sur projet => java build path => library => add external JARs
		
	// 1) Obtenir une connexion à une base de données
		Connection conn = null;
		
		// Gestion manuelle via la classe DriverManager
		// localhost = 127.0.0.1
		// par défaut, sous MySQL est sur le port 3306
		String url = "jdbc:mysql://localhost:3306";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");	// Dans un vrai projet, utiliser les crédentials de votre application
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps); 
		
	// 2) Obtenir un objet "stmt" représentant une instruction (statement) SQL
		Statement stmt = conn.createStatement();
				
	// 3) Obtenir un objet "result" représentant le résultat de l'exécution du statement
		ResultSet result = stmt.executeQuery("SELECT * FROM sakila.film");
		
	// 4) Exploiter le résultat
		while(result.next()) {
			int filmId = result.getInt(1);	// ou result.getInt("film_id")
			String filmTitle = result.getString("title");	// ou result.getString(2)
			System.out.println(filmId + " " + filmTitle);
			
		}
		
	// 5) Fermer la connexion
		conn.close();
	}

}
