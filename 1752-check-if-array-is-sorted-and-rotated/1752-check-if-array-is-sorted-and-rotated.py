class Solution:
    def check(self, nums: List[int]) -> bool:
        rpos = -1
        for i in range(len(nums)-1):
            if nums[i]>nums[i+1]:
                rpos = i+1
                break
        if rpos == -1 :
            return True
        else : 
            for i in range(len(nums)-1):
                if nums[(i+rpos)%len(nums)] > nums[((i+rpos)+1)%len(nums)]:
                    return False
            return True
            
        