package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduler {
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
    	//First we need to construct a map from the courses and prerequisite
    	HashMap<Integer,List<Integer>> map = buildMap(numCourses,prerequisites);
    	//We need to find how many dependencies are there on each course
    	int[] inDegree= buildDegreeArray(numCourses,prerequisites);
    	//Doing BFS on all the courses which have 0 dependency (no prerequisite required)
    	Queue<Integer> queue= new LinkedList<Integer>();
    	for(int i=0; i<numCourses; i++)
    	{
    		if(inDegree[i]==0)
    			queue.add(i);
    	}
    	int count=0;
    	
    	while(!queue.isEmpty())
    	{
    		int curr= queue.poll();
    		count++;
    		//Get all the neighbours
    		for(int n: map.get(curr))
    		{
    			inDegree[n]--;
    			if(inDegree[n]==0)
    				queue.add(n);
    		}
    	}
    	
    	return count==numCourses;
    }

	private int[] buildDegreeArray(int numCourses, int[][] prerequisites)
	{
		int[] inDegree= new int[numCourses];
		for(int[] arr: prerequisites)
		{
			inDegree[arr[0]]++;
		}
		return inDegree;
	}

	private HashMap<Integer, List<Integer>> buildMap(int numCourses, int[][] prerequisites) {
		HashMap<Integer,List<Integer>> map= new HashMap<Integer, List<Integer>>();
		//Initialize a arraylist for every course
		for(int i=0; i<numCourses; i++)
			map.put(i, new ArrayList<>());
		//Building the graph
		for(int[] arr:prerequisites)
		{
			int courseX=arr[1];
			int courseDependentOnX= arr[0];
			//Get the list corresponding to the 
			List<Integer> list= map.get(courseX);
			list.add(courseDependentOnX);
			map.put(courseX,list);
		}
		return map;
	}
}
