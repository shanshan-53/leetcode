class Solution {
    boolean[] t;
    int result = 0;
    Set<String> s = new HashSet<String>();
    public int numTilePossibilities(String tiles) {
        t = new boolean[tiles.length()];
        backtracking(tiles, new StringBuilder(""));
        /*
        for(int i = 0; i < tiles.length(); i++){
            t[i] = true;
            backtracking(tiles, tiles.charAt(i) + "");
            t[i] = false;
        }
        */
        return s.size();
    }
    private void backtracking(String tiles, StringBuilder str){
        if(str.length() != 0){
            s.add(str.toString());    
            //System.out.println(str.toString());
        }
        for(int i = 0; i < t.length; i++){
            if(t[i] == false){
                t[i] = true;
                str.append(tiles.charAt(i));
                backtracking(tiles, str);
                t[i] = false;
                str.deleteCharAt(str.length()-1);
            }
        }
    }
}
