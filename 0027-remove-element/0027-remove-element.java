class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count = n;
        for(int i=0;i<n;i++){
            if(nums[i] == val ){
                nums[i] = 101;
                count-=1;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}