class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Stack<Double>stack=new Stack();
        int size=position.length;

        Integer cars[]= new Integer[size];

        for(int i=0;i<size;i++){
            cars[i]=i;
        }
        Arrays.sort(cars, (a, b) -> position[b] - position[a]);
        
        for(int car:cars){
            
            double time = (double) (target - position[car])/speed[car];
            
            if(stack.isEmpty()){
                stack.push(time);
            }
            else{

                double top= stack.peek();

                if(time>top){
                    stack.push(time);
                }
            }
            
        }

        return stack.size();

        
    }
}
