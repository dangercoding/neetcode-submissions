class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        if (asteroids.length == 0)
            return new int[0];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int data = asteroids[i];

            if (stack.isEmpty()) {
                stack.push(data);
            } else {
                int filled = stack.peek();
                int toBe = data;

                if ((filled < 0 && toBe < 0)
                        || (filled < 0 && toBe > 0)
                        || (filled > 0 && toBe > 0)) {
                    stack.push(data);
                } else {

                    boolean alive = true;

                    while (alive && !stack.isEmpty()
                            && stack.peek() > 0 && toBe < 0) {

                        int f = stack.peek();
                        int t = Math.abs(toBe);

                        if (f == t) {
                            stack.pop();
                            alive = false;
                        } else if (f < t) {
                            stack.pop();
                        } else {
                            alive = false;
                        }
                    }

                    if (alive) {
                        stack.push(data);
                    }
                }
            }
        }

        if (stack.isEmpty())
            return new int[0];

        int[] ss = new int[stack.size()];
        int i = stack.size() - 1;

        while (!stack.isEmpty()) {
            ss[i] = stack.pop();
            i--;
        }

        return ss;
    }
}