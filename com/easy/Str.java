package com.easy;

public class Str {
	 public static boolean isPalindrome(String s) 
	    {
		 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			StringBuffer sb =new StringBuffer(s).reverse();
			System.out.println("s "+ s +" sb " + sb);
			return s.equals(sb.toString());
	        
	    }
	 public static void main(String[] args) {
		 isPalindrome("Hey wassap : man");
	}
}
