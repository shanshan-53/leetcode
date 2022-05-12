class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        result = ""
        for i in range(0,len(indices)):
            result += s[indices.index(i)]
        return result;
        """
        result = list(s)
        for i in range(0,len(indices)):
            while(i != indices[i]):
                index = indices[i]
                val = result[i]
                indices[i] = indices[index];
                result[i] = result[index]
                indices[index] = index
                result[index] = val
        return ''.join(result)
        """
