class Solution {
    public int reverse(int x) {
        int temp=x;
        int ans=0;
        if(temp<0){
            temp=temp*-1;
        }
        while(temp>0){
            int rem=temp%10;
            
            if(ans < Integer.MIN_VALUE/10 || ans== Integer.MIN_VALUE/10 && rem > -8 ){
                return 0;
            }
            if(ans > Integer.MAX_VALUE/10 || ans == Integer.MAX_VALUE/10 && rem > 7){
                return 0;
            }

            ans=rem+ans*10;
            temp=temp/10;
        }
        if(x<0){
            return ans*-1;
        }
        return ans;
    }
}