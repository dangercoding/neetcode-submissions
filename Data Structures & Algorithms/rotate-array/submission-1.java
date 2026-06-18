class Solution {
    public void rotate(int[] nums, int k) {

       int i= nums.length-1;
       int val=nums[i];
       while(i>=0 && k>=1){
           if(i==0){
            nums[i]= val;
            val=nums[nums.length-1];
            k--;
            i= nums.length-1;
           }
          else{ nums[i]=nums[i-1];
           i--;
          }        
       }       
    }
}