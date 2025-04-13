class Solution {
    public String intToRoman(int num) {
        LinkedHashMap<Integer,String> m=new LinkedHashMap<>();
        StringBuilder ans=new StringBuilder();
        m.put(1000,"M");
        m.put(900,"CM");
        m.put(500,"D");
        m.put(400,"CD");
        m.put(100,"C");
        m.put(90,"XC");
        m.put(50,"L");
        m.put(40,"XL");
        m.put(10,"X");
        m.put(9,"IX");
        m.put(5,"V");
        m.put(4,"IV");
        m.put(1,"I");
        for(Map.Entry<Integer,String>ele : m.entrySet()){
            while(ele.getKey() <= num){
                ans.append(ele.getValue());
                num=num - ele.getKey();
            }
        }
        return ans.toString();
    }
}