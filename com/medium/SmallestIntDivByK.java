package com.medium;

public class SmallestIntDivByK {
    public int smallestRepunitDivByK(int K) 
    {
    	  int r = 0;
          int count = 0;
          
          if (K % 2 == 0 || K % 5 == 0 || K == 0)
              return -1;
          
          do {
              r = (r * 10 + 1) % K;
              count++;
          }  while (r != 0);
          
          return count;
    }
}
