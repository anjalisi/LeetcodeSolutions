package com.medium;

public class EqualSubstrWithBudget 
{
    public int equalSubstring(String s, String t, int maxCost) 
    {
    	int winStart = 0, maxLength = Integer.MIN_VALUE, currCost = 0;   
        for(int winEnd = 0; winEnd < s.length(); ++winEnd)
        {
            currCost += Math.abs((int)(s.charAt(winEnd)-t.charAt(winEnd)));
            while(currCost > maxCost)
            {
                currCost -= Math.abs((int)(s.charAt(winStart)-t.charAt(winStart)));
                winStart++; 
            }
            maxLength = Math.max(maxLength, winEnd-winStart+1);
        }
        return maxLength; 
    }
}
