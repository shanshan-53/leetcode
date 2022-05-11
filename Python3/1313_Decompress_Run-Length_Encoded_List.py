class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        result = []
        for i in range(0, len(nums), 2):
            freq = nums[i]
            val = nums[i+1]
            result += [val] * freq
            #result.extend([val] * freq)
        return result
        """
        result = []
        i = 0
        while i < len(nums):
            freq = nums[i]
            val = nums[i+1]
            while freq > 0 :
                result.append(val)
                freq -= 1
            i += 2
        return result
        """
