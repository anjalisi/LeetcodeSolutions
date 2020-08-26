package com.medium;
import java.util.ArrayList;
import java.util.List;
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result= new ArrayList<>();
        getAllCombinations(result, 1, n, k, new ArrayList<>());
        return result;
    }

    private void getAllCombinations(List<List<Integer>> result, int index, int n, int k, List<Integer> subset)
    {
        if(subset.size()==k)
        {
            result.add(new ArrayList<>(subset));
            return;
        }
        for(int i=index; i<= n; i++)
        {
            subset.add(i);
            getAllCombinations(result, i+1, n, k, subset);
            subset.remove(subset.size()-1);
        }
    }
}