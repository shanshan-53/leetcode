class Solution {
public:
    int minOperations(int n) {
        return n%2 == 0 ? (1 + n/2) * (n/2) - n/2 : (1 + n/2) * (n/2);
        // return n * n / 4;
        // return n%2 == 0 ? (1 + n/2) * (n/2) * 2 / 2 - n/2 : (1 + n/2) * (n/2) * 2 / 2;
    }
};
/*
1 0   0
2 1   1
3 2   1
4 4   2
5 6   2
6 9   3
7 12  3
8 16  4
9 20  4
*/
