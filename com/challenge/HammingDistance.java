package com.challenge;

public class HammingDistance 
{
	public int hammingDistance(int n1, int n2) {
        int x = n1 ^ n2; 
    int setBits = 0; 
  
    while (x > 0)  
    { 
        setBits += x & 1; 
        x >>= 1; 
    } 
  
    return setBits;    
    }
}
