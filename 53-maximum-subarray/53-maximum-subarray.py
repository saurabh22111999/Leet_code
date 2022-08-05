class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum=0
        maxsum=-math.inf
        for i in nums:
            currsum=currsum+i
            maxsum=max(maxsum,currsum)
            if currsum<0:
                currsum=0
        return maxsum
        