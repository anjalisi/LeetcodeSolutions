package com.easy;

public class PlaceFlowers {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int i=1; 
		if(n==0)
			return true;
		if(flowerbed.length==1)
		{
			if(flowerbed[0]==0)
			{
				n--;
				if(n==0)
					return true;
			}
			else
				return false;
		}
		if(flowerbed[1]==0 && flowerbed[0]==0)
		{
			n--;
			System.out.println("start");
			flowerbed[0]=1;
			if(n==0)
				return true;
		}
		if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
		{
			n--;
			System.out.println("end"+n);
			flowerbed[flowerbed.length-1]=1;
			if(n==0)
				return true;
		}
		while(i<flowerbed.length-1)
		{
			System.out.println("aaya"+ flowerbed[i-1] +flowerbed[i+1]);
			if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0)
			{
				System.out.println(flowerbed[i-1]+" "+flowerbed[i+1]+" "+i);
				flowerbed[i]=1;
				n--;
				//i++;
				if(n==0)
					return true;
			}
			i++;
		}
		return false;
    }
	public static void main(String[] args) {
		int[] arr=new int[] {1,0,0,0,1,0,0};
		int n=2;
		if(canPlaceFlowers(arr, n))
			System.out.println("Hey");
		else
			System.out.println("no");
	}
}
