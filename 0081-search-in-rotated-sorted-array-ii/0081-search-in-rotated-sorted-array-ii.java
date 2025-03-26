class Solution {
    public boolean search(int[] nums, int target) {
        int p=pivot(nums);
        int n=nums.length-1;
        if( p!=-1 ){
            if( target >= nums[p] && target <= nums[n] ){
                return Bsearch(nums,p,n,target);
            }else{
                return Bsearch(nums,0,p-1,target);
            }
        }else{
            return Bsearch(nums,0,n,target);
        }
        
    }
    public boolean Bsearch(int []nums,int start,int end,int target){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public int pivot(int []nums){
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}