package com.easy;

public class Monotonic {
    public boolean isMonotonic(int[] A) 
    {
    	 boolean increasingMonotone = false;
         //to check if  cosecutive numbers are in decresing  order
         boolean decreasingMontone = false;
         
         for(int i=0;i<A.length-1;i++)
         {
             //if consecutive elemnts are same ignore
             if(A[i] == A[i+1])
             {
                 continue;
             }
             
             //if increasing order set increasingMonotone to true
             if(A[i] > A[i+1])
             {
                 increasingMonotone = true;
             }
             
             //if decresing order set decreasingMontone to true
              if(A[i] < A[i+1])
             {
                 decreasingMontone = true;
             }
             
             //if one consecutive pair in the array is in incresing order and other is in decresing order
             //then the array is not monotonic
            if(increasingMonotone && decreasingMontone )
            {
                return false;
            }
             
         }
         
       
         
         return true;}
}
