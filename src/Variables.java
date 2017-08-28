
public class Variables {

	public static void main(String[] args) {
		
		// Déclaration et initialisation (1ère affectation) des variables
		int a = 0;
		boolean b = true;
		String c = "Je suis une chaine de caratères";
		
		// Affichage des variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d;
		d = 1;
		System.out.println(d);
		
		int iAmAVariable = 10; // Une variable commence toujours avec une minuscule; pas d'espaces; majuscule entre chaque mots
		// Réutilisation d'une variable
		iAmAVariable = iAmAVariable + 1;
		
		// Litéraux
			int i1 = 12345;		// Base 10
			int i2 = 0b1110110;	// Base 2 (Binaire)
			int i3 = 0x1A2F;	// Base 16 (Hexadecimal)
			
			int i4 = 123_456_789;
			
			byte b1 = 12;
			//byte b2 = 256;	<=== Nope, plus grand que 32bits
			long l = 12345L;
			
			// en base 10
			//	42 = 4x10^2 + 2x10^0
			//	453 = 4x10^2 + 5x10^1 + 3x10^0
			//	12 + 29 = 41
				
			// en base 2
			//	0 = 0x2^0
			//	1 = 1x2^0
			//	10 = 1x2^0 = 2
			//	11 = 1x2^1 + 12^0 = 2 +1 = 3
			//	100 = 1x2^2 + 0x2^1 + 0x2^0 = 4 + 0 + 0 = 4
			//	101 = 2x2^2 + 0x2^1 + 1x2^0 = 4 + 0 + 1 = 5
				
			//	10 + 11 = 101
			
			// en Base 16
			//	0-F
				
			//	E = 14
			//	F = 15
			//	10 = 1x16^1 + 0x16^0 = 16
			//	FF = 15x16^1 + 15x16^0 = 255
			
		// Flottant
			double d1 = 123.4;
			double d2 = 1.32e2;
			float f = 123.4f;
			
		// Characters
			char c1 = 'a';
			char c2 = '\u1234';
			
			// int c3 = c2 + 1 ==> pas possible, mais...
			c1 += 1; // donne "b"
			c1++;
			
		// Boolean
			boolean b01 = true;
			boolean b02 = false;
			
		// Opérateurs
			System.out.println(5 / 2);		// 2 <== Division entière en Java !!!
			System.out.println(5.0 / 2);	// 2.5
			
			System.out.println(5 + 3); // Addition
			System.out.println("Bonjour" + " le" + " monde"); // Concaténation
			System.out.println("Bonjour" + 42);
			
		// Comparaison
			System.out.println(5 == 3);
			System.out.println(5 != 3);
			System.out.println(5 > 3);	// >=
			System.out.println(5 < 3);	// >=
			
			System.out.println(true && true);	// ET
			System.out.println(true && false);
			System.out.println(true || false);	// OU
			System.out.println(false || false);
			System.out.println(! true);	// NON
			System.out.println(! false);
			
		// Operateur ternaire
			int res1 = true ? 1 : 2;
			int res2 = false ? 1 : 2;
			System.out.println(res1);
			System.out.println(res2);
			
		// ++	=> à n'utiliser que seul sur sa propre ligne, sinon, imprévisible
			int pa = 0;
			int pb = 0;
			pb = pa++;
			System.out.println(pa);	// 1
			System.out.println(pb);	// 0
			
			pa = 0;
			pb = 0;
			pb = ++pa;
			System.out.println(pa);	// 1
			System.out.println(pb);	// 1
			
		// +=, -=, *=, /=, %=
			int pea = 0;
			pea += 1;	// pea = pea + 1
			System.out.println(pea); // 1 			

			pea %= 3;	// pea + pea 3
	}
	
	
}
