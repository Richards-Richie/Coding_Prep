class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet <Integer>s=new TreeSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(Integer a : s){
            nums[j]=a;
            j++;
        }
        return j;

    }
}