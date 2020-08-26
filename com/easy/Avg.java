package com.easy;

public class Avg {
    public static double average(int[] salary)
    {
    	int min=Integer.MAX_VALUE;
    	int max= Integer.MIN_VALUE;
    	for(int i=0; i<salary.length; i++)
    	{
    		if(min>salary[i])
    			min=salary[i];
    		if(max<salary[i])
    			max=salary[i];
    	}
    	double res=0;
    	for(int i=0; i<salary.length; i++)
    	{
    		if(salary[i]!=min && salary[i]!=max)
    			res+= salary[i];
    	}
    	return res/(salary.length-2);
    }
    public static void main(String[] args) {
		int[] salary= {4000,3000,1000,2000};
		System.out.println(average(salary));
	}
}
