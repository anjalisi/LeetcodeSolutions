package com.easy;

import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeeting(Interval[] intervals){
        int[] start= new int[intervals.length];
        int[] ends= new int[intervals.length];

        for(int i=0; i<intervals.length; i++){
            start[i]= intervals[i].start;
            ends[i]= intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(ends);

        for(int i=0; i<start.length; i++){
            if(start[i+1]< ends[i])
                return false;
        }
        return true;
    }
}
