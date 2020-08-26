package com.easy;

import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) 
    {
    	
    	if(paths==null)
    		return "";
    	//Make a hashset for both source and destination
    	HashSet<String> source = new HashSet<String>();
    	HashSet<String> destination = new HashSet<String>();
    	
    	for(List<String> list:paths)
    	{
    		source.add(list.get(0));
    		destination.add(list.get(1));
    	}
    	
    	for(String city: destination)
    	{
    		if(!source.contains(city))
    			return city;
    	}
    	return "";
    }
}
