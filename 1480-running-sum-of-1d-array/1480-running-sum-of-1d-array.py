class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        add=0
        summ=[]
        for i in nums:
            add+=i
            summ.append(add)
        return summ
            
            