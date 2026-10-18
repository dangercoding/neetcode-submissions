class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        if(nums.length==1) return 1;

        int [] res= new int [nums.length];
             Arrays.sort(nums);
             int count=1;
               int k=0;
              res[k]=nums[0];

              int rk=0;
        for(int i=1;i<nums.length;i++){

            if((nums[i]-res[k])==1){
                k=i;
            res[k]=nums[i];
            count++;
            }
            else if((nums[i]-res[k])==0){}
             else{
              rk= rk>count?rk:count;
                 count=1;
                  k=0;
              res[k]=nums[i];
             }
        }

        return  rk>count?rk:count;
        
    }
}
