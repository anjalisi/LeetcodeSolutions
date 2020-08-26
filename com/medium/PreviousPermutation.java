package com.medium;

public class PreviousPermutation {
    public int[] prevPermOpt1(int[] A)
    {
    	 for (int i = A.length - 2; i >= 0; i--) {
             int t = A[i];
             int pos = 0;
             int max = 0;
             for (int j = i + 1; j < A.length; j++) {
                 if (A[j] < t && A[j] > max) {
                     pos = j;
                     max = A[j];
                 }
             }
             if (t > max && max > 0) {
                 A[i] = A[pos];
                 A[pos] = t;
                 return A;
             }
         }
         return A;
    }
}
