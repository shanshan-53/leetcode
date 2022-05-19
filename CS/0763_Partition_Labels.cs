public class Solution {
    public IList<int> PartitionLabels(string s) {
        IList<int> result = new List<int>();
        Dictionary<char, int> d = new Dictionary<char, int>();
        for(int i = 0; i < s.Length; i++){
            d[s[i]] = i;
        }
        int x = 0;
        int y = 0;
        for(; x < s.Length; x++){
            y = d[s[x]];
            for(int i = x; i <= y; i++){
                if(d[s[i]] > y){
                    y = d[s[i]];
                }
            }
            result.Add(y-x+1);
            x = y;
        }
        return result;
    }
}
/*
public class Solution {
    public IList<int> PartitionLabels(string s) {
        IList<int> result = new List<int>();
        Dictionary<char, int> start = new Dictionary<char, int>();
        Dictionary<char, int> end = new Dictionary<char, int>();
        for(int i = 0; i < s.Length; i++){
            if(!start.ContainsKey(s[i])){
                start[s[i]] = i;
                end[s[i]] = i;
            }
            else{
                end[s[i]] = i;
            }
        }
        int x = 0;
        int y = 0;
        for(int i = 0; i < s.Length; i++){
            x = start[s[i]];
            y = end[s[i]];
            for(int j = x; j <= y; j++){
                if(end[s[j]] > y){
                    y = end[s[j]];
                }
            }
            result.Add(y-x+1);
            i = y;
        }
        return result;
    }
}
/*
a b c 
0 1 4
8 5 6
*/
