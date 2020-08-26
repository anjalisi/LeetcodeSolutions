package com.challenge;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int len= sc.nextInt();
            int[] arr= new int[len];
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(longestArith(arr, len));
        }
    }

    private static int longestArith(int[] arr, int len) {
        if(arr==null || len==0) return 0;
        int[] dp= new int[len];
    
        for(int i=1; i<len; i++){
            dp[i]= arr[i-1]-arr[i];
        }
        int max= Integer.MIN_VALUE;
        int counter=1;
        for(int i=0; i<arr.length-1;i++)
        {
        	if(arr[i]==arr[i+1])
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
}