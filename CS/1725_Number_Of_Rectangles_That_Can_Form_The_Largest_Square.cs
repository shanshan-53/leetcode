public class Solution {
    public int CountGoodRectangles(int[][] rectangles) {
        int result = 0;
        int temp = 0;
        var dic = new Dictionary<int, int>();
        foreach(var rectangle in rectangles){
            int i = Math.Min(rectangle[0], rectangle[1]);
            if(!dic.ContainsKey(i)){
                dic.Add(i, 0);
            }
            dic[i] += 1;
            if(temp <= i){
                temp = i;
                result = dic[i];
            }
        }
        
        return result;
    }
}
