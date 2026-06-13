class Solution {

    public void sortMe(int[] nums1 , int value, int start,int end){

        while(end>start){
            nums1[end]=nums1[end-1];
            end--;
        }
        nums1[start]=value;
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;int j=0;

           boolean d= m==0;

           if(d){
             while(j<n){
                nums1[j]=nums2[j];
                j++;
             }
             return;
           }

        while(i<(m+n)){
  

              if(j>=n){
                  return;
              }


            if(nums1[i]>=nums2[j]){
               sortMe(nums1,nums2[j],i,m + j);

               j++;
            }
             

            i++;
        }


        if(j<(n)){
              i = m+j;
            while(i<(m+n)){
              nums1[i]=nums2[j];
              i++;
              j++;
            }
        }
        
    }
}