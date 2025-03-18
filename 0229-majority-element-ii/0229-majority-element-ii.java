class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        LinkedHashMap<Integer,Integer> m=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : m.entrySet()){
            if(ele.getValue() > Math.floor(n/3)){
                ans.add(ele.getKey());
            }
        }
        
        return ans;
    }
}