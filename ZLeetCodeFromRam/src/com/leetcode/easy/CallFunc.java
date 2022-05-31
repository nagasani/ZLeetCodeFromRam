package com.leetcode.easy;

public class CallFunc {
	
	public static void main(String[] args) {
		char[] input1 = new char[] {'a','b','c','C','B','A'};
		char[] input2 = new char[] {'a','b','c','C','B','A','z'};

		System.out.println(callFunc(input2));
	}

	private static int callFunc(char[] input1) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i < input1.length; i++) {
			int sum = 0;
			int val1 = input1[i] - 'A'+1;
			val1 = val1 > 32 ? (val1 - 32) : -1*val1;
			sum = val1;
			//System.out.println(val1);
			for(int j=i+1; j < input1.length; j++) {
				int val2 = input1[j] - 'A'+1;
				val2 = val2 > 32 ? (val2 - 32) : -1*val2;
				sum+=val2;
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
	
}