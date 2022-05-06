class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        def isInside(x1, y1, x, y, r):
            return (x1-x) * (x1-x) + (y1-y)*(y1-y) <= r*r
        
        result = []
        for x, y, r in queries:
            t = 0
            for x1, y1 in points:
                if isInside(x1, y1, x, y, r):
                    t += 1
            result.append(t)
        
        return result
        
        """
        result = [0] * len(queries)
        
        for i in range(0, len(queries)):
            for p in points:
                if (p[0] - queries[i][0]) * (p[0] - queries[i][0]) + (p[1] - queries[i][1]) * (p[1] - queries[i][1]) <= (queries[i][2]) * (queries[i][2]) :
                    result[i] = result[i] + 1
                    
        return result
        """
                    
