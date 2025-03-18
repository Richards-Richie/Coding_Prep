class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count1==0 & ele2!=nums[i]){
                count1=1;
                ele1=nums[i];
            }else if(count2 == 0 && ele1!=nums[i]){
                count2=1;
                ele2=nums[i];
            }else if(ele1==nums[i]){
                count1++;
            }else if(ele2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ele1 == nums[i])count1++;
            if(ele2 == nums[i])count2++;
        }
        if(count1 > (n/3)){
            ans.add(ele1);
            
        }
        if(count2 > (n/3)){
            ans.add(ele2);
        }
        return ans;
    }
}