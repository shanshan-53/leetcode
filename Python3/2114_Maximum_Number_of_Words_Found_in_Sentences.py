class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        return max([sen.count(" ") for sen in sentences]) + 1
        """
        result = 0
        for sen in sentences:
            t = sen.count(" ") + 1
            result = max([t, result])
        return result
        """
