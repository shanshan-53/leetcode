public class Solution {
    public int LargestAltitude(int[] gain) {
        int highest = 0;//Int32.MinValue;
        int a = 0;
        foreach(int i in gain){
            a += i;
            highest = Math.Max(highest, a);
        }
        return highest;
    }
}
