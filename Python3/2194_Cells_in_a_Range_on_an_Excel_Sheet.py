class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        result = []
        sc, ec = s[0], s[3]
        si, ei = int(s[1]), int(s[4])
        i = si
        while(ord(sc) <= ord(ec)):
            while(i <= ei):
                result.append(sc + str(i))
                i += 1
            i = si
            sc = chr(ord(sc) + 1)
            
        return result
