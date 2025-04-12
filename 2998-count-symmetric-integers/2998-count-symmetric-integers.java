class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<high+1;i++){
            int temp=i;
            String ans="";
            while(temp > 0){
                int temp1=temp%10;
                temp=temp/10;
                ans=ans+temp1;
            }
            if(ans.length() % 2 == 0){
                int n=ans.length();
                int digitsum1=0;
                int digitsum2=0;
                for(int j=0;j<n/2;j++){
                    digitsum1+=Integer.parseInt(ans.charAt(j)+"");
                }
                for(int j=n/2;j<n;j++){
                    digitsum2+=Integer.parseInt(ans.charAt(j)+"");
                }
                if(digitsum1 == digitsum2){
                    count++;
                }
            }
        }
        return count;
    }
}