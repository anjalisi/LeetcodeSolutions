package com.easy;

import java.util.HashMap;

public class PalindromicPermutation {
	public static boolean checkIfPalindrome(String s)
	{
		/*MAIN IDEA
		 * 1. Create a Hashmap and store all the frequencies of the characters
		 * 2. Take a variable count, add the freq%2, if count==1, it is a palindrome
		 * */
		if(s.length()==0) return false;
		//removing the spaces
		String str= s.replaceAll("\\s","");
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++)
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		
		int count=0;
		for(char key:map.keySet())
		{
			System.out.println(map.get(key));
			count += map.get(key)%2;
		}
		return count <=1;
	}
	public static void main(String[] args) {
		String s = "taco cat";
		System.out.println(checkIfPalindrome(s));
	}
}
