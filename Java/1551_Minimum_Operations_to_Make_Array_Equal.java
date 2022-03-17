class Solution {
    public int minOperations(int n) {
        if(n%2 == 0){
            return n*n/2/2;
        }
        else{
            return (n-1) * ((n-1)/2+1) /2;
        }
        /*
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (2*i) + 1;
        }
        
        int result = 0;
        for(int i = 0; i < n; i++){
            result += Math.abs(arr[i] - n);
        }
        return result / 2;
        */
    }
}
/*
1 3 5 7 9 11
2         10
3          9
4          8
  4     8
5          7
  5     7
6          6
  6     6
    6 6
n = 6
1 3 5 7 9 11
5 3 1 1 3 5
(1 + 5) * ((5-1)/2+1)/2*2/2 = 6*3/2

n = 5
1 3 5 7 9
4 2 0 2 4
(0 + 4) * ((4-0)/2)+1    *2/2 = 6*2/2
(n-1) * ((n-1)/2+1) /2

1+11 /2 = 6
5 3 1 1 3 5

n= 3
1 3 5
2 0 2
(0+2)*((2-0)/2+1)
(n-1)*(n-1)/2
*/
