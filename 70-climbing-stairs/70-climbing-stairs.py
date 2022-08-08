
class Solution:
    
    def climbStairs(self, n: int) -> int:
        dic={}
        def Stairs(n):
            if n==1: return 1
            if n==0: return 1
            if n in dic:
                return dic[n]
            dic[n]=Stairs(n-1)+Stairs(n-2)
            return dic[n]
        return (Stairs(n))
    
        