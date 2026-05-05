

class Solution {

    private static int base = 1;

    public String encode(List<String> strs) {
       
         StringBuilder p = new StringBuilder();

         for(String s:strs){

            p.append(s.length()).append("#").append(s);
         }

         return p.toString();
            
    }

    public List<String> decode(String str) {
         List<String> raw = new ArrayList<>();

         int i=0;
         while(i<str.length()){

            int j=i;
            while(str.charAt(j)!= '#'){
                j++;
            }

            int size= Integer.parseInt(str.substring(i,j));
             j++;
              String word= str.substring(j,j+size);
              raw.add(word);
              i=j+size;

         }

         return raw;
        
    }
}