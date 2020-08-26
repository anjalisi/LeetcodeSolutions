package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString {
    public List<Integer> findAnagrams(String s, String p)
    {
    	List<Integer> res= new ArrayList<Integer>();
    	if(s.length()==0 ||s==null) return res;
    	//We make 2 arrays to store the char count for each alphabet
    	int[] scount= new int[26];
    	int[] pcount= new int[26];
    	//Now we will add for the first window
    	for(int i=0; i<p.length(); i++)
    	{
    		scount[s.charAt(i)-'a']++;
    		pcount[p.charAt(i)-'a']++;
    	}
    	//Now we will check for the rest of the string
    	for(int i=p.length(); i<s.length(); i++)
    	{
    		//i-p.length will give the start of the window
    		if(Arrays.equals(scount, pcount)) res.add(i-p.length());
    		//Move the right window forward
    		scount[s.charAt(i)-'a']++;
    		//Move the left window forward (we will just remove its char)
    		scount[s.charAt(i-p.length())-'a']--;
    	}
    	//Check for the last window
		if(Arrays.equals(scount, pcount)) res.add(s.length()-p.length());
		return res;
    }
}
