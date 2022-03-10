class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        int n = seats.length;
        for(int i = 0; i < n; i++){
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}
