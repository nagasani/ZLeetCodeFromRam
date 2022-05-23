package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abccdfg"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
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
