package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4,5,6,7,8,9,0}, 7)));
	}
	
	public static int[] twoSum(int[] nums, int target ) {
		int[] retValues = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				retValues[1] = i;
				retValues[0] = map.get(target-nums[i]); 
				return retValues;
			}
			map.put(nums[i], i);
		}
		return null;
	}
}