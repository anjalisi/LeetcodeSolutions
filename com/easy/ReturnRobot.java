package com.easy;

public class ReturnRobot {
    public boolean judgeCircle(String moves) 
    {
    	if(moves.length() <=0 || moves==null)
    		return true;
    	int l=0;
    	
    	for(int i=0; i<moves.length(); i++)
    	{
    		if(moves.charAt(i)=='L')
    			l+=2;

    		if(moves.charAt(i)=='R')
    			l-=2;

    		if(moves.charAt(i)=='U')
    			l+=1;

    		if(moves.charAt(i)=='D')
    			l-=1;
    	}
    	if(l==0)
    		return true;
    	else
    		return false;
    }
}
