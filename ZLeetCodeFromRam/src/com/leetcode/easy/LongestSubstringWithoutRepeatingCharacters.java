package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abccdfgclp"));
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
			max = Math.max(max, i - j+1);
			i++;
		}
		return max;
	}
	
	public static int lengthOfLongestSubstring1(String s) {
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
			if(max < (i - j+1)) {System.out.println(set);}
			max = Math.max(max, i - j+1);
			i++;
		}
		return max;
	}
	
	public static int lengthOfLongestSubstringBruteForce(String s) {
		if(s==null || s.equals("")) return 0;
		int max=0;
		List<Character> l = null;
		for(int i=0; i < s.length(); i++) {
			l = new ArrayList<>();
			l.add(s.charAt(i));
			int count = 1;
			for(int j=i+1; j < s.length(); j++) {
				if(!l.contains(s.charAt(j))) {
					count++;
				}
				else {
					break;
				}
				l.add(s.charAt(j));
			}
			if(count > max) {
				//System.out.println(l);
			}
			max = count > max ? count : max;
		}
		return max;
	}
}
