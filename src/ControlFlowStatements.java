
// Statements => Instructions
// Control Flow => Contrôle de flux
public class ControlFlowStatements {

	public static void main(String[] args) {
		// if
		if(true) {
			System.out.println("la condition est true");
		}

		if(false) {
			System.out.println("on ne vas pas rentrer ici");
		} else {
			System.out.println("false n'est pas true");
		}
		
		int a = 3;
		if(a > 10) {
			System.out.println("a est plus grand que 10");
		} else {
			System.out.println("a est plus petit que 10");
		}
		
		boolean res = a > 10;
		if(res) {
			System.out.println("do something");
		} else {
			System.out.println("do something else");
		}
		
		if(a < 3) {
			System.out.println("a < 3");
		} else if (a < 5) {
			System.out.println("a >= 3 && a < 5");
		} else if(a < 10) {
			System.out.println("a >= 5 && a < 10");
		} else {
			System.out.println("a >= 10");
		}
		
		// Boucles
		for(int i = 0; i < 10; i = i + 1) {	// Attention! Ici, le scope de i est local à la boucle for
			System.out.println(i);
		}
		// = à
		for(int i = 0; i < 10; i++) {	// Attention! Ici, le scope de i est local à la boucle for
			System.out.println(i);
		}
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("do-while");
		do {
			System.out.println(i);
			i = i + 1;
		} while(i < 10);
	}
	

}
