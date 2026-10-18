class StockSpanner {

    Stack<Integer>stack;

    public StockSpanner() {
        stack= new Stack();
    }
    
    public int next(int price) {

        if(stack.isEmpty()){

            stack.push(price);
            return 1;
        }else{
              int st= stack.peek();
            if(st>price){
                stack.push(price);
                return 1;
            }else{
                int p=0;
                Stack<Integer> temp = new Stack();
                while(!stack.isEmpty()){
                      int s=stack.peek();
                      if(s<=price){
                      p=p+1;
                      temp.push(s);
                      stack.pop();
                      }   else{
                        break;
                      }      
                }

                while(!temp.isEmpty()){
                      int d=temp.peek();
                      stack.push(d);
                      temp.pop();       
                }

                stack.push(price);

                return p+1;
            }

        }
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */