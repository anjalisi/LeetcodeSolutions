package com.medium;

import java.util.HashSet;

public class SubsequentDistinct {
	public static String smallestSubsequence(String text) {
		HashSet<Character> h=new HashSet<Character>();
		StringBuilder res=new StringBuilder();
		for(int i=0; i<text.length(); i++)
		{
			if(!h.contains(text.charAt(i)))
			{
				h.add(text.charAt(i));
				res.append(text.charAt(i));
			}
		}
		return res.toString();
    }
	public static void main(String[] args) {
		String s="leetcode";
		System.out.println(smallestSubsequence(s));
	}
}
