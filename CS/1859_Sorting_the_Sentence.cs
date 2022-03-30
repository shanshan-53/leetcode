public class Solution {
    public string SortSentence(string s) {
        string[] sArray = s.Split(" ");
        int n = sArray.Length;
        string[] rArray = new string[n];
        for(int i = 0; i < n; i++){
            string item = sArray[i];
            int k = item.Length;
            //Console.WriteLine(item[k-1]='1');
            rArray[item[k-1] - '1'] = item.Substring(0, k-1);
        }
        return String.Join(" ", rArray);
        /*
        string result = rArray[0];
        for(int i = 1; i < n; i++){
            result += " " + rArray[i];
        }
        return result;
        */
    }
}
