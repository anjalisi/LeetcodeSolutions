package com.easy;

public class IDID {
    public int[] diStringMatch(String S) {
        int[] res= new int[S.length()+1];
        int a=0;
        int b=res.length;
        for(int i=0;  i<S.length(); i++)
        {
        	if(S.charAt(i)=='I')
        		res[i]=a++;
        	else
        		res[i]=b--;
        }
        res[res.length-1]=b--;
        return res;
        
    }
}
