class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int start=0;
        int end= numbers.length-1;

        while(start<end){

              int data= numbers[start]+numbers[end];
               if(data==target && (numbers[start]!=numbers[end])){
                return new int[]{start+1,end+1};
               }
            
            if(data>target){
                end--;
            }
            else{
                start++;
            }

           
        }

         return new int[]{start+1,end+1};
        
    }
}
