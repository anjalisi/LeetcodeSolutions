package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathFromSourceToEnd {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	//This queue will store all the paths
    	Queue<List<Integer>> paths= new LinkedList();
    	paths.add(Arrays.asList(0));
    	
    	int goal= graph.length-1;
    	while(!paths.isEmpty())
    	{
    		List<Integer> currPath= paths.poll();
    		//Extracting the last node
    		int lastNode=currPath.get(currPath.size()-1);
    		//if lastNode=destination, then we have reached the goal, add to result
    		if(lastNode==goal)
    			res.add(new ArrayList<Integer>(currPath));
    		else
    		{
    			//We need to extract the neighbours from the current node
    			int[] neighbour= graph[lastNode];
    			//Add every possible path to the queue
    			for(int n: neighbour)
    			{
    				List<Integer> temp= new ArrayList<Integer>(currPath);
    				temp.add(n);
    				paths.add(temp);
    			}
    		}
     	}
    	return res;
    }
}
