package com.easy;

public class ComplementBase10 {
    public static int bitwiseComplement(int N) 
    {
    	String str= Integer.toBinaryString(N);
    	StringBuilder sb= new StringBuilder();
    	for(int i=0; i<str.length(); i++)
    	{
    		if(str.charAt(i)=='0')
    			sb.append('1');
    		else
    			sb.append('0');
    	}
    	return Integer.parseInt(sb.toString(), 2);
    }
    public static void main(String[] args) {
		int N=5;
		System.out.println(bitwiseComplement(N));
	}
}
