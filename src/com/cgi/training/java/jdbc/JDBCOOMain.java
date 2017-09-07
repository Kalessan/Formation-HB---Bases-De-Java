package com.cgi.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBCOOMain {

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
		connectionProps.put("user", "root"); // Dans un vrai projet, utiliser les crédentials de votre application
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps);

	// 2) Obtenir un objet "stmt" représentant une instruction (statement) SQL
		Statement stmt = conn.createStatement();

	// 3) Obtenir un objet "result" représentant le résultat de l'exécution du statement 
		ResultSet result = stmt.executeQuery("SELECT * FROM sakila.film");

	// 4) Exploiter le résultat => ici, on passe du relationel à l'objet => ORM (object relational mapping) ex: hibernate
		List<Film> films = new ArrayList<>();
		while (result.next()) {
			Film f = new Film();
			f.setId(result.getInt("film_id"));
			f.setTitle(result.getString("title"));
			films.add(f);
		}
		System.out.println(films);
	// 5) Fermer la connexion
		conn.close();

	}

}
