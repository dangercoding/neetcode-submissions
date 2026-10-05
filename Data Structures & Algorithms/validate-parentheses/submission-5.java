class Solution {
    public boolean isValid(String s) {

        Deque<Character>stack= new ArrayDeque<Character>();

        char[] sh = s.toCharArray();

       if(sh.length==0||sh.length==1) return false;

        for(char sp:sh){
             
             if(sp=='(' || sp== '{' || sp=='['){
                stack.push(sp);
             }
             else{
                 if(stack.isEmpty())
                  return false;
                  else{
                char k= stack.peek();
                char re;
                 
                 if(k=='(')
                   re=')';
                   else if( k== '{')
                    re='}';
                    else  re =']';

                    if(sp!=re)
                      {
                        return false;
                      }
                      else{
                        stack.pop();
                        continue;
                      }
             }
             }
        }
if(stack.size()>0){
    return false;
}else{
        return true;
}
        
    }
}
