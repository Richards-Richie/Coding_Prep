class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cur=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                cur+=1;
                ans=Math.max(cur,ans);
            }else{
                cur=0;
            }
        }
        return ans;
    }
}