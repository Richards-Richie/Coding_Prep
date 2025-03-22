class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []ans=new int[2];
        Arrays.fill(ans,-1);
        boolean boolval=false;
        for(int i=0;i<n;i++){
            if(nums[i] == target && boolval==false){
                ans[0]=i;
                boolval=true;
            }else if(nums[i]!=target && boolval == true){
                ans[1]=i-1;
                return ans;
            }
            if(boolval == true && i == n-1){
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}