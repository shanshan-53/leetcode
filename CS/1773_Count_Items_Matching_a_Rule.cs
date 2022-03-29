public class Solution {
    public int CountMatches(IList<IList<string>> items, string ruleKey, string ruleValue) {
        Dictionary<string, int> dic = new Dictionary<string, int>();
        dic.Add("type", 0);
        dic.Add("color", 1);
        dic.Add("name", 2);
        int result = 0;
        for(int i = 0; i < items.Count; i++){
            if(items[i][dic[ruleKey]] == ruleValue){
                result++;
            }
        }
        return result;
    }
}
