class Solution(object):
    def isPowerOfThree(self, n):
        if(n<=0):
            return False
        return 1162261467%n==0
        """
        :type n: int
        :rtype: bool
        """
        