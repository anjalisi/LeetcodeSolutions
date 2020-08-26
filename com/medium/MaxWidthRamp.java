package com.medium;

import java.util.Stack;

public class MaxWidthRamp {
    public int maxWidthRamp(int[] A) 
    {
    	Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty() || A[stack.peek()] > A[i]) {
                stack.push(i);
            }
        }
        int max = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[i] >= A[stack.peek()]) {
                max = Math.max(max, i - stack.peek());
                stack.pop();
            } 
        }
        return max;
    }
}
