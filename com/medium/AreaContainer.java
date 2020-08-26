package com.medium;

public class AreaContainer 
{
	public static void main(String[] args) {
		int[] arr=new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}

	private static int maxArea(int[] arr) {
		int area=0;
		for(int i=0, j=arr.length-1;i<j; )
		{
			area=Math.max(area, (j-i)*Math.min(arr[i], arr[j]));
			if(arr[i]<=arr[j])
			{
				i++;
			}
			else
				j--;
		}
		return area;
	}
}
