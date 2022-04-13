class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean firstRowIsZero = false;
        for(int j = 0; j < c; j++){
            if(matrix[0][j] == 0){
                firstRowIsZero = true;
            }
        }
        for(int i = 1; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    //System.out.println(i);
                    //System.out.println(j);
                }
            }
        }
        for(int i = 1; i < r; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < c; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 0; j < c; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < r; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstRowIsZero){
            for(int j = 0; j < c; j++){
                matrix[0][j] = 0;
            }
        }
        
    }
}
/*
0 1 2 0
0 4 5 0
0 3 1 0
class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
*/
