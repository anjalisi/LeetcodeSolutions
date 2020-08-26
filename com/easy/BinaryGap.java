package com.easy;

public class BinaryGap {
    public static int binaryGap(int N)
    {
    	String str= Integer.toBinaryString(N);
    	int i=0,max=0, count=0;
    	while(i<str.length()-1)
    	{
    		while(i<str.length()-1 && str.charAt(i)==1 && str.charAt(i) == str.charAt(i+1))
    		{
    			count++;
    			i++;
    		}
    		max= Math.max(count, max);
    		count=0;
    		i++;
    	}
    	return max;
    }
    public static void main(String[] args) 
    {
		int N=22;
		System.out.println(binaryGap(N));
	}
}
