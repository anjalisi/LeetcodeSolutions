package com.medium;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumwithMultiplicity {
    public static int threeSumMulti(int[] A, int target) 
    {
    	Map<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;
            
            for (int j = 0; j < i; j++) {
                int temp = A[i] + A[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return res;
//    	if(A==null|| A.length==0) return 0;
//    	//Make a hashmap to store the key with their frequency
//    	HashMap<List<Integer>, Integer> map= new HashMap<List<Integer>, Integer>();
//    	
//    	int res=0;
//    	
//    	for(int i=0; i<A.length-2; i++)
//    	{
//    		int temp= A[i];
//    		int left= i+1;
//    		int right= A.length-1;
//    		while(left < right)
//    		{
////    			System.out.println("andar"+left+right);
//    			int sum=temp+A[left]+A[right];
//    			if(sum==target)
//    			{
//    				res += map.getOrDefault(new ArrayList<>(Arrays.asList(temp, A[left], A[right])),0);
//    				left++;
//    				right--;
//    			}
//    			else if(target < sum)
//    				right--;
//    			else
//    				left++;
//    		}
//    	}
//    	return res;
    }
    public static void main(String[] args) {
		int[] A= {1,1,2,2,3,3,4,4,5,5};
		int target= 8;
		System.out.println(threeSumMulti(A, target));
	}
}
