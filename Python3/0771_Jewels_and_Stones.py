class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        result = 0
        for s in stones:
            if s in jewels:
                result+=1
        return result
