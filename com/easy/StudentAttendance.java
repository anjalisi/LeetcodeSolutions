package com.easy;

public class StudentAttendance {
    public boolean checkRecord(String s) 
    {
    	char[] charArray = s.toCharArray();
        int absentCount = 0;
        for (char c : charArray) {
            if (c == 'A')
                absentCount++;
            if (absentCount > 1)
                return false;
        }
        for (int i = 0; i < charArray.length - 2; i++) {
            if (charArray[i] == 'L') {
                if ((charArray[i] == charArray[i + 1]) && (charArray[i + 1] == charArray[i + 2])) {
                    return false;
                }
            }
        }
        return true;  
    }
}
