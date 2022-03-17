class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] lengths = new int[rectangles.length];
        int result = 0;
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0; i < rectangles.length; i++){
            lengths[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            if(lengths[i] > largest){
                result = 1;
                largest = lengths[i];
            }
            else if(lengths[i] == largest){
                result++;
            }
        }
        return result;
    }
}
