class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        val = 0
        ans = []
        if len(digits) == 0:
            return val+1
        for i in range(len(digits)):
            val = val*10+digits[i]
        val+=1
        while val > 0:
            temp = val % 10
            val = val // 10
            ans.insert(0,temp)
        return ans

        
        
        