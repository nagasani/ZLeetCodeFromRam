package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMinimumLengthSubArray {
	
	public static void main(String[] args) {
		System.out.println(findMinimumLengthSubArray(Arrays.asList(2, 2, 1, 1, 3), 4));
	}
	
	//[2,2,1,1,3]  4
	public static int findMinimumLengthSubArray(List<Integer> arr, int k) {
		if(arr==null || arr.size() ==0) return 0;	
		int i=0,j=0,min=Integer.MAX_VALUE;
		Set<Integer> set = new HashSet<>(); 
		while(i < arr.size()) {
			Integer c = arr.get(i); int distinct=0;
			while(set.contains(c) && distinct >= k) {
				set.remove(arr.get(j));
				j++;
			}
			set.add(c);
			if(min > (i - j+1)) {set.stream().forEach(System.out::print);System.out.println();}
			if(distinct >= k) {
				min = Math.min(min, i - j+1);
			}
			i++;
			distinct++;
		}
		return min;
	}
	
	public static int findMinimumLengthSubArray(String s) {
		if(s==null || s.equals("")) return 0;
		int i=0,j=0,max=0;
		Set<Character> set = new HashSet<Character>(); 
		while(i < s.length()) {
			Character c = s.charAt(i);
			while(set.contains(c)) {
				set.remove(s.charAt(j));
				j++;
			}
			set.add(c);
			if(max < (i - j+1)) {set.forEach(System.out::print);System.out.println();}
			max = Math.max(max, i - j+1);
			i++;
		}
		return max;
	}

}
