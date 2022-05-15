class Solution {
    public int countVowelStrings(int n) {
        //return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
        int[] temp = new int[]{1, 0, 0, 0, 0};
        int result = 0;
        for(int i = 0; i < n; i++){
            result = 0;
            for(int j = 0; j < 5; j++){
                result += temp[j] * (5-j);
                if(j>0)
                    temp[j] += temp[j-1];
            }
            //System.out.println(result);
        }
        return result;
    }
}
/*
5
1*5 + 0*4 + 0*3 + 0*2 + 0*1
15
1*5 + 1*4 + 1*3 + 1*2 + 1*1
35
1*5 + 2*4 + 3*3 + 4*2 + 5*1
70
1*5 + 3*4 + 6*3 + 10*2 + 15*1
126
1*5 + 4*4 + 10*3 + 20*2 + 35*1
210 
1*5 + 5*4 + 15*3 + 35*2 + 70*1
*/
