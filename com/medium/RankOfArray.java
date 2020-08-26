package com.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RankOfArray 
{
	 public int[] arrayRankTransform(int[] arr)
	 {
		 Map<Integer, Integer> map=new TreeMap<>();
		 //keys are stored in sorted order in treemap
		 for(int i=0; i<arr.length; i++)
		 {
			 map.put(arr[i],i);
		 }
		 int rank=1;
		 for(int val: map.values())
		 {
			 arr[val]=rank++;
		 }
		 return arr;
	 }
//	 int[] rankMatrix = new int[arr.length];
//     System.arraycopy(arr, 0, rankMatrix, 0, arr.length);
//     Arrays.sort(rankMatrix);
//         
//     Map<Integer, Integer> map = new HashMap<>();
//     int rank=1;
//     
//     for(int i : rankMatrix){
//         if(!map.containsKey(i)){
//             map.put(i, rank++);
//         }
//     }
//     for(int i = 0; i < arr.length; i++){
//         arr[i] = map.get(arr[i]);            
//     }
//     return arr; 
	 
}
