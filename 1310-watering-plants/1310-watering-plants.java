class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int curcapacity=capacity;
        int n=plants.length;
        int steps=0;
        for(int i=0;i<n;i++){
            if(plants[i] > curcapacity){
                steps+=2*i;
                steps+=1;
                curcapacity = capacity-plants[i];
            }else{
                steps+=1;
                curcapacity-=plants[i];
            }
        }
        return steps;
    }
}