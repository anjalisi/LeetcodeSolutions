package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchAutocomplete {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) 
    {
    	List<List<String>> res= new ArrayList<List<String>>();
    	int low=0, high= products.length-1;
    	
    	Arrays.sort(products);	//Sorting in lexically increasing order
    	for(int i=0; i<searchWord.length(); i++)
    	{
    		//Checking from the low side
    		while((low <= high) &&(products[low].length() <= i || 
    				products[low].charAt(i) != searchWord.charAt(i)))
    			low++;	//if the character does not match, we do not need to search that word
    		
    		//Checking from the end side
    		while((low <= high ) && (products[high].length() <= i || 
    				products[high].charAt(i) != searchWord.charAt(i)))
    			high--;	//if the character does not match, we do not need to search that word
    		
    		//After this is done, we will have our search from low+3 (as we can choose only 3 words maximum)
    		//And it can only go upto high+1 maximum
    		int min= Math.min(low+3, high+1);
    		
    		//Adding to the results now
    		List<String> temp= new ArrayList<String>();
    		for(int j=low; j<min; j++)
    		{
    			temp.add(products[j]);
    		}
    		res.add(temp);
    	}
    	
    	return res;
    }
}
