class Solution {
    public int numberOfArrays(int[] nums, int lower, int upper) {
        long cur=0;
        long max=0;
        long min=0;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            max=Math.max(max,cur);
            min=Math.min(min,cur);
        }
        return (int) Math.max(0,(upper-lower)-(max-min)+1);
    }
}