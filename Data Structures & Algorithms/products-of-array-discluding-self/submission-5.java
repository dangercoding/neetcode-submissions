class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product=1;
        int size=nums.length;
          int zero=0;
        int []res= new int[size];

        for(int i=0;i<size;i++){

            if(nums[i]==0){
                product= product*1;
                zero=zero+1;
            }

            else {product= product*nums[i];}
        }

        for(int i=0;i<size;i++){
            
            if(zero>1){
                res[i]= 0;
            }else{

            if(nums[i]==0 && zero>0){
                res[i]=(product);
            }

            else{res[i]= zero>0?0:(product/nums[i]);}

            }
        }

        return res;
        
    }
}  
