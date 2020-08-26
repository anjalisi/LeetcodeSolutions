package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
    	List<List<String>> res= new ArrayList<List<String>>();
    	//Make a Hashmap to store all the lists as per a string
    	HashMap<String, List<String>> map= new HashMap<String, List<String>>();
    	for(String curr: strs)
    	{
    		char[] chars=curr.toCharArray();
    		Arrays.sort(chars);
    		String sorted= new String(chars);
    		//Now we will add this sorted in the map, and initialise a list for it
    		if(!map.containsKey(sorted))
    			map.put(sorted, new ArrayList<String>());
    		//We now get the key, and add the string "curr" to our list
    		map.get(sorted).add(curr);
    	}
    	res.addAll(map.values());
    	return res;
    }
}
