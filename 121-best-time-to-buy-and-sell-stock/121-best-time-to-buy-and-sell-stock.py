class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit=0
        i=0
        j=i+1
        while(j<len(prices)):
            if prices[j]-prices[i]<0:
                i=j
                
            if prices[j]-prices[i]>0:
                 if maxprofit<prices[j]-prices[i]:
                    maxprofit=prices[j]-prices[i]
            j+=1
        return maxprofit
                
        