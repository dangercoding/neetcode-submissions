class Solution {
      
      public boolean match(int a[], int b[]){

        for(int i=0;i<26;i++){

            if(a[i]!=b[i]){
                return false;
            }
        }

        return true;
      }

    public boolean checkInclusion(String s1, String s2) {

         if (s1.length() > s2.length()) {
            return false;
        }

        int[] sc = new int[26];
        int[] window = new int[26];

       for(int i=0;i<s1.length();i++){

        sc[s1.charAt(i)-'a']++;
        window[s2.charAt(i)-'a']++;
       }

       if(match(sc,window)){
        return true;
       }

       for(int i= s1.length();i<s2.length();i++){

        window[s2.charAt(i)-'a']++;
         window[s2.charAt(i - s1.length()) - 'a']--;

        if(match(sc,window)){
        return true;
       }

       }

       return false;
        
    }
}
