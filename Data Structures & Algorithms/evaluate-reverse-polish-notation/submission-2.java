class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b); //top-bottom
            }
            else if(token.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b); // top/bottom
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

/**
 * stack numbers in a stack
 * when an operator appears (+ - * /)
 * perform the operation on the 2 top numbers in the stack, or
 * on the current result
 */