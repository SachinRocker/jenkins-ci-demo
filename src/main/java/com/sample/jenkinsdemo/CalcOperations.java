package com.sample.jenkinsdemo;

public class CalcOperations {

	public int add(int... nums) {
		int sum = 0;
		for (int i : nums)
			sum += i;
		return sum;
	}
}
