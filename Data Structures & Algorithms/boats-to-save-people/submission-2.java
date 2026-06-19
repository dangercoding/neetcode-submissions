class Solution {
    public int numRescueBoats(int[] people, int limit) {


        Arrays.sort(people);

        int start=0;
        int end= people.length-1;
        int boat=0;
        while(start<end){
            if(people[end]==limit){
                 boat++;
                 end--;
                 continue;
            }
            int max= people[start]+people[end];
            if(max<=limit){
               boat++;
               start++;
               end--;
            }
            else{
                end--;
                boat++;
            }
        }
        if(start==end && people[end]<=limit){
            boat++;
        }
        return boat;
        
    }
}