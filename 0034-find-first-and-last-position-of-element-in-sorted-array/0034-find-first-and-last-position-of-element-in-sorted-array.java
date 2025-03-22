class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int n=nums.length;
        int right=n-1;
        int []ans={-1,-1};


        if(n == 0){
            return ans;
        }


        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if( left >= n || nums[left] != target){
            return ans;
        }
        ans[0]=left;
        right=n-1;
        while(left <= right){
            int mid=(left+right)/2;
            if(nums[mid] <= target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        ans[1]=right;
        return ans;
    }
}