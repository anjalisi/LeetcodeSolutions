package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RObber {
	public int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums2) {
            if (map.containsKey(num))
                set.add(num);
        }
        int[] resultArray = new int[set.size()];
        int cntr = 0;
        for (int num : set) {
            resultArray[cntr++] = num;
        }
        return resultArray;
		
    }
	
}
