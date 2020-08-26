package com.medium;

import java.util.ArrayList;
import java.util.List;import com.easy.Str;

public class AllPermutationsOfString {
	public static List<String> allPermutation(String s)
	{
		List<List<String>> res= new ArrayList<List<String>>();
		List<String> list= new ArrayList<String>();
		helper(s, "", list, res);
		return res.get(res.size()-1);
	}

	private static void helper(String s, String perm, List<String> list, List<List<String>> res) {
		if(s.length()==0)
		{
			System.out.println(perm);
			list.add(perm);
			res.add(new ArrayList<String>(list));
			return;
		}
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s+" "+perm);
			
			helper(s.substring(0,i)+s.substring(i+1), perm+s.charAt(i), list, res);
		}		
	}
	public static void main(String[] args) {
		String s="jsp";
		System.out.println(allPermutation(s));
	}
}
