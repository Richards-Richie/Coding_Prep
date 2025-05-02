class Solution {
    public int[] decrypt(int[] nums, int k) {
        int n=nums.length;
        int []ans=new int[n];
        if(k < 0){
            for(int i=0;i<n;i++){
                ans[i] = findprevsum(nums,i-1,-k);
            }
            return ans;
        }
        else if(k > 0){
            for(int i=0;i<n;i++){
                ans[i]=findnextsum(nums,i+1,k);
            }
            return ans;
        }else{
            Arrays.fill(nums,0);
            return nums;
        }
        
    }
    public int findnextsum(int []nums,int j,int k){
       int n=nums.length;
       int e=k;
       int sum=0;
       int i=j;
       while(e > 0){
            if( i == n){
                i=0;
            }
            sum+=nums[i];
            i++;
            e--;
       }
        return sum;
    }
    public int findprevsum(int []nums,int j,int k){
        int n=nums.length;
        int e=k;
        int sum=0;
        int i=j;
        while(e > 0){
            if( i == -1 ){
                i=n-1;
            }
            int index=i;
            sum+=nums[index];
            i--;
            e--;
        }
        return sum;
    }
}