package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.easy.Str;

public class UncommonString {
    public static String[] uncommonFromSentences(String A, String B) 
    {
    	String[] a= A.split(" ");
    	String[] b= B.split(" ");
    	HashSet<String> map= new HashSet<String>();
    	for(int i=0; i<a.length; i++)
    	{
    		if(!map.contains(a[i]))
    			map.add(a[i]);
    		else
    			map.remove(a[i]);
    	}
    	for(int i=0; i<b.length; i++)
    	{
    		if(!map.contains(b[i]))
    			map.add(b[i]);
    		else
    			map.remove(b[i]);
    	}
    	String[] res= new String[map.size()];
    	map.toArray(res);
    	
    	return res;
    }
    public static void main(String[] args) {
		String A="AppLe apple";
		String B="banana";
		System.out.println(A.toLowerCase());
		System.out.println(uncommonFromSentences(A, B));
	}
}
