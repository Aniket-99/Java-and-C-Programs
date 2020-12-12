package com.java.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {
	@RepeatedTest(2)
	//@ValueSource(ints= {1,2,})
	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 10;
		int actual = mathUtils.add(5, 5);
		assertEquals(expected, actual,"Should add");
	}

}
