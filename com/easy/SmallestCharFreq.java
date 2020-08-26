package com.easy;

public class SmallestCharFreq {
	 public int[] numSmallerByFrequency(String[] queries, String[] words) 
	 {
		 int[] frequencies = new int[12];
	        for (String word : words) {
	            int functionResult = f(word);
	            frequencies[functionResult - 1]++;
	        }
	        
	        for (int i = 10; i >= 0; i--) {
	            frequencies[i] += frequencies[i+1];
	        }

	        int[] result = new int[queries.length];
	        for (int index = 0; index < queries.length; index++) {
	            int functionResult = f(queries[index]);
	            result[index] = frequencies[functionResult];
	        }
	        
	        return result;
	    }
	    
	    private int f(String s) {
	        char minValue = 'z';
	        int frequency = 0;
	        
	        for (int index = 0; index < s.length(); index++) {
	            char current = s.charAt(index);
	            if (current == minValue) {
	                frequency++;
	            } else if (current < minValue) {
	                minValue = current;
	                frequency = 1;
	            }
	        }
	        
	        return frequency;
	    }
}
