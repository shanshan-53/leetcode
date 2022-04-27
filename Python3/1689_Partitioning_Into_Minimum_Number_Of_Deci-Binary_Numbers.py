class Solution:
    def minPartitions(self, n: str) -> int:
        # return max(n) 
        # return int(max(list(n)))
        result = '0'
        for i in range(0, len(n)):
            result = max([result, n[i]])
        return result
