package com.training.jwa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	@Test
	void testAdd() {
		int expected = 20;
		int actual = calculator.add(10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd2() {
		int expected = 20;
		int actual = calculator.add(12, 8);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd3() {
		int expected = 20;
		int actual = calculator.add(20, 0);
		assertEquals(expected, actual);
	}
	/*
	@Test
	void testMul() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSub() {
		fail("Not yet implemented");
	}
	
	@Test
	void testDiv() {
		fail("Not yet implemented");
	}
	
	@Test
	void testIsEven() {
		fail("Not yet implemented");
	}
	*/
}
