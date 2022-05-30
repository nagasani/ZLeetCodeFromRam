package com.leetcode.easy;
class NumSubarrayProductLessThanK {
	
	public static void main(String[] args) {
		//System.out.println(numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
		System.out.println(numSubarrayProductLessThanK1(new int[] {1,2,3}, 0));
	}
    
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
    	
		int i=0, j=0, mul=1, count=0;
    	
		while(i < nums.length && j < nums.length) {
			mul *= nums[i];
			while(mul >= k) {
				mul /= nums[j];
				j++;
			}
			count += i - j + 1;
			i++;
		}
        return count;
    }
	
	public static int numSubarrayProductLessThanK1(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1;
        int count = 0, left = 0;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= k) prod /= nums[left++];
            count += i - left + 1;
        }
        return count;
    }
}