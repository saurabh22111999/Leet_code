class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        cnt = 0
        while n != 0 :
            cnt += 1
            n = n & n-1 # unsets the right most set bit.
           
        return cnt
        