class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
       
        li=[]
    
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i]==nums[i-1] and i>0:continue
            elif nums[i]>0:
                break
            else:
                l=i+1
                r=len(nums)-1
                while l<r:
                    s=nums[i]+nums[l]+nums[r]
                    if s>0:
                        r-=1
                    elif s<0:
                        l+=1
                    else:
                        li.append([nums[i],nums[l],nums[r]])
                        while l<r and nums[l]==nums[l+1]:
                            l+=1
                        while l<r and nums[r]==nums[r-1]:
                            r-=1
                        l+=1;r-=1
                
                    
                  
                    
                        
        return li
                
        