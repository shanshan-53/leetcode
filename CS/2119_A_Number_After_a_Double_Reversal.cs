public class Solution {
    public bool IsSameAfterReversals(int num) {
        return num % 10 != 0 || num == 0;
    }
}
