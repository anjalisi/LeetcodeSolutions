package com.easy;

public class MergeTwoArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index= m+n-1;
        //Decreemnt m & n by 1, so that they are equal to the last index of the respective arrays
        m--; n--;
        while(m>=0 && n>=0){
            if(nums1[m] > nums2[n])
                nums1[index--]= nums1[m--];
            else
                nums1[index--]= nums2[n--];
        }
        while(n>=0)
            nums1[index--]= nums2[n--];
    }
}