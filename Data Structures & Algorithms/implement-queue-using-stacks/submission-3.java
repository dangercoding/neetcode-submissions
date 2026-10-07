class MyQueue {

    Stack<Integer>q1;
    Stack<Integer>q2;

    public MyQueue() {
        q1= new Stack();
        q2= new Stack();
    }
    
    public void push(int x) {

      q1.push(x);
        
    }
    
    public int pop() {

        int result;
        while(q1.size()>1){
            q2.push(q1.pop());
        }
          result = q1.pop();

         while(!q2.isEmpty()){
            q1.push(q2.pop());
         }
         return result;
        
    }
    
    public int peek() {
        
        while (q1.size() > 1) {
            q2.push(q1.pop());
        }

        int result = q1.peek();

        while (!q2.isEmpty()) {
            q1.push(q2.pop());
        }

        return result;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */