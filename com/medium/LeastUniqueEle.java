package com.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastUniqueEle {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
    	Map<Integer,Integer> map = new HashMap();
    	for(int a : arr) map.put(a, map.getOrDefault(a,0)+1);

    	PriorityQueue<Integer> q = new PriorityQueue((a,b)->map.get(a)-map.get(b));
    	for(int key : map.keySet()) q.offer(key);

    	while(k > 0 && !q.isEmpty()) k -= map.get(q.poll());

    	return k < 0 ? q.size() + 1 : q.size();
    }
}
