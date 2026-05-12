class Solution {

    public int subarraySum(int[] nums, int k) {
     
     int prefix=0;
     int count=0;
     Map<Integer,Integer>map= new HashMap<Integer,Integer>();
      map.put(0,1);
     for(int i=0;i<nums.length;i++){
         prefix=prefix+nums[i];
         int val= prefix-k;
         if(map.containsKey(val)){
           count += map.get(val);
         }
         map.put(prefix, map.getOrDefault(prefix, 0) + 1);

     }

     return count;
     
    }
}