package com.medium;

public class SparseSearch {
	public static int sparseSearch(String[] s, String target)
	{
		//We need to do a binary search. But since we have empty strings
		//we have to find the closest from the current pos, where the
		//String is not empty
		return sparseSearchHelper(s, target, 0, s.length);
	}

	private static int sparseSearchHelper(String[] s, String target, int low, int high)
	{
		if(low>high) return -1;
		int mid = (low+high)/2;
		
		//if mid is empty, search for both side for a non empty string
		if(s[mid] =="")
		{
			int left= mid-1;
			int right= mid+1;
			
			while(true)
			{
				//the indexes go out of bounds, (has only empty strings)
				if(left<low && right>high)
					return -1;
				if(left>=low && s[left]!="")
				{
					mid= left;
					break;
				}
				else if(right<= high && s[right]!="")
				{
					mid= right;
					break;
				}
				left++;
				right--;
			}
		}
		//Continue with normal binary search
		if(s[mid]==target)
			return mid;
		else if(target.compareTo(s[mid]) >=0)
			return sparseSearchHelper(s, target, mid+1, high);
		else 
			return sparseSearchHelper(s, target, low, mid-1);
	}
	public static void main(String[] args) {
		String[] s= {"for", "geeks", "", "", "", "", "ide",  
                "practice", "", "", "", "quiz"}; 
		String target= "quiz";
		System.out.println(sparseSearch(s, target));
	}
}
