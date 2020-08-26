package com.easy;

public class PowerOf4 {
	public static boolean isPowerOfFour(int num) {
        int n=(int)Math.pow(num, 0.25);
        System.out.println(n);
        return (int)Math.pow(n,4)==num;
    }
	public static void main(String[] args) {
		int num=64;
		System.out.println(Math.pow(64,0.25));
		System.out.println(isPowerOfFour(num));
	}
}
