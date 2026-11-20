class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;
         int right = 0;

        for (int p : piles) {
            right = Math.max(right, p);
        }

        int mini = right;

        while(left<=right){
            int mid= left+(right-left)/2;

            long temp=0;

            for(int i=0;i<piles.length;i++){

                     temp += ((long)piles[i] + mid - 1) / mid;
            }
               
            if(temp<=h){
                mini=mid;

                right=mid-1;
            }else{
              left=mid+1;
            }
        }


        return mini;
        
    }
}
