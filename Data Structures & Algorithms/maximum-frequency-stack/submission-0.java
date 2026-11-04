class FreqStack {

    Map<Integer,Integer>freq;
    Map<Integer,Stack<Integer>>group;
    Integer maxF;

    public FreqStack() {
        freq= new HashMap();
        group= new HashMap();
        maxF=0;
        
    }
    
    public void push(int val) {

        int f = freq.getOrDefault(val,0)+1;
         maxF=Math.max(maxF,f);

         freq.put(val,f);

         group.putIfAbsent(f,new Stack());
         group.get(f).push(val);
        
    }
    
    public int pop() {

      int value = group.get(maxF).pop();
      freq.put(value, freq.get(value)-1);

      if(group.get(maxF).isEmpty()){
        maxF--;
      }

      return value;

        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */