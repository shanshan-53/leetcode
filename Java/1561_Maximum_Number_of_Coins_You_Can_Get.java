class Solution {
    int[] sortedArray;
    public int maxCoins(int[] piles) {
        int result = 0;
        sortedArray = piles;
        
        Arrays.sort(sortedArray);
        for(int i = sortedArray.length - 2; i >= sortedArray.length/3 ; i-=2){
            result += sortedArray[i];
            //System.out.println(sortedArray[i]);
        }
        
        /*
        //quick sort
        quicksort(0, piles.length-1);
        
        for(int i = 1; i < sortedArray.length*2/3; i+=2){
            result += sortedArray[i];
            //System.out.println(sortedArray[i]);
        }
        */
        return result;
    }
    /*
    private void quicksort(int left, int right){
        if(left >= right){
            return;
        }
        int key = sortedArray[left];
        int i = left;
        int j = right;
        while(i != j){
            while(sortedArray[j] < key  && i<j){
                j--;
            }
            while(sortedArray[i] >= key && i<j){
                i++;
            }
            if(j > i){
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[j];
                sortedArray[j] = temp;
            }
        }
        sortedArray[left] = sortedArray[i];
        sortedArray[i] = key;
        
        quicksort(left, i-1);
        quicksort(i+1, right);
    }
    */
}
