class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer>stack= new Stack();
        int maxRect=0;

        for(int i=0;i<heights.length;i++){
            int currentHeight=heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height= heights[stack.pop()];
                int width = stack.isEmpty()? i : i-stack.peek()-1;
                int area=height*width;
                maxRect= Math.max(maxRect,area);
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){

             int height= heights[stack.pop()];
             int width = stack.isEmpty()
                ? heights.length
                : heights.length - stack.peek() - 1;

                maxRect= Math.max(maxRect,(height*width)); 
        }

        return maxRect;
        
    }
}
