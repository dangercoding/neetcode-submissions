class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int data : asteroids) {
            boolean alive = true;

            while (alive && data < 0 && !stack.isEmpty() && stack.peek() > 0) {

                int filled = stack.peek();

                if (filled == Math.abs(data)) {
                    stack.pop();
                    alive = false;
                } else if (filled < Math.abs(data)) {
                    stack.pop();
                } else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(data);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}