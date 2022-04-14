public class Solution {
    public int MaxCoins(int[] piles) {
        int result = 0;
        //Array.Sort(piles);
        quicksort(ref piles, 0, piles.Length-1);
        //bubble sort
        /*
        for(int i = 0; i < piles.Length; i++){
            for(int j = 0; j < piles.Length-i-1; j++){
                if(piles[j] > piles[j+1]){
                    int temp = piles[j];
                    piles[j] = piles[j+1];
                    piles[j+1] = temp;
                }
            }
        }
        */
        
        int n = 0;
        for(int i = piles.Length-2; i>=0 && n < piles.Length; i-=2){
            result += piles[i];
            n += 3;
        }
        return result;
    }
    private void quicksort(ref int[] arr, int l, int r){
        if(l > r){
            return;
        }
        int key = arr[l];
        int i = l;
        int j = r;
        while(i != j){
            while(arr[j] > key && i < j){
                j--;
            }
            while(arr[i] <= key && i < j){
                i++;
            }
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[l] = arr[i];
        arr[i] = key;
        
        quicksort(ref arr, l, i-1);
        quicksort(ref arr, i+1, r);
    }
}
