package com.medium;

import java.util.HashMap;
import java.util.Map;

public class Kdiff {
    public int findPairs(int[] nums, int k) {
    	if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums) {
            if (map.containsKey(i)) {
                if (k == 0 && map.get(i) == 1) {
                    map.put(i, map.get(i) + 1);
                    res++;
                }
                continue;
            }
            res += map.getOrDefault(i + k, 0);
            res += map.getOrDefault(i - k, 0);
            map.put(i, 1);
        }
        return res;
    }
}
