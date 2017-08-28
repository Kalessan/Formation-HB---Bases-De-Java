package POO;

public class Mathematics {

	public int factorial(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
			// result = result * i;
		}
		return result;
	}

	public int addition(int a, int b) {
		return a + b;// buggy
	}
	
}
