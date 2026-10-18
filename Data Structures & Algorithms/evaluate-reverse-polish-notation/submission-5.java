

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String operator = tokens[i];

            if (operator.equals("+") || operator.equals("-") ||
                operator.equals("*") || operator.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int data;

                if (operator.equals("+")) {
                    data = a + b;
                } else if (operator.equals("-")) {
                    data = a - b;
                } else if (operator.equals("*")) {
                    data = a * b;
                } else {
                    data = a / b;
                }

                stack.push(data);

            } else {
                stack.push(Integer.valueOf(operator));
            }
        }

        return stack.pop();
    }
}
