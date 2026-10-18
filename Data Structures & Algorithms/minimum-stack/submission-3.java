class MinStack {

    int min=0;
    Stack<Integer>stack;
    Stack<Integer>stackTemp;


    public MinStack() {

        stack= new Stack();
        stackTemp= new Stack();
        
    }
    
    public void push(int val) {

        if(stack.isEmpty()){
            min=val;
        }

        if(val<=min){
          min=val;
        }

        stack.push(val);
        
    }
    
    public void pop() {
          int p= stack.pop();

          if(p>min){}
          else{
              
           while(!stack.isEmpty()){
                min=stack.peek();
                int s= stack.pop();
                stackTemp.push(s);
           }

                while(!stackTemp.isEmpty()){
            
                int s= stackTemp.pop();
                 if(s<=min){
                    min=s;
                }
                stack.push(s);
           }


          }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {

        return min;
        
    }
}
