class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=n/2;
        int ele=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count == 0){
                ele=nums[i];
                count++;
            }else if(ele == nums[i]){
                count++;
                if(count > a){
                    return ele;
                }
            }else{
                count--;
            }
        }
        count =0;
        for(int i=0;i<n;i++){
            if(ele == nums[i]){
                count++;
                if(count > a){
                    return ele;
                }
            }
        }
        return -1;
    }
}