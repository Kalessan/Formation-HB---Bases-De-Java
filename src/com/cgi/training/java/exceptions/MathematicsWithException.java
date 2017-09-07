package com.cgi.training.java.exceptions;

public class MathematicsWithException { 
	/**
	 * Add two given numbers	 * 
	 * @param i
	 * @param j
	 * @return the sum of the numbers
	 * @throws Exception if i + j > Integer.MAX_VALUE or if i + j < Integer.MIN_VALUE
	 */
	public static int addition(int i, int j) throws Exception {
		Long test = new Long(i) + new Long(j);
		if(test > Integer.MAX_VALUE) {
			throw new Exception("i + j > Integer.MAX_VALUE");
		}

		if(test < Integer.MIN_VALUE) {
			throw new Exception("i + j < Integer.MIN_VALUE");
		}
		
		return test.intValue();
		
	}
	
}
