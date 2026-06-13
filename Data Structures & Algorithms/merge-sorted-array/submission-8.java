class Solution {

    public void sortMe(int[] nums1 , int value, int start,int end){

        while(end>start){
            nums1[end]=nums1[end-1];
            end--;
        }
        nums1[start]=value;
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // working code
        // int i=0;int j=0;

        //    boolean d= m==0;

        //    if(d){
        //      while(j<n){
        //         nums1[j]=nums2[j];
        //         j++;
        //      }
        //      return;
        //    }

        // while(i<(m+n)){
  

        //       if(j>=n){
        //           return;
        //       }


        //     if(nums1[i]>=nums2[j]){
        //        sortMe(nums1,nums2[j],i,m + j);

        //        j++;
        //     }
             

        //     i++;
        // }


        // if(j<(n)){
        //       i = m+j;
        //     while(i<(m+n)){
        //       nums1[i]=nums2[j];
        //       i++;
        //       j++;
        //     }
        // }


        // ref

        int i= m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){

            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }

            k--;

        }

        while(j>=0){
             nums1[k]=nums2[j];
             k--;
             j--;
        }
        
    }
}