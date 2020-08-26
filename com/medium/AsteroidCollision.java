package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> path = new Stack<Integer>();
        for(int i=0; i<asteroids.length; i++)
        {
        	if(path.isEmpty() || asteroids[i]>0)
	        	path.push(asteroids[i]);
        	else 
        	{
        		while(true)
        		{
        			int curr= path.peek();
        			if(curr<0) {
        				path.push(asteroids[i]);
        				break;
        			}
        			else if(curr== -asteroids[i]) {
        				path.pop();
        				break;
        			}
        			else if(curr > -asteroids[i])  break;
        			else
        			{
        				path.pop();
        				if(path.isEmpty()) {
        					path.push(asteroids[i]);
        					break;
        				}
        			}
        		}
        	}
        }
        
        int[] result= new int[path.size()];
        for(int i=path.size()-1; i>=0; i--)
        	result[i]=path.pop();
        return result;
    }
    public static void main(String[] args) {
		int[] asteroids= {10,2,-5};
		System.out.println(asteroidCollision(asteroids));
	}
}
