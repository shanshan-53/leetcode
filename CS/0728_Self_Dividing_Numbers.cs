public class Solution {
    public IList<int> SelfDividingNumbers(int left, int right) {
        IList<int> result = new List<int>();
        for(int i = left; i <= right; i++){
            if(check(i)){
                result.Add(i);
            }
        }
        return result;
    }
    private bool check(int n){
        int d = n;
        while(d > 0){
            if(d%10 != 0 && n % (d%10) == 0){
                d /= 10;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
