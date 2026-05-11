class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer>map= new HashMap<>();

        List<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){

               map.put(nums[i],1); 
            }
            else{
                Integer val= map.get(nums[i]);

                map.put(nums[i],val+1);
            }
        }

        for(Map.Entry<Integer,Integer>sp: map.entrySet() ){
              Integer val= sp.getValue();
              Integer key= sp.getKey();
            if(val>(nums.length/3)){
                list.add(key);
            }
        }

        return list;
    }
}