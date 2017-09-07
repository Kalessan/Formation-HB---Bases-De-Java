package com.cgi.training.java.exceptions;

public class ExceptionThrower {

	public void throwAnException() throws Exception {	// marquer explicitement dans la signature de la méthode que c'est un exception	
		throw new Exception("BOOM");
	}

}
