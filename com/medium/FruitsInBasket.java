package com.medium;

import java.util.HashMap;

public class FruitsInBasket {
    /*
    METHOD:
    1. What this question actually wants is the longest continuous subarray with 2 distinct numbers.
    2. For that, we can take a HashMap, and as we traverse the array, we can put the number along with it's position there
    3. As soon as the Maps size exceeds 2, we have to drop the first type, whose index would be in the map already, 
    and then do the same thing again
    4. After every update, we need to update our max length. 
    */
    public int totalFruit(int[] tree) {
        if(tree==null || tree.length==0) return 0;
        int max=0;
        int i=0, j=0;
        HashMap<Integer, Integer> hashMap= new HashMap<>();

        while(j< tree.length){
            //We can add 
            if(hashMap.size() <= 2)
                hashMap.put(tree[j],j++);
            
            
            if(hashMap.size() > 2){
                //We need to find the index to leave
                int minIndex= tree.length-1;
                for(int val: hashMap.values())
                    minIndex= Math.min(minIndex, val);
                
                //Update the index i
                i= minIndex+1;
                //remove the old fruit type
                hashMap.remove(tree[minIndex]);
            }
            max=Math.max(max, j-i);
        }
        return max;
    }
}
