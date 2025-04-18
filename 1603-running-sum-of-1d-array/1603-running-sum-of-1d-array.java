class Solution {
    public int[] runningSum(int[] nums) {
        int prevsum=0;
        int n=nums.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                prevsum = nums[i];
                nums[i]=prevsum;
            }else{
                prevsum=prevsum+nums[i];
                nums[i]=prevsum;
            }
        }
        return nums;
    }
}