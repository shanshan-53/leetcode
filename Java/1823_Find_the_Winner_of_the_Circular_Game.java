class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        //System.out.println(list);
        int temp = k;
        while(list.size() > 1){
            temp %= list.size();
            temp = temp == 0 ? list.size(): temp; 
            list.remove(temp-1);
            temp = temp-1 + k;
            //System.out.println(list);
        }
        return list.get(0);
    }
}
