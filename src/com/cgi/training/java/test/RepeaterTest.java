package com.cgi.training.java.test;
import static org.junit.Assert.*;

import org.junit.Test;

public class RepeaterTest {

	@Test
	public void helloRepeated3TimesShouldReturnhellohellohello() {
		String input = "hello";
		int times = 3;
		
		Repeater o = new Repeater();
		String result = o.repeat(input, times);
		
		assertEquals("hello 3 times should be hellohellohello", "hellohellohello", result);
	}
	
	@Test
	public void bonjourRepeated2TimesShouldReturnbonjourbonjour() {
		String input = "bonjour";
		int times = 2;
		
		Repeater o = new Repeater();
		String result = o.repeat(input, times);
		
		assertEquals("bonjour 3 times should be bonjourbonjour", "bonjourbonjour", result);
	}
	
	@Test
	public void emptyStringRepeated5TimesShouldReturnEmptyString() {
		String input = "";
		int times = 5;
		
		Repeater o = new Repeater();
		String result = o.repeat(input, times);
		
		assertEquals("empty string 5 times should be empty string", "", result);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullStringRepeated2TimesShouldsthrowNullPointerException() {
		String input = null;
		int times = 2;
		
		Repeater o = new Repeater();
		o.repeat(input, times);			
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void negativeNShouldThrowIllegalArgumentException() {
		String input = "abcd";
		int times = -5;
		
		Repeater o = new Repeater();
		o.repeat(input, times);			
	}
	
	@Test
	public void NEquals0ShouldReturnEmptyString() {
		String input = "fghdf";
		int times = 0;
		
		Repeater o = new Repeater();
		String result = o.repeat(input, times);
		
		assertEquals("N == 0 should be an empty string", "", result);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullStringRepeated0TimesShouldsthrowNullPointerException() {
		String input = null;
		int times = 0;
		
		Repeater o = new Repeater();
		o.repeat(input, times);			
	}
	
	@Test(expected=NullPointerException.class)
	public void nullStringRepeatedNegativeTimesShouldsthrowNullPointerException() {
		String input = null;
		int times = -10;
		
		Repeater o = new Repeater();
		o.repeat(input, times);			
	}
	
	


	// TODO Tester que la  sortie est différente de input

}
