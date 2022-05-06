class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        copy = sorted(nums)
        dic = {}
        for i in range(0, len(copy)):
            if (copy[i] not in dic):
                dic[copy[i]] = i
        
        result = []
        for num in nums:
            result.append(dic[num])
        
        return result
        
        """
        result = []
        for num1 in nums:
            temp = 0
            for num2 in nums:
                if (num1 > num2):
                    temp += 1
            result.append(temp)
        return result
        """
