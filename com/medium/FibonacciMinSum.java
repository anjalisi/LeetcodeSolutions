package com.medium;

public class FibonacciMinSum {
	public int findMinFibonacciNumbers(int k) 
	{
		int count=0;
		while(k!=0)
		{
			k-=greatestFib(k,1,1);
			count++;
		}
		return count;
    }

	private int greatestFib(int k, int i, int j) {
		// TODO Auto-generated method stub
		int fib=0;
		while(i+j<=k)
		{
			int temp=i;
			i+=j;
			j=temp;
		}
		return j;
	}
}
