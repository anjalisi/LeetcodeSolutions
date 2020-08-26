package com.medium;

public class MaximumSwap {
	public int maximumSwap(int num) 
	{
		String numStr = Integer.toString(num);
	    int n = numStr.length();
	    int max = num;
	    
	    for(int i = 0 ; i < n ; i++) {
	      for(int j = n - 1 ; j > i ; j--) {
	        int n1 = (numStr.charAt(i) - '0');
	        int n2 = (numStr.charAt(j) - '0');
	        int temp = 0;
	        if(n2 > n1) {
	          temp = num + (n2 * (int)Math.pow(10, n - i - 1) + 
	                       n1 * (int)Math.pow(10, n - j - 1) - 
	                       n1 * (int)Math.pow(10, n - i - 1) -
	                       n2 * (int)Math.pow(10, n - j - 1));
	          if(temp > max)
	            max = temp;
	        }
	      }
	    }
	    
	    return max;
    }
}
