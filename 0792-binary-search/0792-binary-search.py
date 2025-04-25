class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low=0
        n=len(nums)
        high=n-1
        while low<=high:
            mid=(low+high)/2
            if nums[mid]==target:
                return mid
            elif nums[mid]<target:
                low=mid+1
            elif nums[mid]>target:
                high=mid-1
        return -1
        