class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        m = max(candies)
        for i in range(0, len(candies)):
            if candies[i] + extraCandies >= m:
                result.append(True);
            else:
                result.append(False);
        return result
