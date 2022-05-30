package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class MinLenthWithAtleastKDistinct {
	
	public static int minLenthWithAtleastKDistinct(int[] arr, int k) {
		int i=0, j=0, min=0, count=0;
		
		List<Integer> set = new ArrayList<>();
		while(i < arr.length) {
			
			Integer val = arr[i];
			while(count >= k ){
				if(set.contains(val)) {
					count--;
				}
				set.remove(new Integer(arr[j]));
				j++;
				
			}
			
			
			if(!set.contains(val)) {
				count++;
			}
			set.add(val);
			
			
			
			
			i++;	
		}
		return min;
	}

}
