package com.challenge;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n==1)
			return true;
		while(n>0)
		{
			System.out.println("hereeeee");
			if(n%2==0)
			{
				n=n/2;
				if(n==1)
					return true;
			}
			else
				return false;
		}
		return false;
    }
	public static void main(String[] args) {
		int n=1;
		if(isPowerOfTwo(n))
				System.out.println("hello");
		else
			System.out.println("no");
	}
}
