class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum=0
        maxsum=-math.inf
        if len(nums)==1:
            return nums[0]
        for i in nums:
            currsum=currsum+i
            if maxsum<currsum:
                maxsum=currsum
            if currsum<0:
                currsum=0
        return maxsum
        