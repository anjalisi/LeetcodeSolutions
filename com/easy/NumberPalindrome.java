package com.easy;

public class NumberPalindrome {
    public static boolean isPalindrome(int x)
    {
    	if(x<0) return false;
    	StringBuilder str=new StringBuilder();
    	str.append(x);
    	int l=0, r=str.length()-1;
    	while(l <=r)
    	{
    		if(str.charAt(l) != str.charAt(r))
    			return false;
    		l++;
    		r--;
    	}
    	return true;
    }
    public static void main(String[] args) {
		int x=10;
		System.out.println(isPalindrome(x));
	}
}
