class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxsum=0;
        int sum=0;
        int start=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[start]);
                sum-=nums[start];
                start++;
            }
            s.add(nums[i]);
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}