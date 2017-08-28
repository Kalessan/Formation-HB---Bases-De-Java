package POO;

public class Lamp {
	// Variables d'instance, instance fields
	// Toujours les mettre en PRIVE
	private boolean isOn;	
	private String brand;
	
	// Méthods ==================================
	// Accessors (Getters and Setters) => Public!
	public boolean getIsOn() { // => signature: doit toujours retourner un boolean
		return isOn;
	}
//	public void setIsOn(boolean newValue) {
//		isOn = newValue;
//	}
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;	// => "this" indique la variable globale à la classe, isOn n'est ici que locale à la méthode
	}	
	public String getBrand() { // => signature: doit toujours retourner une string
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	



}
