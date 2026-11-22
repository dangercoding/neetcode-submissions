class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left=0;
        int high=0;

        for(int d:weights){
            left= Math.max(left,d);
            high=high+d;
        }

        while(left<high){
                
                int mid= left+(high-left)/2;
                if(canShip(weights,days,mid)){
                    high=mid;
                }else{
                    left=mid+1;
                }

        }

        return left;


       
    }
     boolean canShip(int[] weights, int days,int capacity){

            int daysTaken=1;
            int current=0;

            for(int dr:weights){

                if(current+dr>capacity){
                    daysTaken++;
                    current=0;
                }
                current+=dr;
            }

            return daysTaken<=days;
        }
}