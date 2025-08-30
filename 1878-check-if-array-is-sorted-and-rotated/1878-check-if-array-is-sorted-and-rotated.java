class Solution {
    // public boolean check(int[] nums) {
    //     int k=checkBreakPoint(nums);
    //     if(k >= 0){
    //         k=k%nums.length;
    //         int []rotated=new int[nums.length];
    //         for(int i=0;i<nums.length;i++){
    //             rotated[(i+k)%nums.length]=nums[i];
    //         }
    //         for(int i=0;i<nums.length-1;i++){
    //             if(rotated[i] > rotated[i+1]){
    //                 return false;
    //             }
    //         }
    //     }else{
    //         for(int i=0;i<nums.length-1;i++){
    //             if(nums[i] > nums[i+1]){
    //                 return false;
    //             }
    //         }
    //     }
        
        
    //     return true;
    // }
    // public int checkBreakPoint(int[] nums){
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i] > nums[i+1]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public boolean check(int[] nums){
    //     int count=0;
    //     int n=nums.length;
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i] > nums[i+1]){
    //             count++;
    //         }
    //     }
    //     if(nums[n-1] > nums[0]){
    //         count++;
    //     }
    //     if(count <= 1){
    //         return true;
    //     }else{
    //         return false;
    //     }

    // }

        public boolean check(int []nums){
            int count=0;
            int n=nums.length;
            for(int i = 0;i<n-1;i++){
                if(nums[i] > nums[i+1]){
                    count++;
                }
            }
            if(nums[n-1] > nums[0]){
                count++;
            }
            if(count <= 1){
                return true;
            }else{
                return false;
            }
        }
    
}