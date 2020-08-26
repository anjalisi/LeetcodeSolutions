package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveSubfolders 
{
	public List<String> removeSubfolders(String[] folder) 
	{
		Arrays.sort(folder);
		List<String> res= new ArrayList<String>();
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0; i<folder.length; i++)
		{
			String[] temp= folder[i].split("/");
			String str= new String();
			boolean check= false;
			for(int j=0; j<temp.length; j++)
			{
				str+=temp[j];
				if(map.containsKey(str))
				{
					check = true;
					break;
				}
			}
			if(!check)
			{
				map.put(str, 1);
				res.add(folder[i]);
			}
		}
		return res;
	}
}
