class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<List<Integer>> allList = new ArrayList<>();
        for(int i = m-1; i >= 0; i--){
            List<Integer> list = new ArrayList<>();
            for(int j = i, k = 0; j < m && k < n; j++, k++){
                list.add(mat[j][k]);
            }
            allList.add(list);
        }
        
        for(int i = 1; i < n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0, k = i; j < m && k < n; j++, k++){
                list.add(mat[j][k]);
            }
            allList.add(list);
        }
        
        for(int i = 0; i < allList.size(); i++){
            Collections.sort(allList.get(i));
        }
        
        int[][] result = new int[m][n];
        int x = m-1;
        int y = 0;
        for(int i = 0; i < m; i++){
            List<Integer> list = allList.get(i);
            x = m-1 - i;
            y = 0;
            for(int j = 0; j < list.size(); j++){
                result[x][y] = list.get(j);
                if(x >= m || y >= n){
                    break;
                }
                x++;
                y++;  
            }
        }
        
        for(int i = m; i < m+n-1; i++){
            List<Integer> list = new ArrayList(allList.get(i));
            x = 0;
            y = i-m+1;
            for(int j = 0; j < list.size(); j++){
                result[x][y] = list.get(j);
                if(x >= m || y >= n){
                    break;
                }
                x++;
                y++;
            }
        }
        return result;
    }
}
