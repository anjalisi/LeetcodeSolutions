package com.easy;

public class ReverseBits {
    public int reverseBits(int n) 
    {
    	StringBuilder str= new StringBuilder(n);
    	StringBuilder res= str.reverse();
    	int result=0;
        for(int i=0;i<32;i++)
        {
            //We shift result by 1 and add the mod value of n ( 0000---->0001--->0011--->0111---->1110)
            result<<=1;
           result=result+n%2;
            //After appending a bit we do logical shift by 1 for n
            n>>>=1;
          
        }
        return result;
    }
}
