class Solution {
    public int maxProduct(int[] nums) {
        int maxpr=0;
        int pr=1;
        if(nums.length == 1){
            return nums[0];
        }
        for(int ele : nums){
            pr=pr*ele;
            maxpr=Math.max(pr,maxpr);
            if(pr == 0){
                pr=1;
            }
        }
        pr=1;
        for(int i=nums.length-1;i>=0;i--){
            pr=pr*nums[i];
            maxpr=Math.max(pr,maxpr);
            if(pr == 0){
                pr=1;
            }
        }
        return maxpr;
    }
}