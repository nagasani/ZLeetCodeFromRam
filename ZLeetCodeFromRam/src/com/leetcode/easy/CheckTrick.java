package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CheckTrick {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		l.add(8);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(8);
		
		System.out.println(l);
		
		l.remove(new Integer(8));
		System.out.println(l);
	}
}
