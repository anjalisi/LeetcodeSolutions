package com.easy;

public class MaxPower {
    public static int maxPower(String s) {
    	if(s.length()<=1)
    		return s.length();
        int max= Integer.MIN_VALUE;
        int counter=1;
        for(int i=0; i<s.length()-1;i++)
        {
        	if(s.charAt(i)==s.charAt(i+1))
        		counter++;
        	else
        	{
        		if(max<counter)
        			max=counter;
        		counter=1;
        	}
        }
        if(counter>max)
        	max=counter;
        return max;
    }
    public static void main(String[] args) {
		String s="triplepillooooow";
		System.out.println(maxPower(s));
	}
}
