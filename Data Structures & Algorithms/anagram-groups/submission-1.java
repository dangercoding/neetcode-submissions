class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>map= new HashMap<>();
        int i=0;
        while(i<strs.length){

             int count=0;
              

              char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);


              if(map.containsKey(key)){
                    List<String>s=map.get(key);
                           s.add(strs[i]);
                       map.put(key,s);
                   }
                   else{
                      List<String>list= new ArrayList<>();
                      list.add(strs[i]);
                    map.put(key,list);
                   }
              i++;
        }


        List<List<String>>rs = new ArrayList<>();

        for(Map.Entry<String,List<String>> m : map.entrySet()){
             List<String>s=m.getValue();
            rs.add(s);
        }


        return rs;
    }
}
