class Solution {
    public void rotate(int[] nums, int k) {

    //    int i= nums.length-1;
    //    int val=nums[i];
    //    while(i>=0 && k>=1){
    //        if(i==0){
    //         nums[i]= val;
    //         val=nums[nums.length-1];
    //         k--;
    //         i= nums.length-1;
    //        }
    //       else{ nums[i]=nums[i-1];
    //        i--;
    //       }        
    //    }    

    int left=0;
    int right=nums.length-1;

    while(left<right){
        int temp = nums[right];
        nums[right]=nums[left];
        nums[left]=temp;
        left++;
        right--;
    }
    k=k%(nums.length);
    int i=0;
    int j=k-1;
    while(i<j){
       int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        i++;
        j--; 
    }

     i=k;
     j=nums.length-1;
    while(i<j){
       int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        i++;
        j--; 

    }

    }
}