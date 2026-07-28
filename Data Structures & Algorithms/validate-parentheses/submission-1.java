class Solution {
    public boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();
        char[] chars = s.toCharArray();
        pStack.add(chars[0]);
        for(int i=1;i<chars.length;i++){
            char c = chars[i];
            if(pStack.empty()){
                pStack.add(c);
            }else{
            if(pStack.peek()=='(' && c==')'){
                pStack.pop();
            }
            else if(pStack.peek()=='[' && c==']'){
                pStack.pop();
            }else if(pStack.peek()=='{' && c=='}'){
                pStack.pop();
            }else{
                pStack.add(c);
            }
        }
        }
        return pStack.isEmpty();
    }
}

/**
 * stack each element (,[,{ or ),],} on top of each other
 * if a closure is formed, eg (), remove both
 */