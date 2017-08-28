package POO;

public class PersonMain {
	
	public static void main(String[] args) {
		Person charly = new Person();
		charly.setFirstName("Charly");
		charly.setLastName("Walker");
		charly.setAge(26);
		
		Person helena = new Person();
		helena.setFirstName("Helena");
		helena.setLastName("Botwin");
		helena.setAge(24);
		
		Person captainFlam = new Person();
		captainFlam.setFirstName("Captain");
		captainFlam.setLastName("Flam");
		captainFlam.setAge(38);
		
		// Ecriture Prénom Nom, age
		System.out.println(charly.getFirstName()
		+ " " + charly.getLastName()
		+ ", " + charly.getAge() + " ans");
		
		System.out.println(helena.getFirstName() 
		+ " " + helena.getLastName()
		+ ", " + helena.getAge() + " ans");
		
		System.out.println(captainFlam.getFirstName() 
		+ " " + captainFlam.getLastName()
		+ ", " + captainFlam.getAge() + " ans");
		
		
		// Trouver la personne la plus jeune
		Person[] persons = new Person[3];
		persons[0] = charly;
		persons[1] = helena;
		persons[2] = captainFlam;		
		
		Person youngest = persons[0];
		
		for (int i = 0; i < persons.length; i++) {
			if(youngest.getAge() > persons[i].getAge()) {
				youngest = persons[i];
			}
		}
		
		System.out.println("La personne la plus jeune est " + youngest.getFirstName() 
		+ " " + youngest.getLastName() + ", " + youngest.getAge() + " ans.");
	}

}
