package com.medium;

public class MinSwapsToMakeBinStringEqual {
    public static int minimumSwap(String s1, String s2) 
    {
    	if(s1.equals(s2))
    		return 0;
    	if((s1==null && s2==null) || (s1.length()==0 && s2.length()==0))
    			return 0;
    	if(s1.length() != s2.length())
    		return -1;
    	int count0=0, count1=0;
    	for(int i=0; i<s1.length() ;i++)
    	{
    		if(s1.charAt(i)=='x' && s2.charAt(i)=='y')
    			count0++;
    		else if(s1.charAt(i)=='y' && s2.charAt(i)=='x')
    			count1++;
    	}
    	System.out.println("xy "+count0+" yx "+count1);
    	if((count0+count1)%2 != 0)
    		return -1;
    	else
    	{
    		if(count0%2==0 && count1%2==0)
    			return (count0+count1)/2;
    		else
    			return 2+(count0/2)+(count1/2);
    	}
    		
    }
    public static void main(String[] args) {
		String s1="xy";
		String s2="yx";
		System.out.println(minimumSwap(s1, s2));
	}
}
