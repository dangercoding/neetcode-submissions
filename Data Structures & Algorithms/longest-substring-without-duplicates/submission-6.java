class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character>set= new HashSet<Character>();
        int count=0;
        int max=0;

        if(s.equals(" "))
        return 1;

        for(int i=0;i<s.length();i++){
            set.clear();

            for(int j=i;j<s.length();j++){

                if(set.contains(s.charAt(j))){
                        break;   
                }
                
                    set.add(s.charAt(j));
                    count=set.size();
                max = Math.max(max, set.size());
            }
        }

        return max;
        
    }
}
