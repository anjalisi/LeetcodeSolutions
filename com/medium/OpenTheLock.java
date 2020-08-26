package com.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OpenTheLock {
    public int openLock(String[] deadends, String target) 
    {
    	HashSet<String> deadend= new HashSet<String>(Arrays.asList(deadends));
    	HashSet<String> visited= new HashSet<String>();
    	visited.add("0000");
    	Queue<String> queue= new LinkedList<String>();
    	queue.offer("0000");
    	int level=0;
    	
    	while(!queue.isEmpty())
    	{
    		int size= queue.size();
    		while(size >0)
    		{
    			String currLock= queue.poll();
    			if(deadend.contains(currLock))
    			{
    				size--;
    				continue;
    			}
    			if(currLock.equals(target))
    			{
    				return level;
    			}
    			StringBuilder sb= new StringBuilder(currLock);
    			for(int i=0; i<4; i++)
    			{
    				char pos= sb.charAt(i);
    				String s1=sb.substring(0,i)+(pos=='9'?0: pos-'0'+1)+sb.substring(i+1);
    				String s2=sb.substring(0,i)+(pos=='0'?9: pos-'0'-1)+sb.substring(i+1);
    				
    				if(!visited.contains(s1) && !deadend.contains(s1))
    				{
    					queue.offer(s1);
    					visited.add(s1);
    				}
    				if(!visited.contains(s2) && !deadend.contains(s2))
    				{
    					queue.offer(s2);
    					visited.add(s2);
    				}
    			}
    			size--;
    		}
    		level++;
    	}
    	return -1;
    }
}
