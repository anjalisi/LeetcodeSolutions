package com.easy;

public class Busstop {
	 public int distanceBetweenBusStops(int[] distance, int start, int destination) {
         if (start == destination) 
        	 return 0;
         if (start > destination) 
        	return distanceBetweenBusStops(distance, destination, start);
         int sum = 0, total = 0;
         for (int i = 0; i < distance.length; i++) 
         {
            if (i >= start && i < destination) sum+= distance[i];
            total += distance[i];
         }
         return Math.min(sum, total - sum);
    }
}
