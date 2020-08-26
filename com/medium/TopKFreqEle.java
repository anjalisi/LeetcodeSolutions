package com.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqEle {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        	h.put(nums[i],h.getOrDefault(nums[i],1)+1);
        //create a minheap
        PriorityQueue<Map.Entry<Integer, Integer>> queue= new PriorityQueue<>(Comparator.comparing(e-> e.getValue()));
        for(Map.Entry<Integer, Integer> entry: h.entrySet())
        {
        	queue.offer(entry); //inserting in the queue
        	if(queue.size()> k)
        		queue.poll();
        }
        
        List<Integer> res= new ArrayList<Integer>();
        while(queue.size()>0)
        	res.add(queue.poll().getKey());
        Collections.reverse(res);
        return res;
    }
//public int[] topKFrequent(int[] nums, int k) {
//        
//        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
//        int res[] = new int[k];
//        
//        for(int num : nums){
//            int count = 0;
//            if(hashmap.containsKey(num)){
//                count = hashmap.get(num);
//            }
//            hashmap.put(num, count+1);
//        }
//        
//        for(int i=1; i<=k; i++){
//            int max = Integer.MIN_VALUE;
//            int key = 0;
//            for(int num : hashmap.keySet()){
//                int freq = hashmap.get(num);
//                if(freq<0)continue;
//                
//                if(freq>max){
//                    max = freq;
//                    res[i-1] = num;
//                    key = num;
//                }
//            }
//            hashmap.put(key, -1);
//        }
//        
//        return res;
//        
//    }
}
