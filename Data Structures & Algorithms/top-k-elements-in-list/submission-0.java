class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer>map= new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                 map.put(nums[i],1);
            }
        }

        List<Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int n=k-1;
        int []res= new int[k];
        while(n>=0){
                
            Map.Entry<Integer, Integer> entry = list.get(n);
            Integer key = entry.getKey();
            Integer value = entry.getValue();
             
             res[n]=key;
            n--;

        }

     return res;
        
    }
}
