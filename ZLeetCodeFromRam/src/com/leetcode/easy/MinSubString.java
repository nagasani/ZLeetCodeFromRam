package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MinSubString {
	
	public static String minWindow(String s, String t) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(Character c: t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int i=0, j=0, count=map.size();
		
		return "";
	}

}
