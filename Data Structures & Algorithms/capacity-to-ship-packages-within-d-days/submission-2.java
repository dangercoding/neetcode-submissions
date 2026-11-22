class Solution {
    public int shipWithinDays(int[] weights, int days) {

    int low=0;
    int high=0;

    for(int d: weights){
        low= Math.max(low,d);
        high= high+d;
    }

    while(low<high){

        int mid= low+(high-low)/2;

        if(canShip(weights,days,mid)){
            high=mid;
        }else{
            low=mid+1;
        }
    }

    return low;
        
    }

    boolean canShip(int[] weights, int days, int weight){

        int dCurrent=1;
        int currentW=0;
        for(int d:weights){

            if(currentW+d>weight){
                dCurrent++;
                currentW=0;
            }
            currentW+=d;
        }
        return dCurrent<=days;
    }
}