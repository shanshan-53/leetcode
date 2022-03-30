public class Solution {
    public string FreqAlphabets(string s) {
        string[] t = {"1", "2", "3", "4" ,"5", "6", "7", "8", "9",
                     "10#", "11#", "12#", "13#", "14#", "15#", "16#",
                     "17#", "18#", "19#", "20#", "21#", "22#", "23#",
                     "24#", "25#", "26#"};
        for(int i = 25; i >= 0; i--){
            s = s.Replace(t[i], (char)('a'+i) +"");
        }
        return s;
    }
}
/*

public class Solution {
    public string FreqAlphabets(string s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < s.Length){
            if((i+2 < s.Length) && (s[i+2] == '#')){
                int d = Convert.ToInt32($"{s[i]}{s[i+1]}") - 10;
                //int d = Convert.ToInt32(s.Substring(i, 2)) - 10;
                //int d = (s[i]-'0')*10 + (s[i+1]-'0') - 10;
                result.Append(Convert.ToChar('j' + d));
                //result.Append((char)('j' + d));
                i += 3;
            }
            else{
                int d = Convert.ToInt32($"{s[i]}") - 1;
                //int d = Convert.ToInt32(s.Substring(i, 1)) - 1;
                //int d = (s[i]-'1');
                result.Append(Convert.ToChar('a' + d));
                //result.Append((char)('a' + d));
                i += 1;
            }
        }
        return result.ToString();
    }
}

*/
