package com.medium;

import java.util.PriorityQueue;

public class KClosestToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        /*
        METHOD:
        1. Use MaxHeap as we want the "closest" points 
        2. Add the points in the heap according to the eucledian distance
        3. Remove the root when the size exceeds K
        */

        //Add in heap acc to euclidean distance
        PriorityQueue<int[]> maxHeap= new PriorityQueue<>((a,b)->(b[0]*b[0] + b[1]*b[1]) -(a[0]*a[0] + a[1]*a[1] ));
        for(int i[]:points){
            maxHeap.add(i);
            if(maxHeap.size()>K)
                maxHeap.remove();
        }

        int[][] result= new int[K][2];
        while(K-- >0){
            result[K]= maxHeap.remove();
        }
        return result;
    }
}
