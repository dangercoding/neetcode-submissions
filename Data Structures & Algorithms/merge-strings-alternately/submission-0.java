class Solution {
    public String mergeAlternately(String word1, String word2) {

        

        int i=0;
        int n1= word1.length();
        int n2= word2.length();
        StringBuilder res= new StringBuilder(n1+n2);

        while(i<n1 && i<n2){

            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }

        while(i<n1){
            res.append(word1.charAt(i));
            i++;
        }
         while(i<n2){
            res.append(word2.charAt(i));
            i++;
        }

        return res.toString();

        
    }
}