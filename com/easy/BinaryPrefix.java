package com.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefix 
{
	public static List<Boolean> prefixesDivBy5(int[] A) 
	{
//		List<Boolean> l=new ArrayList<Boolean>();
//
//		StringBuilder s=new StringBuilder();
//		for(int i=0; i<A.length; i++)
//		{
//			s.append(A[i]);
//			int dec=Integer.parseInt(s.toString(),2);
//			if(dec%5==0)
//				l.add(true);
//			else
//				l.add(false);
//		}
//		return l;
		List<Boolean> res = new ArrayList<>();
        int n = 0;
        
        for(int a : A) {
            // shift `n` to its left by 1 and do an OR operation between the 
            // last bit of `n` and current bit in the given array. In effect, 
            // it is equivalent to `n*2 + a`
            n = n << 1 | a;
            res.add(n%5 == 0);
            // mod the new number by 5 to downsize `n` and therefore avoid 
            // overflow
            n %= 5;
        }
        
        return res;
    }
	public static void main(String[] args) {
		int[] arr=new int[] {0,1,1};
		prefixesDivBy5(arr);
	}
}
