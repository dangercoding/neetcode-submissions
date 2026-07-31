class Solution {
    public int calPoints(String[] operations) {

        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;

        int a=0;

        while (i < operations.length) {
            String con = operations[i];
            switch(con){
             case "C":
                    int lastIndex = list.size() - 1;
                    sum -= list.get(lastIndex);
                    list.remove(lastIndex);
                    break;

                case "D":
                    int last = list.get(list.size() - 1);
                    int doubled = last * 2;
                    list.add(doubled);
                    sum += doubled;
                    break;

                case "+":
                    int last1 = list.get(list.size() - 1);
                    int last2 = list.get(list.size() - 2);

                    int s = last1 + last2;
                    list.add(s);
                    sum += s;
                    break;

                default:
                    int number = Integer.parseInt(con);
                    list.add(number);
                    sum += number;
                    break;
            }

            i++;
        }

        return sum;
    }
}