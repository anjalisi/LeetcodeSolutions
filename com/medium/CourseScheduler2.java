package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduler2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result= new ArrayList<>();
        //First we need to construct a map from the courses and prerequisite
        HashMap<Integer, List<Integer>> map= buildMap(numCourses, prerequisites);
        //We need to find how many dependencies are there on each course
        int[] inDegree= buildIndegree(numCourses, prerequisites);
        //Doing BFS on all the courses which have 0 dependency (no prerequisite required)
        Queue<Integer> queue= new LinkedList<>();
        //Add all the courses with no dependencies or prerequisites to the queue
        for(int i=0; i<numCourses; i++)
        {
            if(inDegree[i]==0)
            {
                queue.add(i);
                result.add(i);
            }    
        }
 
        int count=0;

        while(!queue.isEmpty())
        {
            int curr= queue.poll();
            count++;
            for(int n: map.get(curr))
            {
                inDegree[n]--;
                if(inDegree[n]==0)
                {
                    queue.add(n);
                    result.add(n);
                }
            }
        }

        int[] res = new int[result.size()];
        for(int i=0; i<res.length; i++)
            res[i]= result.get(i);

        return count==numCourses? res: new int[0];
    }

    private int[] buildIndegree(int numCourses, int[][] prerequisites) 
    {
        int[] inDegree= new int[numCourses];
        for(int[] arr: prerequisites){
            //Adding the number of dependencies on the course
            inDegree[arr[0]]++;
        }
        return inDegree;
    }

    private HashMap<Integer, List<Integer>> buildMap(int numCourses, int[][] prerequisites) 
    {
        HashMap<Integer, List<Integer>> map= new HashMap<>();
        for(int i=0; i<numCourses; i++)
            map.put(i,new ArrayList<>());
        //Building the graph
        for(int[] arr: prerequisites)
        {
            int dependentCourse= arr[0];
            int independentCourse= arr[1];
            //Get the list for the independent course
            List<Integer> list= map.get(independentCourse);
            list.add(dependentCourse);
            map.put(independentCourse, list);
        }
        return map;
    }
}