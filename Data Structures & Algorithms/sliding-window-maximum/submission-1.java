class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // test cases accecpted for all in neetcode
        //but not in leetcode
        // time complexity O(n*k)
        // need to optimise  to O(n)
        int n= nums.length;
        int result[]= new int [n-k+1];

        int i=0;
        int j= i+k-1;
        

        int p=0;

        while(j<n){
           int max = Integer.MIN_VALUE;
               int m=i;
            while(m<=j){
                max= Math.max(max,nums[m]);
                m++;
            }
            result[p]=max;
            p++;
            i++;
            j++;
        }


        return result;
        
    }
}
