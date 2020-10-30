package com.medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
    /*
    METHOD:
    1. To store the characters along with their frequency, we can use a HashMap
    2. To sort the characters, we can use a heap
    3. After all the characters are added, we just need to remove it and add it to the result
    */   
        if(s.length()==0|| s==null) return s;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        //Create a heap
        PriorityQueue<Character> maxHeap= new PriorityQueue<>((a,b)-> map.get(b)- map.get(a));
        //Add all the values to the maxHeap
        maxHeap.addAll(map.keySet());

        //Now extract and add it to the result
        StringBuilder res= new StringBuilder();
        while(!maxHeap.isEmpty()){
            char curr= maxHeap.remove();
            //add this character according to the frequency at which it occurs
            for(int i=0; i<map.get(curr); i++)
                res.append(curr);
        }
        return res.toString();
    }
}
