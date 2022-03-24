class Solution {
    public List<String> cellsInRange(String s) {
        char startX = s.charAt(0);
        char startY = s.charAt(1);
        char endX = s.charAt(3);
        char endY = s.charAt(4);
        
        List<String> result = new ArrayList<>();
        char X = startX;
        char Y = startY;
        while(X <= endX){
            while(Y <= endY){
                String item = (X + "")+(Y+"");
                result.add(item);
                Y++;
            }
            X++;
            Y = startY;
        }
        return result;
    }
}
