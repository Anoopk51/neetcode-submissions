class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prevIndex = 0
        currentIndex = 1
        while(currentIndex < len(nums)):
            if(nums[prevIndex] != nums[currentIndex]):
                prevIndex += 1
                currentIndex += 1
            else:
                nums.pop(currentIndex)
        return len(nums)
        