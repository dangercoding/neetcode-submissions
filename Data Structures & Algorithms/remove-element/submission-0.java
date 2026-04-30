class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums.length==0)
        return 0;

        List<Integer>list= new ArrayList<Integer>();

    for(int i=0;i<nums.length;i++){
         
         if(nums[i]!=val){
            list.add(nums[i]);
         }

    }
     for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }


    return list.size();

    }
}