class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int p=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]< nums[i-1]){
                p=i;
                break;
            }
        }
        if(p!=-1){
            for(int i=0;i<n;i++){
                if(nums[(i+p)%n] == target){
                    return (i+p)%n;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(nums[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
}