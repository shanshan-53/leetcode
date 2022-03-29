public class Solution {
    public int Maximum69Number (int num) {
        int temp = num;
        int i = 1;
        int target = 0;
        while(temp > 0){
            if(temp % 10 == 6){
                target = i;
            }
            i *= 10;
            temp /= 10;
        }
        return num + 3*target;
    }
}
