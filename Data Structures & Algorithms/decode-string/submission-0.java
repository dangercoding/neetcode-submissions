class Solution {
    public String decodeString(String s) {

         StringBuilder main = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        Stack<int[]> stack = new Stack<>();
        String fixCount = "";

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                fixCount = fixCount + ch;
                continue;
            }

            if (ch == '[') {
                int count = Integer.parseInt(fixCount);

                stack.push(new int[]{count, temp.length()});
                fixCount = "";
                continue;
            }

            if (ch == ']') {

                int[] sp = stack.pop();

                int count = sp[0];
                int index = sp[1];

                String result = temp.substring(index).repeat(count - 1);

                temp.replace(index, temp.length(),
                             temp.substring(index) + result);

                if (stack.isEmpty()) {
                    main.append(temp);
                    temp.setLength(0);
                }

                continue;
            }

            if (stack.isEmpty()) {
                main.append(ch);
            } else {
                temp.append(ch);
            }
        }

        return main.toString();


        
    }
}