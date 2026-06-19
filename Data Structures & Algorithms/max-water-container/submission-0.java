class Solution {
    public int maxArea(int[] heights) {

        int maxWater=0;
          int start=0;
          int end= heights.length-1;

        while(start<end){

            int height= Math.min(heights[start],heights[end]);
            int base= end-start;
            int currentWater= height*base;

            if(currentWater>maxWater){
              maxWater=currentWater;
            }

            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }
        }

        return maxWater;
        
    }
}
