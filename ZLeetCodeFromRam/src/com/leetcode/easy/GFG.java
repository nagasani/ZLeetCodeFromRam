package com.leetcode.easy;

import java.util.*;

class GFG {

// Function to find the minimum count of
// characters required to be deleted to make
// frequencies of all characters unique
	static int minCntCharDeletionsfrequency(String S) {
		
		char[] c = S.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		PriorityQueue<Integer> priorityQ = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
		int cntChar = 0;
		for (int i = 0; i < c.length; i++) {
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> it : map.entrySet()) {
			priorityQ.add(it.getValue());
		}

		while (!priorityQ.isEmpty()) {
			int frequency = priorityQ.peek();
			priorityQ.remove();
			if (priorityQ.isEmpty()) {
				return cntChar;
			}
			if (frequency == priorityQ.peek()) {
				if (frequency > 1) {
					priorityQ.add(frequency - 1);
				}
				cntChar++;
			}
		}
		return cntChar;
	}

// Driver Code
	public static void main(String[] args) {
		String str = "abbbcccd";
		int N = str.length();
		System.out.print(minCntCharDeletionsfrequency(str));
	}
}
