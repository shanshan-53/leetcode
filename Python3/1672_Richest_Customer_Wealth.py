class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        return max([sum(account) for account in accounts])
        """
        t = 0;
        result = 0;
        for account in accounts:
            t = 0
            for w in account:
                t += w
            if t > result:
                result = t
        return result
        """
