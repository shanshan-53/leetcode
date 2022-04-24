class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        """
        x = nums[:n]
        y = nums[n:]
        ans = []
        for i in range(n):
            ans.append(x[i])
            ans.append(y[i])
        return ans
            
        """
        result = [0] * 2 * n
        i = 0
        for i in range(n):
            result[2*i] = nums[i]
            result[2*i+1] = nums[n+i]
        return result
