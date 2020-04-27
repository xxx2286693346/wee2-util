package com.ycl.week2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		double value = RandNumUtil.getValue(30000, 80000, 2);
		System.out.println(value);
	}

	@Test
	public void testRandom() {
		int random = RandNumUtil.random(1, 3);
		//for (int i = 0; i < 300; i++) {
			System.out.println(random);
		//}
			
		
	}

}
