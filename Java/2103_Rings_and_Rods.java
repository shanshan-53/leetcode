class Solution {
    public int countPoints(String rings) {
        int result = 0;
        int n = rings.length()/2;
        boolean[][] g = new boolean[10][3];
        for(int i = 0; i < n; i++){
            char color = rings.charAt(2*i);
            int index = rings.charAt(2*i+1) - '0';
            int c = color == 'R' ? 0: color == 'G' ? 1: 2;
            g[index][c] = true;
        }
        for(int i = 0; i < 10; i++){
            if(g[i][0]&&g[i][1]&&g[i][2]){
                result++;
            }
        }
        
        /*
        String[] g = new String[10];
        for(int i = 0; i < n; i++){
            char color = rings.charAt(2*i);
            char index = rings.charAt(2*i+1);
            
            g[index-'0'] += color;
        }
        for(int i = 0; i < g.length; i++){
            if(g[i]!=null){
                if(g[i].contains("B") && g[i].contains("G") && g[i].contains("R")){
                    result++;
                }
            }
        }
        */
        return result;
    }
}
