class Solution:
    def maxArea(self, height: List[int]) -> int:
        j=len(height)-1
        maxwater=float('-inf')
        j=len(height)-1
        i=0
        while(j>i):
            if maxwater<((min(height[i],height[j]))*(j-i)):
                maxwater=(min(height[i],height[j]))*(j-i)
            if height[j]<height[i]:
                j-=1
            else:
                i+=1
                
        return maxwater
                
            
        