class Solution {
    public int firstMissingPositive(int[] nums) {

        int size= nums.length;

        boolean isOne=false;

        for(int i=0;i<size;i++){

            if(nums[i]==1)
                isOne=true;
            if(nums[i]<=0 || nums[i]>size){
                nums[i]=1;
            }
        }

        if(isOne==false){
            return 1;
        }

        for(int i=0;i<size;i++){

            int data= Math.abs(nums[i]);;
            int idx= data-1;
            if(nums[idx]<0) continue;
            nums[idx]= nums[idx]*(-1);
        }

        for(int i=0;i<size;i++){
            if(nums[i]>0)
               return i+1;
        }

        return size+1;
        
    }
}