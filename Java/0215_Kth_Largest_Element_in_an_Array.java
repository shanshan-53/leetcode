class Solution {
    //int[] sortedArray;
    public int findKthLargest(int[] nums, int k) {
        //this.sortedArray = nums;

        Arrays.sort(nums);
        /*
        //quick sort
        quickSort(0, nums.length - 1);
        */
        
        int result = nums[nums.length-k];;
        
        return result;
    }
    /*
    private void quickSort(int left, int right){
        if(left >= right){
            return;
        }
        
        int key = sortedArray[left];
        int i = left;
        int j = right;
        
        while(i != j){
            while(sortedArray[j] > key && i < j){
                j--;
            }
            while(sortedArray[i] <= key && i < j){
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
        
        quickSort(left, i-1);
        quickSort(i+1, right);
    }
    */
}
