class Solution:
    def trap(self, height: List[int]) -> int:

        maxleft=height[0]
        left=1
        maxright=height[len(height)-1]
        right=len(height)-2
        ans=0
        while left<=right:
            if maxleft<maxright:
                if maxleft<height[left]:
                    maxleft=height[left]
                else:
                    ans+=maxleft-height[left]
                left+=1
            else:
                if maxright<height[right]:
                    maxright=height[right]
                else:
                    ans+=maxright-height[right]
                right-=1
        return ans
        
            
        