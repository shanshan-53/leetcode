public class Solution {
    public string DestCity(IList<IList<string>> paths) {
        string result = "";
        HashSet<string> se = new HashSet<string>();
        for(int i = 0; i < paths.Count; i++){
            se.Add(paths[i][0]);
        }
        for(int i = 0; i < paths.Count; i++){
            if(!se.Contains(paths[i][1])){
            //if(se.Add(paths[i][1])){
                result = paths[i][1];
                break;
            }
        }
        return result;
    }
}
