class Solution(object):
    def moveZeroes(self, nums):
        r=0
        l=0
        while r<len(nums):
            if nums[r]!=0:
                temp=0
                temp=nums[l]
                nums[l]=nums[r]
                nums[r]=temp
                l+=1
            r+=1
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        