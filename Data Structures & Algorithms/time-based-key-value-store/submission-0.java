class TimeMap {

    public Map<String,Map<Integer,String>> data;

    public TimeMap() {

        data= new TreeMap<String,Map<Integer,String>>();
        
    }
    
    public void set(String key, String value, int timestamp) {

        if(data.containsKey(key)){
            data.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp,value);
        }else{
             Map<Integer, String> pp = new TreeMap<>(Map.of(timestamp, value));
            data.put(key, pp);
        }
        
    }
    
    public String get(String key, int timestamp) {

         if (!data.containsKey(key)) {
        return "";
         }

          Map<Integer,String> valueMap= data.get(key);

           List<Integer> keys = new ArrayList<>(valueMap.keySet());
              //floorKey
            int low=0;
            int high= valueMap.size()-1;

            while(low<=high){
                int mid = low+(high-low)/2;

                if(keys.get(mid)==timestamp)
                  return valueMap.get(keys.get(mid));
            

            if(keys.get(mid)<timestamp)
              {
                low= mid+1;
              }else{
                high=mid-1;
              }
        }  

       if (high < 0) {
        return "";
       }

        return valueMap.get(keys.get(high));
        
    }
}
