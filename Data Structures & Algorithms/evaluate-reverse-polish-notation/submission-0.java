class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String x : tokens){
            if (x.equals("+")){
                int right = stack.pop();
                int left = stack.pop();
                int sum = left + right;
                stack.push(sum);
            }else if (x.equals("-")){
                int right = stack.pop();
                int left = stack.pop();
                int sum = left - right;
                stack.push(sum);
            } else if (x.equals("*")){
                int right = stack.pop();
                int left = stack.pop();
                int sum = left * right;
                stack.push(sum);
            }else if (x.equals("/")){
                int right = stack.pop();
                int left = stack.pop();
                int sum = left / right;
                stack.push(sum);
            } else stack.push(Integer.parseInt(x));
        }
        return stack.pop();
    }
}
