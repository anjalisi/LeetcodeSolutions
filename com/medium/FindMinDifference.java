package com.medium;

import java.util.List;

public class FindMinDifference {
    public int findMinDifference(List<String> timePoints) 
    {
    	//We make a boolean array to store all the possible times
    	boolean[] timeseen= new boolean[24*60];
    	for(String time:timePoints)
    	{
    		String[] arr= time.split(":");
    		
    		int hour= Integer.parseInt(arr[0]);
    		int min= Integer.parseInt(arr[1]);
    		
    		//If we have already visited this time before, then the minimum difference would be 0, obviously.
    		
    		if(timeseen[(hour*60)+(min)])
    			return 0;
    		//We need to note down all the timings
    		timeseen[(hour*60)+(min)]= true;	
    		
    	}
    	Integer firstseen=null;
    	Integer prevseen=null;
    	Integer min_diff= Integer.MAX_VALUE;
    	
    	//Now we will traverse the timeseen list to find the minimum difference
    	for(int i=0; i<1440; i++)
    	{
    		if(timeseen[i])
    		{
    			//Setting the first time
    			if(firstseen==null)
    			{
    				firstseen=i;
    				prevseen=i;
    			}
    			else
    			{
    				//We have to check the clockwise and anticlockwise difference
    				min_diff= Math.min(min_diff, Math.min(i-prevseen, 1400-i+prevseen));
    				prevseen= i;
    			}
    		}
    	}
    	min_diff=  Math.min(min_diff, Math.min(prevseen-firstseen, 1400-prevseen+firstseen));
    	return min_diff;
    }
}
