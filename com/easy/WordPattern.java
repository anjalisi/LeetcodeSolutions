package com.easy;

import java.util.HashMap;

public class WordPattern 
{
    public static boolean wordPattern(String pattern, String str) {
    	if(pattern.length() != str.length())
    		return false;
    	HashMap<Character, String> map= new HashMap<Character, String>();
    	String[] arr= str.split(" ");
    	
    	for(int i=0; i<pattern.length(); i++) {
    		map.putIfAbsent(pattern.charAt(i), arr[i]);
    	}
    	StringBuilder res= new StringBuilder();
    	for(int i=0; i<pattern.length(); i++)
    	{
    		res.append(map.get(pattern.charAt(i))+" ");
    	}
    	String[] arr2= res.toString().split(" ");
    	if(arr2.equals(arr))
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args) {
		String pattern = "abba", str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));
	}
}
