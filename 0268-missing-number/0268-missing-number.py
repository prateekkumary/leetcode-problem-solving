class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum=0
        actualSum=0
        for i in nums:
            sum+=i
        actualSum=len(nums)*(len(nums)+1)/2

        return actualSum-sum