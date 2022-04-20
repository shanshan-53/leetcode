class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        return [nums[nums[i]] for i in range(len(nums))]
        """
        result = [0] * len(nums)
        for i in range(len(nums)):
            result[i] = nums[nums[i]]
        return result
        """
