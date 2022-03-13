public class Solution {
    public int[] PivotArray(int[] nums, int pivot) {
        var listL = new List<int>();
        var listE = new List<int>();
        var listR = new List<int>();
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] > pivot){
                listR.Add(nums[i]);
            }
            else if(nums[i] < pivot){
                listL.Add(nums[i]);
            }
            else{
                listE.Add(nums[i]);
            }
        }
        listL.AddRange(listE);
        listL.AddRange(listR);
        return listL.ToArray();
        /*
        int[] result = new int[nums.Length];
        int countL = 0;
        int countE = 0;
        int countR = 0;
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] > pivot){
                countR++;
            }
            else if(nums[i] < pivot){
                countL++;
            }
            else{
                countE++;
            }
        }
        
        int indexL = 0;
        int indexE = countL;
        int indexR = countL + countE;
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] > pivot){
                result[indexR] = nums[i];
                indexR++;
            }
            else if(nums[i] < pivot){
                result[indexL] = nums[i];
                indexL++;
            }
            else{
                result[indexE] = nums[i];
                indexE++;
            }
        }
        
        return result;
        */
    }
}
