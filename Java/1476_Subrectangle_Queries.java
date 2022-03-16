
class SubrectangleQueries {

    private List<List<Integer>> arr = new ArrayList<>();
    public SubrectangleQueries(int[][] rectangle) {
        
        for(int i = 0; i < rectangle.length; i++){
            List<Integer> item = new ArrayList<>();
            for(int j = 0; j < rectangle[i].length; j++){
                item.add(rectangle[i][j]);
            }
            arr.add(item);
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                arr.get(i).set(j, newValue);
            }
        }
    }
    
    public int getValue(int row, int col) {
        return arr.get(row).get(col);
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
