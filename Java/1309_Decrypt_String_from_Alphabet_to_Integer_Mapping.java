class Solution {
    public String freqAlphabets(String s) {
        String[] t = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                     "10#", "11#", "12#", "13#", "14#", "15#", "16#", "17#",
                     "18#", "19#", "20#", "21#", "22#", "23#", "24#", "25#",
                      "26#"};
        for(int i = t.length-1; i >= 0; i--){
            s = s.replace(t[i], (char) (i + 'a') +"");
        }
        
        return s;
    }
}
