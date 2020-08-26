package com.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankVotersByVote {
    public String rankTeams(String[] votes) 
    {
    	int m=votes.length;
    	int n= votes[0].length();
    	//Creating a hashmap to store the characters and their freq at 
    	// various positions
    	Map<Character, int[]> map=new HashMap<>();
    	for(int i=0; i<m; i++)
    	{
    		for(int j=0; j<n; j++)
    		{
    			char ch= votes[i].charAt(j);
    			map.computeIfAbsent(ch,a -> new int[n]);//assigning a arr of size n for every character
    			map.get(ch)[j]++;
    		}
    	}
    	//Now making a list to store the character according to the no. of votes
    	List<Character> res= new ArrayList<>(map.keySet());	//The key set has all the characters
    	//Add the chars according to the votes, using Collections.sort()
    	Collections.sort(res, (a,b)->
    	{
    		for(int i=0; i<n; i++)
    			if(map.get(b)[i]!=map.get(a)[i]) return map.get(b)[i]-map.get(a)[i];
    		return 0;
    	});
    	//Now we need to convert this to a string
    	StringBuilder sb= new StringBuilder();
    	for(int i=0; i<res.size(); i++)
    		sb.append(res.get(i));
    	return sb.toString();
    }
}
