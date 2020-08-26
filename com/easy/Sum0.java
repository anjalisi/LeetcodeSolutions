package com.easy;

public class Sum0 {
    public static int[] sumZero(int n) 
    {
    	int[] res=new int[n];
        for(int i=0;i<(n/2);i++)
            {
                res[i]=i+1;
                res[i+(n/2)]=-res[i];
            }
        return res;
    }
    public static void main(String[] args) {
		int n=4;
		sumZero(n);
	}
}
