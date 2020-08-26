package com.medium;

public class ValidIP {
    public String validIPAddress(String IP) 
    {
    	//first count the number of . 
    	if(IP.chars().filter(c->c=='.').count()==3) 
    	{
    		//now split every string from .
    		for(String str:IP.split("\\.",-1))
    		{
    			if(str.length()==0 || str.length()>3)
    				return "Neither";
    			if(str.charAt(0)==0 && str.length()!=1)
    				return "Neither";
    			if(Integer.parseInt(str)>255)
    				return "Neither";
    			for(char c:str.toCharArray())
    			{
    				if(!Character.isDigit(c))
    					return "Neither";
    			}
    		}
    		return "IPv4";
    	}
    	else if(IP.chars().filter(c->c==':').count()==7)
    	{
    		for(String str: IP.split(":",-1)) {
    			if(str.length()==0 || str.length()>4)
    				return "Neither";
    			for(char c: str.toCharArray())
    			{
    				if(!(c>='0' && c<='9' || c>='a' && c<='f' || c>='A' && c<='F'))
    					return "Neither";
    			}
    		}
    		return "IPv6";
    	}
    	return "Neither";
    }
}
