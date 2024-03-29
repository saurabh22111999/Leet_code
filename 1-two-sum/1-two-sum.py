class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic={}
        for i,value in enumerate(nums):
            remaining=target-nums[i]
            if remaining in dic:
                return [i,dic[remaining]]
            else:
                dic[value]=i