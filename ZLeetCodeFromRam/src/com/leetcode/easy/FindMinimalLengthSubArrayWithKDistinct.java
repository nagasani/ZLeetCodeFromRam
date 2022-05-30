package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindMinimalLengthSubArrayWithKDistinct {
	
	public static void main(String[] args) {
		int[] i = new int[] {2,2,1,1,3};
		List<Integer> list = Arrays.stream(i).boxed().collect(Collectors.toList());
		System.out.println(findMinimalLengthSubArrayWithKDistinct(list, 3));
	}

	public static int findMinimalLengthSubArrayWithKDistinct(List<Integer> arr, int k){
		
		if(arr == null || arr.size() ==0) {return -1;}
		int i=0, j =0, len=Integer.MAX_VALUE; 
		
		Set<Integer> set = new HashSet<>();
		while(i < arr.size()) {
			int val = arr.get(i);
			set.add(val);
			boolean found = false;
			while(set.size() >= k) {
				found = true;
				set.remove(arr.get(j));
				j++;
			}
			if(found)len = Math.min(i-j+1, len);
			i++;
		}
		return len == Integer.MAX_VALUE ? -1: len;
	}
}
