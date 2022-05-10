class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        result = []
        result.append(first)
        for num in encoded:
            first = first ^ num
            result.append(first)
        return result
