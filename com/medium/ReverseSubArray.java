package com.medium;

import java.util.Arrays;

public class ReverseSubArray 
{
	public static boolean canBeEqual(int[] target, int[] arr) {
		Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

	public static void main(String[] args) {
		int[] target=new int[] {1,2,3,4};
		int[] arr=new int[] {2,4,3,1};
		if(canBeEqual(target, arr))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
