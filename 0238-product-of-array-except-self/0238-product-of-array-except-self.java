class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int totalproduct=1;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if(nums[i]!=0){
                totalproduct*=nums[i];
            }
        }
        if(m.getOrDefault(0,0) > 1){
            Arrays.fill(nums,0);
            return nums;
        }else{
            if(m.getOrDefault(0,0) == 1){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]!=0){
                        nums[i]=0;
                    }else{
                        nums[i]=totalproduct;
                    }
                }
            }else{
                for(int i=0;i<nums.length;i++){
                    nums[i]=totalproduct/nums[i];
                }
            }
        }
        return nums;
    }
}