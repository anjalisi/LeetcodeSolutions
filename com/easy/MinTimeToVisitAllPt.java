package com.easy;

public class MinTimeToVisitAllPt 
{
    public static int minTimeToVisitAllPoints(int[][] points) 
    {
    	int res = 0;

        for(int i=0; i<points.length-1; i++) {
            int xAxisdist = Math.abs(points[i][0] - points[i+1][0]);
            int yAxisdist = Math.abs(points[i][1] - points[i+1][1]);
            
            res += Math.min(xAxisdist, yAxisdist) + Math.abs(xAxisdist - yAxisdist);
        }
        return res;
    }
    public static void main(String[] args) {
		int[][] points= {{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(points));
	}
}
