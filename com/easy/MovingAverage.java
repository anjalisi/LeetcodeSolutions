package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> queue;
    private int maxSize;
    private int sum;
    public MovingAverage(int size) {
        queue= new LinkedList<>();
        maxSize= size;
        sum=0;
    }
    /*
    Remove the elements added first in the list when the size is exceeding
    Remove the element from the sum too
    */
    public double next (int num){

        if(queue.size()==maxSize){
            sum -= queue.remove();
        }
        queue.add(num);
        sum += num;
        return sum/queue.size();
    }
}
