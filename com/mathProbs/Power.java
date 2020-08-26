package com.mathProbs;

public class Power {
	public static double nthPersonGetsNthSeat(int n) 
	{
        if(n==0)
            return 0;
        double res=n;
        return 1/res;
    }
	public static void main(String[] args) {
		int n=2;
		System.out.println(nthPersonGetsNthSeat(n));
	}
}
