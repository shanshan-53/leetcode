class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes)
        l = [0] * n
        r = [0] * n
        result = []
        ball = int(boxes[0])
        for i in range(1,n):
            l[i] = ball + l[i-1]
            ball += int(boxes[i])
        
        ball = int(boxes[n-1])
        for i in range(n-2, -1, -1):
            r[i] = ball + r[i+1]
            ball += int(boxes[i])
        
        #print(l)
        #print(r)
        for i in range(0, n):
            result.append(l[i] + r[i])
        
        return result
        """
        n = len(boxes)
        result = []
        for i in range(0, n):
            temp = 0
            for j in range(0, n):
                if boxes[j] == '1':
                    temp += abs(j-i)
            result.append(temp)
        return result
        """
    """
    110
 l  013
    100
    210
    001011
    
    0  0 1123
    0  0 0124
           1+1
            2+2
    3  3 3221
    11 8 5310
        1
       2+1
      2+3
    """
