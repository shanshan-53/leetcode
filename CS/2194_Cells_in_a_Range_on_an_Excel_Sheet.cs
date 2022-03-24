public class Solution {
    public IList<string> CellsInRange(string s) {
        IList<string> result = new List<string>();
        
        string[] item = s.Split(":");
        string start = item[0];
        string end = item[1];
        
        /*
        char sc = start[0];
        char ec = end[0];
        Console.WriteLine(start.Substring(1, start.Length-1));
        */
        char sc = start[0];
        int si = Int32.Parse(start.Substring(1, start.Length-1));
        
        char ec = end[0];
        int ei = Int32.Parse(end.Substring(1, end.Length-1));
        
        int temp = si;
        
        while(sc <= ec){
            while(temp <= ei){
                result.Add(sc + (temp + ""));
                temp++;
            }
            sc++;
            temp = si;
        }
        
        return result;
    }
}
