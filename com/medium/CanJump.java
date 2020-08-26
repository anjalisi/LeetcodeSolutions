package com.medium;

public class CanJump 
{
	public static boolean canJump(int[] nums) 
	{
		int lastKnownPosition = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= lastKnownPosition){
                lastKnownPosition = i;
            }
        }
        return lastKnownPosition == 0;
    }
	public static void main(String[] args) 
	{
		int arr[]=new int[] {3,2,1,0,4};
		if(canJump(arr))
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
