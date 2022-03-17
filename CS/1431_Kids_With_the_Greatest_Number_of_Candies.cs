public class Solution {
    public IList<bool> KidsWithCandies(int[] candies, int extraCandies) {
        int max = Int32.MinValue;
        for(int i = 0; i < candies.Length; i++){
            max = Math.Max(max, candies[i]);
        }
        IList<bool> result = new List<bool>();
        for(int i = 0; i < candies.Length; i++){
            if(candies[i] + extraCandies >= max){
                result.Add(true);
            }
            else{
                result.Add(false);
            }
        }
        return result;
    }
}
