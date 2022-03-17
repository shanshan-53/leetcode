class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList();
        int ori_max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ori_max = Math.max(ori_max, candies[i]);
        }
        for(int i = 0; i < n; i++){
            result.add((candies[i] + extraCandies >= ori_max) ? true : false);
        }
        return result;
    }
}
