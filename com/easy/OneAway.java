package com.easy;

public class OneAway {
	public static boolean oneAway(String s, String t)
	{
		if(Math.abs(s.length()-t.length())>1) return false;
		int i=0, j=0;
		int count=0;
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				if(count >=1) return false;
				if(s.length() > t.length()) i++;
				if(s.length() < t.length()) j++;
				else
				{
					i++;
					j++;
				}
				count++;
			}
		}
		if(i<s.length() || j<t.length())
			count++;
		return count==1;
	}
}
