package com.medium;

import java.util.ArrayList;

public class MinNumberofFibonnaciSumK {
	// Function to calaculate Fibonacci Terms 
	public static void calcFiboTerms(ArrayList<Integer> fiboterms, 
															int k) 
	{ 
		int i = 3, nextTerm = 0; 
			
		fiboterms.add(0); 
		fiboterms.add(1); 
		fiboterms.add(1); 
			
		// Calculate all Fibonacci terms 
		// which are less than or equal to k. 
		while(true) 
		{ 
			nextTerm = fiboterms.get(i - 1) + fiboterms.get(i - 2); 
				
			// If next term is greater than k 
			// do not add in arraylist and return. 
			if(nextTerm>k) 
			return; 
				
			fiboterms.add(nextTerm); 
			i++; 
		} 
	} 
	
	// Function to find the minimum number of 
	// Fibonacci terms having sum equal to k. 
	public static int findMinFibonacciNumbers(int k) 
	{ 
		// ArrayList to store Fibonacci terms. 
		ArrayList<Integer> fiboterms = new ArrayList<Integer>(); 
		calcFiboTerms(fiboterms,k); 
		
		int count = 0, j = fiboterms.size() - 1; 
		
		// Subtract Fibonacci terms from sum k 
		// until sum > 0. 
		while(k > 0) 
		{ 
			// Divide sum k by j-th Fibonacci term to find 
			// how many terms it contribute in sum. 
			count += (k / fiboterms.get(j)); 
			k %= (fiboterms.get(j)); 
			
			j--; 
		} 
		return count; 
	} 
	
}
