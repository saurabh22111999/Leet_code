class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=0
        right=0
        charset=set()
        maxi=0
        if len(s)==0:
            return 0
        
        for i in s:
            while i in charset:
                
                charset.remove(s[l])
                l=l+1
            charset.add(i)
            maxi=max(maxi,right-l+1)
            right+=1
        return maxi
            
        