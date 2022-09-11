class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lmin = prices[0]
        pro = 0
        for i in prices[1:]:
            if i <= lmin:
                lmin = i
            elif i-lmin > pro:
                pro = i-lmin        
        return pro
                
        