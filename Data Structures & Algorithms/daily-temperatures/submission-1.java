class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int [] result= new int [temperatures.length];

        Stack<Integer>stack= new Stack();

        for(int i=0;i<temperatures.length;i++){

            if(stack.isEmpty()){
                stack.push(i);
                result[i]=0;
            }
            else{
                int sIndex= stack.peek();
                    int data= temperatures[sIndex];
                    if(temperatures[i]<data){
                        stack.push(i);
                        result[i]=0;
                    }
                    else{

                    while(!stack.isEmpty()){
                    int sIndexp= stack.peek();
                    int datap= temperatures[sIndexp];
                    if(temperatures[i]>datap){
                        result[sIndexp]=i-sIndexp;
                        stack.pop();
                    }else{
                        break;
                    }
                }
                stack.push(i);
                    result[i]=0;
                    }  
            }
            
        }

        return result;
        
    }
}
