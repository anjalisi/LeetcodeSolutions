    package com.challenge;

public class LargestTimeforGivenDigits
{
    int max=-1;
    public String largestTimeFromDigits(int[] A) {
        /*
        MAIN IDEA
        1. We need to find all the 4! or 24 permmutations of the array, and find the max correct time which can be  build
        2. To find the max, we will keep updating it after every permutation, and then return the max.
        */
        dfs(A,0);
        return max==-1?"":String.format("%02d:%02d",max/60, max%60);
    }
    private void dfs(int[] a, int start)
    {
        if(start==a.length){
            makeTime(a);
            return;
        }
        for(int i=start; i<a.length; i++){
            //Making a decision
            swap(a, i, start);
            //Choosing 
            dfs(a, start+1);
            //Undo-ing the decision
            swap(a, i, start);
        }
    }
    private void swap(int[] a, int i, int j) {
        if(i==j)
        return;
        else {
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    private void makeTime(int[] a) {
        //Building the time from the array generated
        int hours = a[0]*10 + a[1];
        int mins = a[2]*10 + a[3];
        //Making the checks if it is a valid time
        if(hours<24 && mins<60){
            max= Math.max(max, hours*60+mins);
        }
    }
}