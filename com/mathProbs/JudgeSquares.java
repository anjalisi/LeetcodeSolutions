package com.mathProbs;

public class JudgeSquares {
    public static boolean judgeSquareSum(int c) 
    {
    	if(c<=1)
    		return true;
    	for(double i=1; (i*i) <= c; i++)
    	{
    		double temp= Math.sqrt(c-(i*i));
    		if(temp == (int)temp)
    			return true;
    	}
    	return false;
    }

	public static void main(String[] args) {
		int c=999999999;
		System.out.println(judgeSquareSum(c));
	}
}
