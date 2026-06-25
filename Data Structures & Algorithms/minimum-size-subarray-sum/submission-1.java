class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l=0;
        int r=0;
        int minL=0;
         int sum=0;
        while(r<nums.length){

             sum+= nums[r];
            if(sum<target){
                 r++;
            }else{
               
               while(sum>=target){
                  if(minL==0){
                    minL=(r-l)+1;
                  }else{
                    minL=Math.min((r-l+1),minL);
                  }    
                  sum=sum-nums[l];
                  l++;

               }
               r++;
            }
        }

        return minL;
        
    }
}