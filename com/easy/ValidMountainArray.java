package com.easy;

public class ValidMountainArray
{
    public boolean validMountainArray(int[] A)
    {
    	if(A.length< 3 || A==null)
    		return false;
    	boolean flip=false;
        for(int i=1; i<A.length-1; i++){
            if(A[i-1]<A[i] && A[i]>A[i+1])
                flip=true;
            if(A[i-1]>=A[i] && flip==false)
                return false;
            if(A[i]<=A[i+1] && flip==true)
                return false;
            if(i==A.length-2 && flip==false)
                return false;
        }
        return true;
    }
}
