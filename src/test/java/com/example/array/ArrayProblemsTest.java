package com.example.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayProblemsTest {
	
	@Test
	public void segregate0sAnd1sTest() {
		int[] a = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int [] result = ArrayProblems.segregate0sAnd1s(a);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void dutchNationalFlagProblemTest() {
		int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int[] expected = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
		int [] result = ArrayProblems.dutchNationalFlagProblemGeek(a);
		assertArrayEquals(expected, result);
	}
	
}
