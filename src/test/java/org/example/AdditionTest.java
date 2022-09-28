package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

	@Test
	void add() {
		int result = Addition.add(10,20);
		int correctRes = 30;
		assertEquals(correctRes,result);
	}
}