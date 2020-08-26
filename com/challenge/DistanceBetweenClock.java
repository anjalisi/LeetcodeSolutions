package com.challenge;

public class DistanceBetweenClock {
    public static double angleClock(int hour, int minutes) 
    {
    	double mins= minutes;
    	double hr= hour;
    	return Math.min(Math.abs((11*(mins/2)) -(30*(hr%12))),Math.abs(360- ((11*(mins/2)) -(30*(hr%12)))));
    }
    public static void main(String[] args) {
		int hour= 3;
		int minutes= 15;
		System.out.println(angleClock(hour, minutes));
		System.out.println(60%57);
		System.out.println(12%11);
	}
}
