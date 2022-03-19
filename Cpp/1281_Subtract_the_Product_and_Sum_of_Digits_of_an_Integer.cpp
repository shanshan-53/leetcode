class Solution {
public:
    int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        int temp;
        while(n > 0){
            temp = n%10;
            p *= temp;
            s += temp;
            n /= 10;
        }
        return p - s;
    }
};
