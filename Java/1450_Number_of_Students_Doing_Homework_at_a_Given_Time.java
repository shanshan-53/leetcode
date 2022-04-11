class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for(int i = 0; i < startTime.length; i++){
            result += (queryTime >= startTime[i] && queryTime <= endTime[i]) ? 1 : 0;
        }
        return result;
    }
}
