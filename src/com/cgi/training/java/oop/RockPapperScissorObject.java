package com.cgi.training.java.oop;

public class RockPapperScissorObject {
	private String type;
	private int id;
	
	/**
	 * Renvoi le type du choix (Rock, Papper or Scissor).
	 * @return
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Renvoi l'id du choix (0, 1 ou 2).
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Création d'un objet Rock, Papper ou Scissor.
	 * @param id Identidfiant du type de l'objet, pouvant être mit en relation avec un type.
	 */
	public void setChoice (int id) {
		this.id = id;
		if(id == 0) {
			this.type = "Rock";
		} else if(id == 1) {
			this.type = "Papper";
		} else if(id == 2) {
			this.type = "Scissor";
		} else {
			this.type = "ERROR";
		}
	}

}
