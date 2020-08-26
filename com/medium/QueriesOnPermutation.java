package com.medium;

import java.util.ArrayList;
import java.util.List;

public class QueriesOnPermutation {
    public int[] processQueries(int[] queries, int m)
    {
        /*Adding all the elements in a List so that our operations become easier */
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<m; i++)
            list.add(i+1);
        List<Integer> res= new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            int pos = list.indexOf(queries[i]);
            res.add(pos);
            list.remove(queries[i]);
            list.add(0,queries[i]);

        }
        int[] r= new int[res.size()];
        for(int i=0; i<res.size(); i++)
            r[i]=res.get(i);
        return r;
    }
}