class Solution {
    public int reverse(int x) {
        int ans=0;
        
     for(int i=0;x!=0;i++){
        int temp=x%10;
        if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
            return 0;
        }
        ans=ans*10+temp;

        x=x/10;
     }   
     return ans;
    }
}