package com.leetcode.easy;
class MinSubArray {
	
	public static void main(String[] args) {
		int[] nums = new int[]{2,3,1,2,4,3};
		//int[] nums = new int[]{1,4,4};
		//int[] nums = new int[]{1,2,3,4,5};
		System.out.println(minSubArrayLen(7, nums));
	}
	
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0, j=0, length=Integer.MAX_VALUE;
        int sum = 0;
        while(i < nums.length){
        	if(nums[i] >= target){return 1;}
            sum += nums[i];
            if(sum >= target){
                length = (i -j)+1 < length ? (i -j)+1: length;  
              }
            while(sum >= target){
                sum -=nums[j];
                if(sum >= target){
                	length = (i -j) < length ? (i -j): length;
                  }
                j++;
            }
           
            i++;
        }
        return length==Integer.MAX_VALUE ? 0:length;
    }
}