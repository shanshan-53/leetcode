class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(check(i))
                result.add(i);
        }
        return result;
    }
    private boolean check(int i){
        boolean f = true;
        int d = i;
        while(d > 0){
            if(d%10 == 0 || i % (d%10) != 0){
                f = false;
                break;
            }
            d /= 10;
        }
        return f;
    }
}
