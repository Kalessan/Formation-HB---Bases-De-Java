package com.cgi.training.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cgi.training.java.exceptions.MathematicsWithException;

public class MathematicsWithExceptionTest {

	@Test
	public void adding1And1ShouldReturn2() throws Exception {
		int a = 1;
		int b = 1;
		
		int res = MathematicsWithException.addition(a, b);

		assertEquals("1 + 1 should equal 2", 2, res);
	}
	
	@Test
	public void addingMinus1AndMinus1ShouldReturnMinus2() throws Exception {
		int a = -1;
		int b = -1;
		
		int res = MathematicsWithException.addition(a, b);

		assertEquals("(-1) + (-1) should equal -2", -2, res);
	}


}
