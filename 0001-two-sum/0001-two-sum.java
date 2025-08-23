class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=m.get(target-nums[i]);
                return ans;
            }
        }
        return ans;
    }
}