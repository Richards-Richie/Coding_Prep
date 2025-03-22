class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []ans=new int[2];
        Arrays.fill(ans,-1);
        if( n == 0){
            return ans;
        }
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                ans[0]=i;
                for(int j=i;j<n;j++){
                    if(nums[j]!=target){
                        ans[1]=j-1;
                        return ans;
                    }
                    else if(j == n-1){
                        ans[1]=j;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}