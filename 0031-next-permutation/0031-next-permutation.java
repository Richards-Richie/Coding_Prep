class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int bp=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                bp=i;
                break;
            }
        }
        if(bp == -1){
            Arrays.sort(nums);
            return;
        }else{
            for(int i=n-1;i>bp;i--){
            if(nums[bp] < nums[i]){
                int temp=nums[i];
                nums[i]=nums[bp];
                nums[bp]=temp;
                break;
            }
            Arrays.sort(nums,bp+1,n-1);
        }
        
        }
    }
}