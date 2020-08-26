package com.easy;

public class ConstructRectangle {
	public int[] constructRectangle(int area) 
	{
		int width = (int) Math.sqrt(area);
        int[] result = new int[2];
        for (int i = width; i > 0; i--) {
            if (area % i == 0) {
                result[0] = area/ i;
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
