class Solution {
    public int findMin(int[] nums) {
        int piv=pivot(nums);
        if(piv == -1){
            return nums[0];
        }else{
            Arrays.sort(nums);
            return nums[0];
        }
    }
    public int pivot(int []nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        return -1;
    }
}