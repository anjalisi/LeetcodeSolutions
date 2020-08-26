package com.easy;

public class GetNoZero {
    public int[] getNoZeroIntegers(int n) {
    	 for (int i = 1; i < n; i++) {
             if (!containsZero(i) && !containsZero(n - i)) 
                 return new int[]{i, n - i};
         }
         
         return new int[0];
     }
     
     private boolean containsZero(int i) {
         int copy = i;
         while (copy > 0) {
             int digit = copy % 10;
             if (digit == 0) return true;
             copy /= 10;
         }
         return false;
    }
}
