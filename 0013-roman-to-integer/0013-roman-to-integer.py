class Solution:
    def romanToInt(self, s: str) -> int:
        m ={
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000
        }
        ans = 0
        i = 0
        while i < len(s):
            cur = m[s[i]]
            if i+1 < len(s) and cur < m[s[i+1]]:
                nextval = m[s[i+1]]
                totalval = nextval - cur
                ans+=totalval
                i+=1
            else:
                ans+=cur
            i+=1
        return ans
        