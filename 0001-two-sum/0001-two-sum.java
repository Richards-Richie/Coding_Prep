class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int ans[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(m.containsKey(diff) && m.get(diff)!=i){
                ans[0]=i;
                ans[1]=m.get(diff);
                return ans;
            }
        }
        return ans;
    }
}