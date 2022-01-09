package com.medium;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        /*
            [1 ,2 ,3 ,4 ,5 ,6 ,7]
            
        Step1: Reverse poora array
        [7, 6, 5, 4, 3, 2, 1]
        Step2: Reverse from 0 to k-1
        [7, 6, 5, 4, 3, 2, 1]
        
        Step 3: Reverse from k to end
        [1, 2, 3, 4, 5, 6, 7]
        */
    }

    private void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }

}
