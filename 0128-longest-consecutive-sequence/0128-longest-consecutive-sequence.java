class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n == 0){
            return 0;
        }
        int maxi=0;

        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }

        for(int num:s){
            if(!s.contains(num-1)){
                int cur=num;
                int count=1;
                while(s.contains(cur+1)){
                    cur=cur+1;
                    count+=1;
                }
                maxi=Math.max(count,maxi);
            }
        }
        return maxi;

    }
}