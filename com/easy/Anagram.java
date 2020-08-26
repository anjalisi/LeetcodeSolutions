package com.easy;

import java.util.Arrays;
import java.util.HashSet;

public class Anagram {
	public static boolean isAnagram(String s, String t) {
		char[] s1= s.toCharArray();
		char[] t1= t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		boolean st= Arrays.equals(s1, t1);
		if(st)
			return true;
		else
			return false;
    }
	public static void main(String[] args) {
		String s= "anagram";
		String t="anagram";
		isAnagram(s, t);
	}
}
