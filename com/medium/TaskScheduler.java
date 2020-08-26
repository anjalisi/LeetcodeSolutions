package com.medium;

import java.util.Arrays;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) 
	{
		int[] charFreq= new int[26];
		for(char c:tasks)
		{
			charFreq[c-'A']++;	//Gets to the index of the array of the current character
		}
		
		Arrays.sort(charFreq);	//So that most frequent task is at the end of the array
		int mostFreq= charFreq[25] -1;	//subtract 1, because we dont have to wait for the last one 
		
		int idleSlots= mostFreq*n;
		
		for(int i=24; i>=0; i--)
		{
			idleSlots -= Math.min(charFreq[i], mostFreq);	
		}
		//If we could not fill up all the tasks, we will have to add them to the len of tasks
		return idleSlots > 0 ? idleSlots+tasks.length: tasks.length;  
	}
}
