public class Solution {
    public IList<IList<int>> GroupThePeople(int[] groupSizes) {
        IList<IList<int>> result = new List<IList<int>>();
        Dictionary<int, List<int>> dic = new Dictionary<int, List<int>>();
        for(int i = 0; i < groupSizes.Length; i++){
            if(!dic.ContainsKey(groupSizes[i])){
                List<int> item = new List<int>();
                item.Add(i);
                dic.Add(groupSizes[i], item);
            }
            else{
                dic[groupSizes[i]].Add(i);
            }
            
            if(dic[groupSizes[i]].Count == groupSizes[i]){
                result.Add(dic[groupSizes[i]]);
                dic.Remove(groupSizes[i]);
            }    
        }

        return result;
    }
}
