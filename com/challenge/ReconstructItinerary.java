package com.challenge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary {
    LinkedList<String> res;
    Map<String, PriorityQueue<String>> graph;
	public List<String> findItinerary(List<List<String>> tickets) {
		res= new LinkedList<String>();
		graph= new HashMap<String, PriorityQueue<String>>();
		
		for(List<String> t: tickets)
		{
			graph.putIfAbsent(t.get(0),new PriorityQueue());	//Adding a priority queue for each FROM	
			graph.get(t.get(0)).add(t.get(1));	//Adding the value of each key to create map
			
		}
		dfs("JFK");	//Adding initial value
		return res;
    }
	private void dfs(String current) {
		PriorityQueue<String> arrivals= graph.get(current); //Getting all the values for a key in order
		while(arrivals !=null && !arrivals.isEmpty())
			dfs(arrivals.poll());
		res.addFirst(current);
		
	}
    
}
