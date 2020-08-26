package com.medium;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) 
    {
    	if(s1.length()==0 || s1==null) return true;
    	if(s1.length() > s2.length()) return false;
    	//We will make char counts for both the strings
    	int[] s1chars= new int[26];
    	int[] s2chars= new int[26];
    	//For the first window
    	for(int i=0; i<s1.length(); i++)
    	{
    		s1chars[s1.charAt(i)-'a']++;
    		s2chars[s2.charAt(i)-'a']++;
    	}
    	//Checking for the rest of the windows
    	for(int i=s1.length(); i<s2.length(); i++)
    	{
    		if(Arrays.equals(s1chars, s2chars)) return true;
    		s2chars[s2.charAt(i)-'a']++; 
    		s2chars[s2.charAt(i-s1.length())-'a']--;
    	}
    	//Checking for the last window
    	if(Arrays.equals(s1chars, s2chars)) return true;
    	System.out.println("here");
    	return false;
    }
    public static void main(String[] args) {
		String s1="ab";
		String s2="abcd";
		System.out.println(checkInclusion(s1, s2));
	}
}
