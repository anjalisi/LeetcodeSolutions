package com.easy;

public class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index= m+n-1;
        //Decreemnt m & n by 1, so that they are equal to the last index of the respective arrays
        int firstIndex = m-1;
        int secondIndex = n-1;

        while(secondIndex >=0){
            if(firstIndex>=0 && nums1[firstIndex] > nums2[secondIndex])
                nums1[index--] = nums1[firstIndex --];
            else
                nums1[index--] = nums2[secondIndex--];
        }
    }
}