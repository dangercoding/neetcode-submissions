class Solution {
    public String simplifyPath(String path) {


        Stack<String>stack= new Stack();

        String [] parts = path.split("/");

        for(String data : parts){

            if(data.equals("")||data.equals(".")){
                continue;
            }

            if(data.equals("..")){

                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(data);
            }
        }

        StringBuilder str= new StringBuilder();

        for(String s:stack){

            str.append("/").append(s);
        }

        if(str.length()==0){
            return "/";
        }

        return str.toString();
        
    }
}