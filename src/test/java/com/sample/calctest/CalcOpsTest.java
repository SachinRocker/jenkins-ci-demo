package com.sample.calctest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sample.jenkinsdemo.CalcOperations;

public class CalcOpsTest {
	
	@Test
	public void addTest() {
		
		CalcOperations ops = new CalcOperations();
		int sum = ops.add(1,2,3,4);
		assertEquals(10,sum);
		System.out.println("Actual::"+10+" Excpected::"+sum);
	}

}
