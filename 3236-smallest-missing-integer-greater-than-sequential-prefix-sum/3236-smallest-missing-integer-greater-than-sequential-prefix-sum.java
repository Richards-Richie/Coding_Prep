class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int lastIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],i);
        }
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        if(!m.containsKey(sum)){
            return sum;
        }else{
            while(m.containsKey(sum)){
                sum++;
            }
            return sum;
        }
    }
}