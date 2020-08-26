package com.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map; 

public class WeakestRows 
{
	public int[] kWeakestRows(int[][] mat, int k) 
	{
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		int[] result= new int[k];
		int count=0;
		for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count += 1;
                }
            }
            h.put(i, count);
            count = 0;
        }
		Map<Integer, Integer> hm1 = sortByValue(h);
        //making result array
        int i=0;
        for (Map.Entry<Integer, Integer> aa : hm1.entrySet()) {
            result[i]=aa.getKey(); 
            i++;
            if(i>=k)
            {
                 break;
            }
        }
        
        return result;
    }

	private Map<Integer, Integer> sortByValue(HashMap<Integer, Integer> h) {
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(h.entrySet());
        
	       // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
	            @Override
	            public int compare(Map.Entry<Integer, Integer> o1, 
	                    Map.Entry<Integer, Integer> o2) {
	                return o1.getValue().compareTo(o2.getValue());
	            }
	        });

	        // put data from sorted list to hashmap  
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
	        for (Map.Entry<Integer, Integer> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
	}
}
