class Solution(object):
    def hammingWeight(self, n):
        count=0
        while n!=0:
            n=n&(n-1)
            count=count+1
        return count
        """
        :type n: int
        :rtype: int
        """
        