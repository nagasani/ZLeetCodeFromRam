package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstringAgain("aaaaaab"));
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
			max = ((i-j)+1) > max ? ((i-j)+1): max;
			i++;
		}
		System.out.println(set);
		return max;
	}
	
	public static int lengthOfLongestSubstringAgain(String s) {
		
		int i=0,j=0,max=0;
		Set<Character> set = new HashSet<>();
		while(i < s.length()) {
			Character c = s.charAt(i);
			while(set.contains(c)){
				set.remove(s.charAt(j));
				j++;
			}
			set.add(c);
			max = (i -j+1) > max ? (i-j+1) : max;
			i++;
		}
		System.out.println(set);
		return max;
		
		
		
	}
	
}
