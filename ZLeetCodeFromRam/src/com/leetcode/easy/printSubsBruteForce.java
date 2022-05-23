package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class printSubsBruteForce {
	
	public static void main(String[] args) {
		
		int[] k = new int []{1,2,3,4,5};
		
		for(int i=0;i< k.length; i++) {
			List<Integer> l = new ArrayList<>();
			l.add(k[i]);
			for(int j=i+1;j< k.length; j++) {
				l.add(k[j]);
				System.out.println(l);
			}
		}
	}

}
