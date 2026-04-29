class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0 || strs==null ) return "";

        StringBuilder st= new StringBuilder();
          int it=0;
          String first= strs[0];
        while(it<first.length()){
            Character ch= first.charAt(it);
            for(int j=1;j<strs.length;j++){
                if(it >= strs[j].length() || strs[j].charAt(it) != ch){
                    return st.toString();
                   

                }
            }
            
                   st.append(ch);
                
            it=it+1;
        }

        return st.toString();
        
    }
}