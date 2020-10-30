package com.medium;

import java.util.PriorityQueue;

public class KthLargestElement {
    /*
    METHOD:
    1. Iterate through the array and add elements in a min Heap.
    2. When the size of the heap exceeds k, pop one element. (that element will be smaller than what we need anyway)
    3. At the end, return the root node, as that would be the kth largest element
    */
    
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            priorityQueue.add(nums[i]);
            if(priorityQueue.size()>k)
                priorityQueue.remove();
        }
        return priorityQueue.remove();
    }
}
