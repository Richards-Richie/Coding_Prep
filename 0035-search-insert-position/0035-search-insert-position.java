class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int n=nums.length;
        int end=n-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(nums[start] >= target){
            return start;
        }
        return start+1;
    }
}