package com.cgi.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
//import java.util.Scanner;

public class RequestActor {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306";
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password", "");
		conn = DriverManager.getConnection(url, connectionProps);
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sakila.actor WHERE actor_id = ?");

		System.out.println("Veuillez indiquer l'id de l'acteur � afficher");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// se prot�ger des injections SQL. Ex: "SELECT * FROM sakila.actor WHERE
		// actor_id = 1 OR 1"
		int actorIdVerified = Integer.parseInt(input); // de pr�f�rence utiliser un librarie sp�cialis�e
		stmt.setInt(1, actorIdVerified);

		ResultSet result = stmt.executeQuery();

		// Statement stmt = conn.createStatement();
		// System.out.println("Veuillez indiquer l'id de l'acteur � afficher");
		// @SuppressWarnings("resource")
		// Scanner scanner = new Scanner(System.in);
		// String input = "2";
		// input = scanner.nextLine();
		// ResultSet result = stmt.executeQuery("SELECT * FROM sakila.actor WHERE
		// actor_id = " + input);
	// ==> Ne pas faire comme �a, la plus grosse faille au monde (il suffit de
	// rentrer "1 OR 1" pour afficher tout les acteurs

		while (result.next()) {
			int actorId = result.getInt("actor_id");
			String actorFirstName = result.getString("first_name");
			String actorLastName = result.getString("last_name");
			System.out.println(actorId + ": " + actorFirstName + " " + actorLastName);
		}

		conn.close();

	}

}
