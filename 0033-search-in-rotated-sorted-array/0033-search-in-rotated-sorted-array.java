class Solution {
    public int search(int[] nums, int target) {
        int p=pivot(nums);
        if(p!=-1){
            if(target >= nums[0]){
                return bSearch(nums,target,0,p-1);
            }else{
                return bSearch(nums,target,p,nums.length-1);
            }
        }
        return bSearch(nums,target,0,nums.length-1);
    }
    public int pivot(int []nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }
    public int bSearch(int[] nums,int t,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(nums[mid] == t){
                return mid;
            }
            else if(nums[mid] > t){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}