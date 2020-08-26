package com.bitManipulation;

public class SetBits {
    public static int hammingWeight(int n) {
    	String str= String.valueOf(n);
    	System.out.println(str);
    	int count=0;
    	for(int i=str.length()-1; i>=0 ;i--)
    	{
    		if(str.charAt(i)=='1')
    		{
    			System.out.println(i);
    			count++;
    		}
    	}
    	return count;
    }
    public static void main(String[] args) {
		int n= 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
	}
}
