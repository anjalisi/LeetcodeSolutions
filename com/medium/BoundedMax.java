package com.medium;

public class BoundedMax
{
	public int numSubarrayBoundedMax(int[] A, int L, int R) {
		int i=0,j=0,cnt=0,m=0; 
        while(j<A.length){
            if(A[j]>=L && A[j]<=R)
                m=j-i+1;
            else if(A[j]>R){ 
                m=0;
                i=j+1;
            }
            cnt+=m;
            j++;
        }
        return cnt; 
    }
}
