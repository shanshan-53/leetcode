class Solution(object):
    def finalValueAfterOperations(self, operations):
        # return sum (1 if '+' in operation else -1 for operation in operations)
        result = 0
        for op in operations:
            if op in ["--X", "X--"]:
            #if op == "--X" or op == "X--":
                result += -1
            else:
                result += 1
        return result
        """
        :type operations: List[str]
        :rtype: int
        """
        
