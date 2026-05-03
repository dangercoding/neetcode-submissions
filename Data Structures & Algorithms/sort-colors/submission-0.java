class Solution {
    public static void divide(int []arr, int left, int right){

        if(left==right)return;

        int mid= left+(right-left)/2;

         divide(arr, left,mid);
         divide(arr,mid+1,right);
         merge(arr,left,mid,right);
    }

    public static void merge(int []arr, int left,int mid,int right){

        int n1= mid-left+1;
        int n2= right-mid;
        
        int []l= new int[n1];
        int []r= new int [n2];

        for(int i=0;i<n1;i++){
            l[i]=arr[left+i];
        }

        for(int i=0;i<n2;i++){
            r[i]=arr[mid+1+i];
        }
        int i=0; int j=0; int k=left;

        while(i<n1 && j<n2){
            if(l[i]<=r[j])
              arr[left++]=l[i++];
            else
               arr[left++]=r[j++];
        }

        while(i<n1)arr[left++]=l[i++];
        while(j<n2) arr[left++]=r[j++];


    }
    public void sortColors(int[] nums) {

        divide(nums,0,nums.length-1);
        
    }
}